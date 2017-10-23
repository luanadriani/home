package model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Instrucoes_Medicas")
public class InstrucoesMedicas implements Serializable{
	private static final long serialVersionUID = 1321509350279304608L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Instrucoes_Medicas", nullable = false)
	private Integer id;
	
	@Column(name = "Data_Instrucao", nullable = true)
	private Date dataInstrucao;
	
	@Column(name = "Fator_Sensibilidade", nullable = true)
	private BigDecimal fatorSensibilidade;
	
	@Column(name = "Unidade_Insulina_Rapida_Cobre", nullable = true)
	private BigDecimal unidadeInsulinaRapidaCobre;
	
	@Column(name = "Ativo", nullable = true)
	private Integer ativo;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Paciente", nullable = false)
	private Paciente paciente;
	
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

	public Date getDataInstrucao() {
		return dataInstrucao;
	}

	public void setDataInstrucao(Date dataInstrucao) {
		this.dataInstrucao = dataInstrucao;
	}

	public BigDecimal getFatorSensibilidade() {
		return fatorSensibilidade;
	}

	public void setFatorSensibilidade(BigDecimal fatorSensibilidade) {
		this.fatorSensibilidade = fatorSensibilidade;
	}

	public BigDecimal getUnidadeInsulinaRapidaCobre() {
		return unidadeInsulinaRapidaCobre;
	}

	public void setUnidadeInsulinaRapidaCobre(BigDecimal unidadeInsulinaRapidaCobre) {
		this.unidadeInsulinaRapidaCobre = unidadeInsulinaRapidaCobre;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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

