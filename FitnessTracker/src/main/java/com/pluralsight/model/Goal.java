package com.pluralsight.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import com.pluralsight.model.Exercise;
import org.hibernate.validator.constraints.Range;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="goals")
public class Goal {
	
	
  public Goal()
  {}

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="Goal_Id")
	private Long Id;
@Column(name="Minutes")
	@Range(min = 1, max = 120)
	private int minutes;

@OneToMany(mappedBy = "goals",cascade = CascadeType.ALL)
private List<Exercise> exercises=new ArrayList<Exercise>();

	public List<Exercise> getExercises() {
	return exercises;
}

public Long getId() {
	return Id;
}

	public int getMinutes() {
		return minutes;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void setId(Long id) {
		Id = id;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
}
