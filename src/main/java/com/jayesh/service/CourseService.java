package com.jayesh.service;

import java.util.List;

import com.jayesh.entity.Course;

public interface CourseService {
	
	// insert and update both operation are perform single method = upsert
	public String upsert(Course course);
	
	public Course getById(Integer id);
	
	public List<Course> getAllCourse();
	
	public String deleteById(Integer id);
	

}
