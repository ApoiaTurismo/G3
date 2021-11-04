package br.com.apoiaturismo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotBlank(message = "O tipo não pode ficar vazio e não pode menor que 5 caracteres nem maior que 255")
	@Size(min = 5, max = 255 )
	private String tipo;
	
	@NotBlank(message = "O descrição não pode ficar vazio e não pode menor que 5 caracteres nem maior que 255")
	@Size(min = 5, max = 255 )
	private String descricao;
	
	@NotBlank(message = "O região não pode ficar vazio e não pode menor que 3 caracteres nem maior que 255")
	@Size(min = 3, max = 255 )
	private String regiao;
	
	public long getId() {
		return id_categoria;
	}

	public void setId(long id) {
		this.id_categoria = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
}
