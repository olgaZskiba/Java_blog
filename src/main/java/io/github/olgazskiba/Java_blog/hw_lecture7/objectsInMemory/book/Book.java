package io.github.olgazskiba.Java_blog.hw_lecture7.objectsInMemory.book;

/*
Функциональные требования:
Разработать класс книга Book с учетом правил инкапсуляции, который обладает следующими характеристиками:
Свойства
Автор
Название
Количество страниц
Для каждого из полей необходимо создать вспомогательные методы getter и setter
(напр. String getAuthor() и void setAuthor(String author)).
Необходимо переопределить методы equals() и toString().
Нефункциональные требования:
Продемонстрировать работу всех методов, включая переопределенные в демонстрационном классе BookDemo.
 */

import org.apache.log4j.Logger;

import java.util.Objects;

public class Book {

    Logger log = Logger.getLogger(Book.class);

    private String author;
    private String titleOfBook;
    private int numberOfPages;

    public Book() {
    }

    public Book(String author, String titleOfBook, int numberOfPages) {
        this.author = author;
        this.titleOfBook = titleOfBook;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        log.info("Author is " + this.author);
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitleOfBook() {
        log.info("Book is " + this.titleOfBook);
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;

    }

    public int getNumberOfPages() {
        log.info("Book has " + this.numberOfPages + "pages");
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(author, book.author) && Objects.equals(titleOfBook, book.titleOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, titleOfBook, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", titleOfBook='" + titleOfBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
