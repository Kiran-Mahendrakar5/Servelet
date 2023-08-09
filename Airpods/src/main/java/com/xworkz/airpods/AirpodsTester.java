package com.xworkz.airpods;

import java.util.List;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.AirpodsServiceImpl;

public class AirpodsTester {

	public static void main(String[] args) {

		AirpodsService service = new AirpodsServiceImpl();

		AirpodsDto dto = new AirpodsDto(1, "OnePlus", 1500, "white", 15);
		AirpodsDto dto1 = new AirpodsDto(2, "sony", 1900, "orange", 14);
		AirpodsDto dto2 = new AirpodsDto(3, "samsung", 1900, "red", 14);
		
	//service.store(dto2);
//		service.store(dto1);

//		boolean result = service.updateColorByName("yellow", "sony");
//				
//		System.out.println(result);
//		
//		service.updateColorByName("yellow", "sony");
//		
//		
//		boolean status =service.deleteByPrice(1500);
//		System.out.println(status);
//
//		List<AirpodsDto> read =service.readAll();
//	  for(AirpodsDto ref:read) {
//		  System.out.println(ref);
//	  }
		
	}

}
