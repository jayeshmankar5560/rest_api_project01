package com.jayesh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayesh.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Serializable> {

}
