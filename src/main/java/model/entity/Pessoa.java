package model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pessoa")
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 5383942736270535110L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Pessoa", nullable = false)
	private Long id;
	
	@Column(name = "Nome", length = 100, nullable = true)
	private String nome;
	
	@Column(name = "Data_Nascimento", nullable = true)
	private Date dataNascimento;
	
	@Column(name = "CPF", length = 11, nullable = true)
	private String cpf;
	
	@Column(name = "Username", length = 50, nullable = true)
	private String username;
	
	@Column(name = "Senha", length = 50, nullable = true)
	private String senha;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Endereco", nullable = false)
	private Endereco endereco;
	
	//GET && SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

