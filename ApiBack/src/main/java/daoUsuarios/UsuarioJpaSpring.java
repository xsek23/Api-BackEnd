package daoUsuarios;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;



import model.User;
@Service
public interface UsuarioJpaSpring extends JpaRepository<User, Integer>{
	public List<User> findByUsername(String name);
	public List<User> findByUsernameAndPassword(String name, String password);
	public List<User> findByEmail(String email);

}
