package com.desabisc.guide.api.graphql;

import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

  public static List<Author> authorList = List.of(
      new Author(1, "Charles Dickens"),
      new Author(2, "Antoine de Saint-Exupéry"),
      new Author(3, "Paulo Coelho"),
      new Author(4, "J. K. Rowling"),
      new Author(5, "Agatha Christie")
  );

  public static Optional<Author> getAuthorById(Integer id) {
    return authorList.stream()
        .filter(author -> author.id.equals(id))
        .findFirst();
  }
}
