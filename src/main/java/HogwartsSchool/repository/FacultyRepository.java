package HogwartsSchool.repository;

import HogwartsSchool.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FacultyRepository extends JpaRepository<Student, Long> {



}
