package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Color;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ColorRepository extends CrudRepository<Color, Integer> {
}
