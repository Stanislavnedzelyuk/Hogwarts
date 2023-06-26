package HogwartsSchool.repository;

import HogwartsSchool.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Faculty, Long> {

}
