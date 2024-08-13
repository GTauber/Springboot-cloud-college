package college.spb.cloud.project.repository;

import college.spb.cloud.project.model.entity.Client;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends R2dbcRepository<Client, Long> {

}
