package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andreya on 26.03.2021.
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
