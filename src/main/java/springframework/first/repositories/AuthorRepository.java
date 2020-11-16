package springframework.first.repositories;

import org.springframework.data.repository.CrudRepository;
import springframework.first.domain.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
