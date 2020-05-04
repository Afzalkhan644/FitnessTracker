package com.pluralsight.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;


@Repository
public class GoalRepositoryImpl implements GoalRepository {

	
	
	public Goal save(Goal goal) {
		//em.persist(goal);
		//em.flush();
		return goal;
	}

}
