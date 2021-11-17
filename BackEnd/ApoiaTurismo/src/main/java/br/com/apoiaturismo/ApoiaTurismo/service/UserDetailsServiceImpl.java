package br.com.apoiaturismo.ApoiaTurismo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.apoiaturismo.ApoiaTurismo.model.UsuarioModel;
import br.com.apoiaturismo.ApoiaTurismo.repository.UsuarioRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<UsuarioModel> user = userRepository.findByNick(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));
		
		return user.map(UserDetailsImpl::new).get();
	}
	
}
