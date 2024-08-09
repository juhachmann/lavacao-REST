package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Model;
import org.springframework.boot.Banner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ModelRepository extends CrudRepository<Model, Integer> {
}
