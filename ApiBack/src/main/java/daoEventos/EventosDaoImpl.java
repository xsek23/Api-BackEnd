package daoEventos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import model.Event;

@Repository
public class EventosDaoImpl implements EventosDao{
	 @Autowired
	    private EventosJpaSpring eventos;
	 @Override
	    public List <Event> obtenerEventos() {
	        return eventos.findAll();

	    }
}
