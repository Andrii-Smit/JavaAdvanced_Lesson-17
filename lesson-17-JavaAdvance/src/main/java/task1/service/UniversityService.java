package task1.service;

import java.util.List;

import task1.domain.University;

public interface UniversityService {
	University create(University university);

	University readById(Long id);

	University update(University university);

	void deleteById(Long id);

	List<University> readAll();
}
