package io.github.olgazskiba.Java_blog.hw_tests_lecture3.collections.library;

import io.github.olgazskiba.Java_blog.hw_lecture3.collections.library.Book;
import io.github.olgazskiba.Java_blog.hw_lecture3.collections.library.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
    Book book1;
    Book book2;
    Book book3;
    Book book4;
    Library library = new Library();

    @BeforeEach
    public void setUp() {
        book1 = new Book("Leo Tolstoy", "War and Peace");
        book2 = new Book("Leo Tolstoy", "Anna Karenina");
        book3 = new Book("Mikhail Bulgakov", "Master and Margarita");
        book4 = new Book("Alexander Pushkin", "Eugene Onegin");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

    }

    @Test
    void addBook() {
        assertEquals(4, library.bookList.size());
    }

    @Test
    public void removeBook() {
        library.removeBook(book3);
        assertEquals(3, library.bookList.size());
    }

    @Test
    void findByName() {
        assertEquals(book3, library.findByName("Master and Margarita"));

    }

    @Test
    void findByAuthor() {
        assertEquals(2, library.findByAuthor("Leo Tolstoy").size());
    }
}