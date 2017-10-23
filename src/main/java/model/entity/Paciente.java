package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Paciente")
public class Paciente implements Serializable{
	private static final long serialVersionUID = 5711007905830845595L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Paciente", nullable = false)
	private Integer id;
	
	@Column(name = "Ativo", nullable = true)
	private Integer ativo;
	
	//FK
	
	@OneToOne
	@JoinColumn(name = "Id_Pessoa", nullable = false)
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "Id_Medico", nullable = false)
	private Medico medico;
	
	//GET && SET

	public Integer getId() {
		return id;
	}

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

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}

