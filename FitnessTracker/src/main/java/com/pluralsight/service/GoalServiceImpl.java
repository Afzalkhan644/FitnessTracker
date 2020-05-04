package com.pluralsight.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.repository.GoalRepository;
import com.pluralsight.repository.GoalRepositoryImpl;


@Service
public class GoalServiceImpl implements GoalService {
	

private GoalRepository goalRepository=new GoalRepositoryImpl();


	public Goal save(Goal goal) {
		// TODO Auto-generated method stub
		return goalRepository.save(goal);
	}

}
