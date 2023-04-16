package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producttype")
public class ProductType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="productTypeId")
	private int ProductTypeId;
	
	@Column (name="name")
	private String name;
	
	public int getProductTypeId() {
		return ProductTypeId;
	}
	
	public void setproductTypeId(int productTypeId) {
		ProductTypeId = productTypeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}

}