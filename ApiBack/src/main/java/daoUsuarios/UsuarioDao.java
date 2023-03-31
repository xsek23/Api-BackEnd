package daoUsuarios;
import java.util.List;

import model.User;

public interface UsuarioDao {	
	    List<User> obtenerUsuarios();
		List<User> obtenerUsuario(String nombre);
		List<User> obtenerUsuarioPorEmail(String email); 
		void updateUsuario(int id, User usu); 
		

		

}

