package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Teacher implements Serializable{	
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private Date admissionDate;
	private String cpf;
	private String phone;
	private Double salary;
	
	public Teacher() {
	}
		
	public Teacher(Integer id, String name, Date admissionDate, String cpf, String phone, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.admissionDate = admissionDate;
		this.cpf = cpf;
		this.phone = phone;
		this.salary = salary;
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", admissionDate=" + admissionDate + ", cpf=" + cpf + ", phone="
				+ phone + ", salary=" + salary + "]";
	}				
}
