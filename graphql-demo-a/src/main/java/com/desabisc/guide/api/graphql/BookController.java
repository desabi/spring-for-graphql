package com.desabisc.guide.api.graphql;

import java.util.List;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

  @QueryMapping
  public List<Book> books() {
    return Book.bookList;
  }
}
