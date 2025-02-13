package fr.drisskaci.md_api.repository;

import fr.drisskaci.md_api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface PersonRepository extends JpaRepository<Person,Long> {
}
