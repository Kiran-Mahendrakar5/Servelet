package com.xworkz.airpods.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.airpods.dto.AirpodsDto;

public class AirpodRepoImpl implements AirpodsRepo {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("airpods");

	EntityManager em = emf.createEntityManager();

	public boolean store(AirpodsDto dto) {

		if (em != null) {

			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			em.close();
			return true;

		}

		return false;
	}

	public boolean updateColorByName(String color, String brandName) {

		//EntityTransaction transaction = em.getTransaction();
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateColorbyName");
		query.setParameter("cl", color);
		query.setParameter("nm", brandName);

		int result = query.executeUpdate();
		System.out.println(result);
		em.getTransaction().commit();
		

		return true;

	}

	public boolean deleteByPrice(int price) {

		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Query query = em.createNamedQuery("deleteByPrice");
		query.setParameter("pr", price);
		query.executeUpdate();
		transaction.commit();

		return true;
	}

	public List<AirpodsDto> readAll() {
		Query query = em.createNamedQuery("readAll");
		List<AirpodsDto> list = query.getResultList();
		return list;
	}
}
