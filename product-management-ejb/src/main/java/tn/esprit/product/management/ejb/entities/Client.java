package tn.esprit.product.management.ejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_client")
public class Client extends User implements Serializable {

	private Boolean vip;
	private static final long serialVersionUID = 1L;

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
