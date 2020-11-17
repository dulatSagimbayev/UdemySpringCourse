package springframework.first.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springframework.first.domain.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
