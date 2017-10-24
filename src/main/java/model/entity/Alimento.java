package model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Alimento")
public class Alimento implements Serializable{
	private static final long serialVersionUID = 1056048933282832835L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Alimento", nullable = false)
	private Long id;
	
	@Column(name = "Desc", length = 60, nullable = true)
	private String desc;
	
	@Column(name = "Carboidratos", nullable = true)
	private BigDecimal carboidratos;
	
	//FK
	
	@ManyToOne
	@JoinColumn(name = "Id_Tipo_Unidade_Medida", nullable = false)
	private TipoUnidadeMedida tipoUnidadeMedida;
	
	//GET && SET

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BigDecimal getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(BigDecimal carboidratos) {
		this.carboidratos = carboidratos;
	}

	public TipoUnidadeMedida getTipoUnidadeMedida() {
		return tipoUnidadeMedida;
	}

	public void setTipoUnidadeMedida(TipoUnidadeMedida tipoUnidadeMedida) {
		this.tipoUnidadeMedida = tipoUnidadeMedida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

