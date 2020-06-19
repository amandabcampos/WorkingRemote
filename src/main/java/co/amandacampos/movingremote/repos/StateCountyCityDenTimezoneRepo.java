package co.amandacampos.movingremote.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.amandacampos.movingremote.entities.StateCountyCityDenTimezone;

public interface StateCountyCityDenTimezoneRepo extends JpaRepository<StateCountyCityDenTimezone, Long> {
	
	List<StateCountyCityDenTimezone> findByStateAndCounty(String state, String county);
	List<StateCountyCityDenTimezone> findByTimezone(String timezone);
	


}
