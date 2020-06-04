package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.FlightDetails;

@Repository
public interface DaoRepoFlightDetails  extends JpaRepository<FlightDetails ,Integer>{

}
