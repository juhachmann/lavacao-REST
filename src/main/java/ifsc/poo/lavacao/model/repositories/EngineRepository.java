package ifsc.poo.lavacao.model.repositories;


import ifsc.poo.lavacao.model.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface EngineRepository extends CrudRepository<Engine, Integer> {
}
