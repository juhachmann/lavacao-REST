package ifsc.poo.lavacao.model.repositories;

import ifsc.poo.lavacao.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface VehicleRepository extends CrudRepository<Vehicle, Integer> { }
