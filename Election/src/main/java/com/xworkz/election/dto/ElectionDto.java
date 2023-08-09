package com.xworkz.election.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.NamedQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Election_table")


@NamedQuery(name = "readAll" , query =  "select dto from ElectionDto dto")
public class ElectionDto {
	
	@Id
	private int id;
	private String name;
	private String phoneNumber;
	private String age;
	private String address;
	private String pincode;
	
	
	
//	public ElectionDto(String name, String phoneNumber, String age, String address, String pincode) {
//		super();
//		this.name = name;
//		this.phoneNumber = phoneNumber;
//		this.age = age;
//		this.address = address;
//		this.pincode = pincode;
//	}

}
