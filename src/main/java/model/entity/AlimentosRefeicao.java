package model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Alimentos_Refeicao")
public class AlimentosRefeicao implements Serializable{
	private static final long serialVersionUID = -8064934429443062570L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Alimentos_Refeicao", nullable = false)
	private Integer id;
	
	@Column(name = "Qtde", nullable = true)
	private BigDecimal qtde;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Refeicao", nullable = false)
	private Refeicao refeicao;
	
	@ManyToOne
	@JoinColumn(name = "Id_Alimento", nullable = false)
	private Alimento alimento;
	
	//GET && SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getQtde() {
		return qtde;
	}

	public void setQtde(BigDecimal qtde) {
		this.qtde = qtde;
	}

	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

	public Alimento getAlimento() {
		return alimento;
	}

	public void setAlimento(Alimento alimento) {
		this.alimento = alimento;
	}
}

