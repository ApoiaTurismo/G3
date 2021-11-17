package br.com.apoiaturismo.ApoiaTurismo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.apoiaturismo.ApoiaTurismo.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

	public Optional<UsuarioModel> findByNick(String usuario);
	
//	public Optional<UsuarioModel> findByEmail(String email);
	
	public List<UsuarioModel> findAllByNomeUsuarioContainingIgnoreCase(String nome);
	
}
