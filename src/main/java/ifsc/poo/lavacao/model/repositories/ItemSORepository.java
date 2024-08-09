package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.ItemSO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ItemSORepository extends CrudRepository<ItemSO, Integer> {
}
