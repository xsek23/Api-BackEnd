package daoAboutUs;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import model.AboutUs;
@Service
public interface AboutUsJPASpring extends JpaRepository<AboutUs, Integer>{


}
