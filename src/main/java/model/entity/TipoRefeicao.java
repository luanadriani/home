package model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tipo_Refeicao")
public class TipoRefeicao implements Serializable{
	private static final long serialVersionUID = 5238418439131388526L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "Id_Tipo_Refeicao", nullable = false)
	private Long id;
	
	@Column(name = "Desc", length = 45, nullable = true)
	private String desc;
	
	//GET && SET

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

