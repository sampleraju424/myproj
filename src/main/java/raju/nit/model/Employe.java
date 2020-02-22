package raju.nit.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Entity
@Table(name = "emp")
public class Employe {
	
	
	private Integer id;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
