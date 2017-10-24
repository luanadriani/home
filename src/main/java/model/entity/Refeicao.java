package model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="Refeicao")
public class Refeicao implements Serializable{
	private static final long serialVersionUID = -6073547330878952449L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Refeicao", nullable = false)
	private Long id;
	
	//Glicemia
	
	@Column(name = "Glicemia_Obtida", nullable = true)
	private BigDecimal glicemiaObtida;
	
	@Column(name = "Glicemia_Alvo", nullable = true)
	private BigDecimal glicemiaAlvo;
	
	//Insulina
	
	@Column(name = "Insulina_Correcao", nullable = true)
	private BigDecimal insulinaCorrecao;
	
	@Column(name = "Insulina_Alimentacao", nullable = true)
	private BigDecimal insulinaAlimentacao;
	
	@Column(name = "Insulina_Total", nullable = true)
	private BigDecimal insulinaTotal;
	
	@Column(name = "Data_Hora", nullable = true)
	private Date dataHoraRefeicao;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Paciente", nullable = false)
	private Paciente paciente;
	
	@ManyToOne
	@JoinColumn(name = "Id_Tipo_Refeicao", nullable = false)
	private TipoRefeicao tipoRefeicao;
	
	//GET && SET

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getGlicemiaObtida() {
		return glicemiaObtida;
	}

	public void setGlicemiaObtida(BigDecimal glicemiaObtida) {
		this.glicemiaObtida = glicemiaObtida;
	}

	public BigDecimal getGlicemiaAlvo() {
		return glicemiaAlvo;
	}

	public void setGlicemiaAlvo(BigDecimal glicemiaAlvo) {
		this.glicemiaAlvo = glicemiaAlvo;
	}

	public BigDecimal getInsulinaCorrecao() {
		return insulinaCorrecao;
	}

	public void setInsulinaCorrecao(BigDecimal insulinaCorrecao) {
		this.insulinaCorrecao = insulinaCorrecao;
	}

	public BigDecimal getInsulinaAlimentacao() {
		return insulinaAlimentacao;
	}

	public void setInsulinaAlimentacao(BigDecimal insulinaAlimentacao) {
		this.insulinaAlimentacao = insulinaAlimentacao;
	}

	public BigDecimal getInsulinaTotal() {
		return insulinaTotal;
	}

	public void setInsulinaTotal(BigDecimal insulinaTotal) {
		this.insulinaTotal = insulinaTotal;
	}

	public Date getDataHoraRefeicao() {
		return dataHoraRefeicao;
	}

	public void setDataHoraRefeicao(Date dataHoraRefeicao) {
		this.dataHoraRefeicao = dataHoraRefeicao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public TipoRefeicao getTipoRefeicao() {
		return tipoRefeicao;
	}

	public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
		this.tipoRefeicao = tipoRefeicao;
	}
}

