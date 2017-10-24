package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Medico")
public class Medico implements Serializable{
	private static final long serialVersionUID = 2697775769698896780L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Medico", nullable = false)
	private Long id;
	
	@Column(name = "Ativo", nullable = true)
	private Integer ativo;
	
	//FK
	
	@OneToOne
	@JoinColumn(name = "Id_Pessoa", nullable = false)
	private Pessoa pessoa;
	
	//GET && SET

	public Integer getAtivo() {
		return ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

