package daoContactos;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;


import model.ContactInformation;

	@Repository
	public class ContactosDaoImpl implements ContactoDao {
		 @Autowired
		    private ContactoJpaSpring contacto;
		 @Override
		    public List <ContactInformation> obtenerContacto() {
		        return contacto.findAll();
	
		    }
		 

	
	}