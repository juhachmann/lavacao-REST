package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface BrandRepository  extends CrudRepository<Brand,Integer> {
}
