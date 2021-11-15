package Repostories;

import Beans.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {
        List<Book> findByAuthor(String author);
        Book findByTitle(String title);
}
