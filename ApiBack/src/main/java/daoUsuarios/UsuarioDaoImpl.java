package daoUsuarios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;


import model.User;

	@Repository
	public class UsuarioDaoImpl implements UsuarioDao {
		 @Autowired
		    private UsuarioJpaSpring usuario;

		 @Override
		    public List <User> obtenerUsuarios() {
		        return usuario.findAll();
	
		 }
		 @Override
		public List<User> obtenerUsuario (String nombre){
			return usuario.findByUsername(nombre);
		}
		@Override
		public List<User> obtenerUsuarioPorEmail(String email) {
			return usuario.findByEmail(email);
		}
		@Override
		public void updateUsuario(int id, User usu) {
			Optional<User> users = this.usuario.findById(id);
			User user = users.get();
			user.setUsername(usu.getUsername());
			user.setEmail(usu.getEmail());
			user.setPassword(usu.getPassword());
			
			this.usuario.save(user);
			
		}

		 
	}