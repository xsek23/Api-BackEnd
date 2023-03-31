package daoEventos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import model.Event;

@Service
public interface EventosJpaSpring extends JpaRepository<Event, Integer>{

}
