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
@Table(name="Telefone")
public class Telefone implements Serializable{
	private static final long serialVersionUID = 1509215286525952701L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Telefone", nullable = false)
	private Integer id;
	
	@Column(name = "DDD", nullable = true)
	private Integer ddd;
	
	@Column(name = "Numero", nullable = true)
	private Integer numero;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Pessoa", nullable = false)
	private Pessoa pessoa;
	
	//GET && SET


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}

