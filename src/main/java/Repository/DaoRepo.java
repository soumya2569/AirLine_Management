package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Airport;

@Repository
public interface DaoRepo extends JpaRepository<Airport ,Integer>{
	
	

}
