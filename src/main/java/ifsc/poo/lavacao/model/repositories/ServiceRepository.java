package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Service;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ServiceRepository extends CrudRepository<Service, Integer> {
}
