package com.xworkz.airpods.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "airpods_table")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "deleteByPrice", query = "Delete from AirpodsDto dto where dto.price=:pr")
@NamedQuery(name = "updateColorbyName", query = "Update AirpodsDto dto set dto.color=:cl where dto.brandName=:nm")
@NamedQuery(name = "readAll", query = "select dto from AirpodsDto dto")
public class AirpodsDto {

	@Id
	private int id;
	private String brandName;
	private int price;
	private String color;
	private int batteryBackup;

}
