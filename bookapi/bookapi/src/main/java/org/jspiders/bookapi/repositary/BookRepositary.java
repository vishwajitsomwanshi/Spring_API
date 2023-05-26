package org.jspiders.bookapi.repositary;

import org.jspiders.bookapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositary extends JpaRepository<Book,Integer> {
}
