package tn.esprit.product.management.ejb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="t_clerck")
public class Clerk extends User implements Serializable {

	private Double salary;
	private String grade;
	private static final long serialVersionUID = 1L;

	public Clerk() {
		// TODO Auto-generated constructor stub
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
