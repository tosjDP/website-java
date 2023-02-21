package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Venue;
import org.springframework.data.repository.CrudRepository;

public interface Clientrepository extends CrudRepository<Venue, Integer> {
}
