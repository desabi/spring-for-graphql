package com.desabisc.guide.api.graphql;

import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount) {
  public static List<Book> bookList = List.of(
      new Book(1, "A Tale of Two Cities", 560),
      new Book(2, "The Little Prince", 146),
      new Book(3, "The Alchemist", 315),
      new Book(4, "Harry Potter and the Philosopher's Stone", 290),
      new Book(5, "And Then There Were None", 472)
  );

  public static Optional<Book> getBookById(Integer id) {
    return bookList.stream()
        .filter(book -> book.id.equals(id))
        .findFirst();

    //return bookList.get(id);
  }
}
