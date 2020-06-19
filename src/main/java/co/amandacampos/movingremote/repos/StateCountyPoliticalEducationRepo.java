package co.amandacampos.movingremote.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.amandacampos.movingremote.entities.StateCountyPoliticalEducation;

public interface StateCountyPoliticalEducationRepo extends JpaRepository<StateCountyPoliticalEducation, Long>{
	List<StateCountyPoliticalEducation> findByPolitical(String political);
	List<StateCountyPoliticalEducation> findByEducation(String education);


}
