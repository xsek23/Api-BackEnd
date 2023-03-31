package controller;



import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import daoAboutUs.AboutUsDao;
import daoContactos.ContactoDao;
import daoEventos.EventosDao;
import daoEventos.EventosJpaSpring;
import daoUsuarios.UsuarioDao;
import daoUsuarios.UsuarioJpaSpring;
import model.AboutUs;
import model.ContactInformation;
import model.Event;
import model.User;

@RestController
@RequestMapping("api")
public class Api {
	@Autowired
	AboutUsDao aboutus;
	@Autowired
	ContactoDao contacto;
	@Autowired
	UsuarioDao usuarios;
	@Autowired
	EventosDao eventos; 
	@Autowired
	UsuarioJpaSpring datosUsuarios;
	@Autowired
	EventosJpaSpring datosEventos;
	
	public static String encriptPassword(String password){
		return DigestUtils.md5Hex(password);		
	}
	
	@PostMapping(value="/aboutUs",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<AboutUs> aboutus(){
		return aboutus.aboutus();
	}
	@PostMapping(value="/Contacto",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<ContactInformation> contacto(){
        return contacto.obtenerContacto();
    }
	@PostMapping(value="/Usuarios",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<User> obtenerUsuarios(){
        return usuarios.obtenerUsuarios();
    }
	@PostMapping(value="/Eventos",produces=MediaType.APPLICATION_JSON_VALUE)
    public List<Event> obtenerEventos(){
        return eventos.obtenerEventos();
    }
	@PostMapping(value="/SingUp", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> addUsuario (@RequestBody User nombre) {
		nombre.setPassword(encriptPassword(nombre.getPassword()));
        return ResponseEntity.status(HttpStatus.CREATED).body(datosUsuarios.save(nombre));
    }
	@PostMapping(value="/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> loginUsuario (@RequestBody User nombre) {
        return ResponseEntity.status(HttpStatus.OK).body(datosUsuarios.findByUsernameAndPassword(nombre.getUsername(), encriptPassword(nombre.getPassword())));
    }
	
	@PostMapping(value="/profile/{name}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsuario(@PathVariable String name) {
		return datosUsuarios.findByUsername(name);
	}
	@DeleteMapping(value="/delete/{id}")
	public void eliminarPorId(@PathVariable int id) {
			datosUsuarios.deleteById(id);
	}
	@PostMapping(value="/PorEmail/{email}",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsuarioPorEmail(@PathVariable String email) {
		return datosUsuarios.findByEmail(email);
	}
	@PutMapping(value="/profile/update/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<Object> updateUser (@RequestBody User usuario, @PathVariable int id) {
		this.usuarios.updateUsuario(id, usuario);
        return ResponseEntity.ok(Boolean.TRUE);
    }
		////Crear un campo en usuario que sea verifiacion. 
		//
	
	@PostMapping(value="/CrearEvento", consumes = MediaType.APPLICATION_JSON_VALUE)
    public  ResponseEntity<?> addEvento (@RequestBody Event name) {
        return ResponseEntity.status(HttpStatus.CREATED).body(datosEventos.save(name));
    }
}



