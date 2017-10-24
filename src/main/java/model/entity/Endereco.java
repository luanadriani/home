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
@Table(name="Endereco")
public class Endereco implements Serializable{
	private static final long serialVersionUID = 823060390810150380L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Endereco", nullable = false)
	private Long id;
	
	@Column(name = "CEP", nullable = true)
	private Integer cep;
	
	@Column(name = "Rua", length = 100, nullable = true)
	private String rua;
	
	@Column(name = "Numero", nullable = true)
	private Integer numero;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Cidade", nullable = false)
	private Cidade cidade;
	
	//GET && SET


	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

