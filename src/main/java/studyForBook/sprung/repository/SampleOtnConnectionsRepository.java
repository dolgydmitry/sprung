package studyForBook.sprung.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import studyForBook.sprung.model.SampleOtnConnections;

@Repository
public interface SampleOtnConnectionsRepository extends CrudRepository<SampleOtnConnections, Long> {
}
