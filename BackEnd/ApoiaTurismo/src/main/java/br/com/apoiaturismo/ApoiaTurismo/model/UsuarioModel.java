package br.com.apoiaturismo.ApoiaTurismo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	// Adicionando nome usuario como nick para login e identificação
	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 70, message = "O nome deve conter no mínimo 3 e no máximo 70 caracteres")
	private String nomeUsuario;

	//Nick é o nome publico de qualquer usuário
	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 20, message = "O nome deve conter no mínimo 3 e no máximo 20 caracteres")
	private String nick;

	@ApiModelProperty(example = "email@email.com.br")
	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Email(message = "Precisa ser um email válido")
	private String email;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	//@Size(min = 6, max = 15, message = "A senha deve conter no mínimo 6 e no máximo 15 caracteres")
	private String senha;

	private String foto;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<ProdutoModel> produto;

	public UsuarioModel(long id, String nome, String nick, String email, String senha, String foto) {
	
		this.idUsuario = id;
		this.nomeUsuario = nome;
		this.nick = nick;
		this.foto = foto;
		this.email = email;
		this.senha = senha;
		
	}
	
	
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public UsuarioModel() {
		
	}
	
	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}

}