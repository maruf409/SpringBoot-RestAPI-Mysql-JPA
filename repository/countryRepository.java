package source.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import source.code.entity.country;

public interface countryRepository extends JpaRepository<country, Integer> {

}
