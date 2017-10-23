package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cidade")
public class Cidade implements Serializable{
	private static final long serialVersionUID = 8663136169662725242L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Cidade", nullable = false)
	private Integer id;
	
	@Column(name = "Nome", length = 100, nullable = true)
	private String nome;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Estado", nullable = false)
	private Estado estado;
	
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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
}

