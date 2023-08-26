package com.jayesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayesh.entity.Course;
import com.jayesh.repository.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "success..!";
	}

	@Override
	public Course getById(Integer id) {
		Optional<Course> findById = courseRepo.findById(id);

		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourse() {

		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if (courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "delete success..!";
		} else {
			return "no record found";
		}

	}

}
