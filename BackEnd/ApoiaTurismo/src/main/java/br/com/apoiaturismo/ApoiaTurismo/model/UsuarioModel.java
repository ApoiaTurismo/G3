package br.com.apoiaturismo.ApoiaTurismo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;

	// Adicionando nome usuario como nick para login e identificação
	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 50, message = "O nome deve conter no mínimo 3 e no máximo 50 caracteres")
	private String nomeUsuario;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 50, message = "O nome deve conter no mínimo 3 e no máximo 50 caracteres")
	private String nome;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 9, max = 50, message = "O email deve conter no mínimo 9 e no máximo 50 caracteres")
	private String email;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 6, max = 15, message = "A senha deve conter no mínimo 6 e no máximo 15 caracteres")
	private String senha;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<ProdutoModel> produto;

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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