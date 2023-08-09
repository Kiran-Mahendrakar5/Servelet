package com.xworkz.airpods.service;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.repo.AirpodRepoImpl;
import com.xworkz.airpods.repo.AirpodsRepo;

public class AirpodsServiceImpl implements AirpodsService {
	
	AirpodsRepo repo = new AirpodRepoImpl();
	
	public boolean store(AirpodsDto dto) {
		
		if(dto!=null) {
			if(dto.getId()>0 && dto.getPrice()<2000) {
				System.out.println("validated");
				return repo.store(dto);
			}
		}
		return false;
	}

	public boolean updateColorByName(String color, String brandName) {
		
		if(color!=null && brandName!= null) {
			System.out.println("data for updation is valid");
			return repo.updateColorByName(color, brandName);
		}
		return false;
	}

	public boolean deleteByPrice(int price) {
		if(price>1000 && price<10000) {
			System.out.println("price valid");
			return repo.deleteByPrice(price);
		}
		return false;
	}

	public List<AirpodsDto>   readAll() {
		
		return repo.readAll();
	}

}
