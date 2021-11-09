package br.com.apoiaturismo.ApoiaTurismo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	// TODO mudar o link do icone para suportar mais caracteres, colocar mensagem também no notnull, boas práticas para as variáveis
	// TODO existem 2 getters and setters do Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 20, message = "O tipo deve conter no mínimo 5 e no máximo 20 caracteres")
	private String tipo;
	
	@NotNull
	@Size(min = 5, max = 150, message = "A descrição deve conter no mínimo 5 e no máximo 150 caracteres")
	private String descricao_categoria;
	
	@NotNull
	@Size(min = 3, max = 255, message = "O atributo icone deve conter no mínimo 5 e no máximo 255 caracteres") 
	private String icone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao_categoria() {
		return descricao_categoria;
	}

	public void setDescricao_categoria(String descricao_categoria) {
		this.descricao_categoria = descricao_categoria;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao_categoria;
	}

	public void setDescricao(String descricao) {
		this.descricao_categoria = descricao;
	}
	
}
