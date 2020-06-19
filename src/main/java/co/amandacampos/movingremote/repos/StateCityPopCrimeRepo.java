package co.amandacampos.movingremote.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.amandacampos.movingremote.entities.StateCityPopCrime;
import co.amandacampos.movingremote.entities.StateCountyCityDenTimezone;

public interface StateCityPopCrimeRepo extends JpaRepository<StateCityPopCrime, Long>{
	
	List<StateCityPopCrime> findByCrime(String crime);
	
	List<StateCityPopCrime> findByPopulationGreaterThanAndPopulationLessThan(Double min, Double max);
	
	List<StateCityPopCrime> findByStateAndCity(String state, String city);
	

}
