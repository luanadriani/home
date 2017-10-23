package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tipo_Unidade_Medida")
public class TipoUnidadeMedida implements Serializable{
	private static final long serialVersionUID = 4563015623241357516L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Tipo_Unidade_Medida", nullable = false)
	private Integer id;
	
	@Column(name = "Desc", length = 45, nullable = true)
	private String desc;
	
	//GET && SET

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}

