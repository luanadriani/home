package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Estado")
public class Estado implements Serializable{
	private static final long serialVersionUID = 1509215286525952701L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Estado", nullable = false)
	private Long id;
	
	@Column(name = "Nome", length = 100, nullable = true)
	private String nome;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Pais", nullable = false)
	private Pais pais;
	
	//GET && SET


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

