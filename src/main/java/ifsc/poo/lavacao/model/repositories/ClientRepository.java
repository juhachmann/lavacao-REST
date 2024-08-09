package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ClientRepository extends CrudRepository<Client, Integer> {
}
