package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    Book book;

    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @Test
    void getAuthor() {
        String expected = null;
        String actual = book.getAuthor();
        assertEquals(expected, actual);

        book.setAuthor("Robert C. Martin");
        String expected1 = "Robert C. Martin";
        String actual1 = book.getAuthor();
        assertEquals(expected1, actual1);
    }

    @Test
    void setAuthor() {
        String expected = "Herbert Schildt";
        book.setAuthor(expected);
        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }

    @Test
    void getTitleOfBook() {
        String expected = null;
        String actual = book.getTitleOfBook();
        assertEquals(expected, actual);

        book.setTitleOfBook("Clean Code");
        String expected1 = "Clean Code";
        String actual1 = book.getTitleOfBook();
        assertEquals(expected1, actual1);
    }

    @Test
    void setTitleOfBook() {
        String expected = "Java. The Complete Reference";
        book.setTitleOfBook(expected);
        String actual = book.getTitleOfBook();
        assertEquals(expected, actual);
    }

    @Test
    void getNumberOfPages() {
        int expected = 0;
        int actual = book.getNumberOfPages();
        assertEquals(expected, actual);

        book.setNumberOfPages(464);
        int expected1 = 464;
        int actual1 = book.getNumberOfPages();
        assertEquals(expected1, actual1);
    }

    @Test
    void setNumberOfPages() {
        book.setNumberOfPages(1102);
        int expected = 1102;
        int actual = book.getNumberOfPages();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Book book1 = new Book("Robert C. Martin", "Clean Code", 464);
        Book book2 = new Book("Herbert Schildt", "Java. The Complete Reference", 1102);
        Book book3 = new Book("Robert C. Martin", "Clean Code", 464);
        Book book4 = book1;

        boolean expected = true;
        boolean actual = book1.equals(book3);
        assertEquals(expected, actual);

        assertFalse(book1.equals(book2));
        assertNotSame(book1, book2);
        assertNotSame(book1, book3);
        assertSame(book1, book4);
    }

    @Test
    void testHashCode() {
        Book book1 = new Book("Robert C. Martin", "Clean Code", 464);
        Book book2 = book1;

        int expected = -1402682467;
        int actual = book1.hashCode();
        assertEquals(expected, actual);
        int actual2 = book2.hashCode();
        assertEquals(expected, actual2);
    }

    @Test
    void testToString() {
        Book book1 = new Book("Robert C. Martin", "Clean Code", 464);
        Book book2 = book1;
        String expected = "Book{author='Robert C. Martin', titleOfBook='Clean Code', numberOfPages=464}";
        String actual = book1.toString();
        String actual2 = book2.toString();
        assertEquals(expected, actual);
        assertTrue(actual.equals(actual2));
    }
}