package br.com.apoiaturismo.ApoiaTurismo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProduto;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 255, message = "O tipo deve conter no mínimo 3 e no máximo 255 caracteres")
	private String titulo;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 255, message = "O tipo deve conter no mínimo 3 e no máximo 255 caracteres")
	private String descricaoProduto;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 1000, message = "O tipo deve conter no mínimo 3 e no máximo 255 caracteres")
	private String fotoUrl;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 15, message = "O tipo deve conter no mínimo 3 e no máximo 15 caracteres")
	private String regiao;

	@NotNull(message = "Não pode conter valor nulo")
	@Positive(message = "O valor precisa ser positivo")
	private BigDecimal preco;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "fk_id_categoria")
	private CategoriaModel categoria;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	@JoinColumn(name = "fk_id_usuario")
	private UsuarioModel usuario;

	public long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(long idProduto) {
		this.idProduto = idProduto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}

	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}

}
