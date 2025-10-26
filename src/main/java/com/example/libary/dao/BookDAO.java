package com.example.library.dao;
list.add(b);
}
} catch (SQLException e) {
System.err.println("Błąd podczas pobierania książek: " + e.getMessage());
}
return list;
}


public Book findById(int id) {
String sql = "SELECT id, title, author, year, quantity FROM books WHERE id = ?";
try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setInt(1, id);
try (ResultSet rs = pstmt.executeQuery()) {
if (rs.next()) {
return new Book(
rs.getInt("id"),
rs.getString("title"),
rs.getString("author"),
rs.getInt("year"),
rs.getInt("quantity")
);
}
}
} catch (SQLException e) {
System.err.println("Błąd findById: " + e.getMessage());
}
return null;
}


public void updateBook(Book book) {
String sql = "UPDATE books SET title = ?, author = ?, year = ?, quantity = ? WHERE id = ?";
try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setString(1, book.getTitle());
pstmt.setString(2, book.getAuthor());
pstmt.setInt(3, book.getYear());
pstmt.setInt(4, book.getQuantity());
pstmt.setInt(5, book.getId());
pstmt.executeUpdate();
} catch (SQLException e) {
System.err.println("Błąd podczas aktualizacji książki: " + e.getMessage());
}
}


public void deleteBook(int id) {
String sql = "DELETE FROM books WHERE id = ?";
try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setInt(1, id);
pstmt.executeUpdate();
} catch (SQLException e) {
System.err.println("Błąd podczas usuwania książki: " + e.getMessage());
}
}


public List<Book> searchByTitleOrAuthor(String term) {
List<Book> list = new ArrayList<>();
String sql = "SELECT id, title, author, year, quantity FROM books WHERE title LIKE ? OR author LIKE ?";
String like = "%" + term + "%";
try (Connection conn = Database.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
pstmt.setString(1, like);
pstmt.setString(2, like);
try (ResultSet rs = pstmt.executeQuery()) {
while (rs.next()) {
Book b = new Book(
rs.getInt("id"),
rs.getString("title"),
rs.getString("author"),
rs.getInt("year"),
rs.getInt("quantity")
);
list.add(b);
}
}
} catch (SQLException e) {
System.err.println("Błąd podczas wyszukiwania: " + e.getMessage());
}
return list;
}
}