package com.lessons.springcourse.repositories;

import com.lessons.springcourse.models.Book;
import com.lessons.springcourse.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitle (String title);

    List<Book> findByTitleStartingWith(String title);

    List<Book> findByOwner (Person owner);
}
