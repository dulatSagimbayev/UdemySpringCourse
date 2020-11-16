package springframework.first.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.first.domain.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
