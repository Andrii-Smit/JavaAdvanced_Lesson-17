package task1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import task1.domain.University;

public interface UniversityRepository extends JpaRepository<University, Long>, CrudRepository<University, Long> {
	
}
