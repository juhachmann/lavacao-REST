package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Score;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface ScoreRepository extends CrudRepository<Score, Integer> {
}
