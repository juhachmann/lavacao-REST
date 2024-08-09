package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.ServiceOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ServiceOrderRepository extends CrudRepository<ServiceOrder, Integer> {
}
