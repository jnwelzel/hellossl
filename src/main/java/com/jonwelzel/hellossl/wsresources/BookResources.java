package com.jonwelzel.hellossl.wsresources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;

import com.jonwelzel.hellossl.xml.Book;
import com.jonwelzel.hellossl.xml.Books;
import com.jonwelzel.hellossl.xml.ObjectFactory;

@Path("/books")
public class BookResources {

  private final Logger log = Logger.getLogger(getClass());
  
  @GET
  @Produces(MediaType.TEXT_XML)
  public Books getScanFilesList() {
    log.info("Serving books list");
    return createBooks();
  }
  
  private Books createBooks() {
	  ObjectFactory objectFactory = new ObjectFactory();
	  
	  Books books = objectFactory.createBooks();
	  
	  Book book1 = objectFactory.createBook();
	  book1.setId(1L);
	  book1.setAuthor("John Grisham");
	  book1.setTitle("Who Knows?");
	  books.getBook().add(book1);
	  
	  Book book2 = objectFactory.createBook();
	  book2.setId(2L);
	  book2.setAuthor("J. R. R. Tolkien");
	  book2.setTitle("The Lord Of The Rings Fellowship Of The Ring");
	  books.getBook().add(book2);
	  
	  return books;
  }
  
}
