package com.xworkz.election.repo;

import java.util.List;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.election.dto.ElectionDto;

public class ElectionRepoImpl {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Election");

	EntityManager em = emf.createEntityManager();

	public boolean save(ElectionDto dto) {

		if (em != null) {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dto);
			transaction.commit();
			
			return true;
		}
		return false;

	}

	public List<ElectionDto> readAll() {
		Query querys = em.createNamedQuery("readAll");
		List<ElectionDto> list = querys.getResultList();
		return list;
	}

}
