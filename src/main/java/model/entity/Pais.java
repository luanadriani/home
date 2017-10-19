package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pais")
public class Pais implements Serializable{
	private static final long serialVersionUID = -3825801567329034683L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Pais", nullable = false)
	private Integer id;
	
	@Column(name = "Nome", length = 100, nullable = true)
	private String nome;
	
	//GET && SET


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}

