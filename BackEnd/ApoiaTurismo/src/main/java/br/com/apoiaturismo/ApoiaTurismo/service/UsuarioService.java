package br.com.apoiaturismo.ApoiaTurismo.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.apoiaturismo.ApoiaTurismo.model.UsuarioLogin;
import br.com.apoiaturismo.ApoiaTurismo.model.UsuarioModel;
import br.com.apoiaturismo.ApoiaTurismo.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Optional<UsuarioModel> cadastrarUsuario(UsuarioModel usuario) {

		if (usuarioRepository.findByNick(usuario.getNick()).isPresent() || usuarioRepository.findByEmail(usuario.getEmail()).isPresent())
			return Optional.empty();

		usuario.setSenha(criptografarSenha(usuario.getSenha()));

		return Optional.of(usuarioRepository.save(usuario));

	}
	
	public Optional<UsuarioModel> atualizarUsuario(UsuarioModel usuario) {

		if (usuarioRepository.findById(usuario.getIdUsuario()).isPresent()) {

			Optional<UsuarioModel> buscaUsuario = usuarioRepository.findByNick(usuario.getNick());

			if (buscaUsuario.isPresent()) {
				if (buscaUsuario.get().getIdUsuario() != usuario.getIdUsuario())
					return Optional.empty();
			}

			usuario.setSenha(criptografarSenha(usuario.getSenha()));

			return Optional.of(usuarioRepository.save(usuario));
		}

		return Optional.empty();
	}
	
	public Optional<UsuarioLogin> autenticarUsuario(Optional<UsuarioLogin> usuarioLogin) {

		Optional<UsuarioModel> usuario = usuarioRepository.findByNick(usuarioLogin.get().getNick());
		System.out.println(usuario.get().getEmail());

		if (usuario.isPresent()) {
			if (compararSenhas(usuarioLogin.get().getSenha(), usuario.get().getSenha())) {

				String token = gerarBasicToken(usuarioLogin.get().getNick(), usuarioLogin.get().getSenha());

				usuarioLogin.get().setId(usuario.get().getIdUsuario());
				usuarioLogin.get().setNomeUsuario(usuario.get().getNomeUsuario());
				usuarioLogin.get().setNick(usuario.get().getNick());
				usuarioLogin.get().setEmail(usuario.get().getEmail());
				usuarioLogin.get().setFoto(usuario.get().getFoto());
				usuarioLogin.get().setSenha(usuario.get().getSenha());
				usuarioLogin.get().setToken(token);

				return usuarioLogin;

			}
		}
		
		return Optional.empty();

	}
	
	private String criptografarSenha(String senha) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		return encoder.encode(senha);

	}
	
	private boolean compararSenhas(String senhaDigitada, String senhaBanco) {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		return encoder.matches(senhaDigitada, senhaBanco);

	}

	
	private String gerarBasicToken(String email, String password) {

		String tokenBase = email + ":" + password;
		byte[] tokenBase64 = Base64.encodeBase64(tokenBase.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(tokenBase64);

	}
	
}
