package io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections.library;
import io.github.olgazskiba.Java_blog.hw_lecture3.operators.collections.library.Book;
/*Необходимо разработать систему учета книг. Нужно создать два класса: книга Book и библиотека Library.

Класс Book должен состоять из автора книги и ее названия.

Оба свойства должны быть проинициализированы в момент создания книги и изменение состояния объекта
после его создания запрещено.

Необходимо переопределить методы equals() и hashcode(), а также toString().

Класс Library должен выполнять роль хранилища книг в виде списка и выполнять следующие действия:

Добавить книгу в библиотеку
Удалить книгу из библиотеки
Найти одну книгу по названию
Вернуть все книги по автору
При создании объекта, список книг должен быть пустым, а не null.*/

import io.github.olgazskiba.Java_blog.hw_lecture3.operators.SignComparator;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    public Logger log = Logger.getLogger(SignComparator.class);

    List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
        log.info(bookList.size());
    }

    public Book findByName(String title){
       Book result = null;
        for (Book book:bookList) {
            if (book.getTitle().equals(title)){
                result = book;
            }
        }
        return result;
    }

    public List<Book> findByAuthor(String author){
         List<Book> authorsBooks = bookList.stream()
                .filter(b -> b.getAuthor().equals(author))
                .collect(Collectors.toList());
        return authorsBooks;
    }
}
