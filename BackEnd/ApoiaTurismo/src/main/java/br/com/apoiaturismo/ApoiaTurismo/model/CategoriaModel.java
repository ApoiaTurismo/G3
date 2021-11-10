package br.com.apoiaturismo.ApoiaTurismo.model;

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

	// TODO mudar o link do icone para suportar mais caracteres, colocar mensagem
	// também no notnull, boas práticas para as variáveis
	// TODO existem 2 getters and setters do Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 5, max = 255, message = "O tipo deve conter no mínimo 5 e no máximo 255 caracteres")
	private String tipo;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 5, max = 255, message = "A descrição deve conter no mínimo 5 e no máximo 255 caracteres")
	private String descricaoCategoria;

	@NotBlank(message = "Não pode conter só espaços ou valor nulo")
	@Size(min = 3, max = 255, message = "O atributo icone deve conter no mínimo 3 e no máximo 255 caracteres")
	private String icone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}

	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

}
