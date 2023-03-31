package daoAboutUs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.AboutUs;

@Repository
public class AboutUsDaoImpl implements AboutUsDao{
	
	@Autowired
	private AboutUsJPASpring aboutus;

	@Override
	public List<AboutUs>aboutus() {
		return aboutus.findAll();
	}
	
	

}
