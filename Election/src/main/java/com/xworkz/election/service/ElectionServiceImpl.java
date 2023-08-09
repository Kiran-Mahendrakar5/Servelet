package com.xworkz.election.service;

import java.util.List;

import com.xworkz.election.dto.ElectionDto;
import com.xworkz.election.repo.ElectionRepo;
import com.xworkz.election.repo.ElectionRepoImpl;

public class ElectionServiceImpl implements ElectionService {
	
	ElectionRepoImpl repo = new ElectionRepoImpl();
	
	
	
	@Override
	public boolean save(ElectionDto dto) {
		
		if(dto!=null) {
			if(dto.getId()!=0) {
				if(dto.getName()!=null) {
					if(dto.getAge()!=null) {
						if(dto.getAddress()!=null) {
							if(dto.getPhoneNumber()!=null) {
								if(dto.getPincode()!=null) {
									repo.save(dto);
									System.out.println("data saved");
									return true;
									
								}
								System.out.println("getPincode is null");
								return false;
								
							}
							System.out.println("getPhoneNumber is null");
							return false;
							
						}
						System.out.println("getAddress is null");
						return false;
						
						
					}
					System.out.println("getAge is null");
					return false;
					
					
				}
				System.out.println("getName is null");
				return false;
				
				
			}
			System.out.println("getid is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
		
	}



	@Override
	public List<ElectionDto> readAll() {
		
		return repo.readAll();
	}

}
