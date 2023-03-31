package daoContactos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import model.ContactInformation;
@Service
public interface ContactoJpaSpring extends JpaRepository<ContactInformation, Integer>{
}
