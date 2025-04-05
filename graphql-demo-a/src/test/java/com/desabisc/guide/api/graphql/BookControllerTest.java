package com.desabisc.guide.api.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

@GraphQlTest(BookController.class)
class BookControllerTest {

  @Autowired
  private GraphQlTester graphQlTester;

  @Test
  void can_get_books() {
    graphQlTester.documentName("books")
        .execute()
        .path("books")
        .entityList(Book.class)
        .hasSize(5);
  }
}