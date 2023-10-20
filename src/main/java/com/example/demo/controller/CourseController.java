package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.CourseRepository;
import com.example.demo.model.Course;

@RestController
public class CourseController {
	@Autowired
	CourseRepository courseRepository;
	
	
	private List<Course> data =new ArrayList<Course>();


	private Integer courseID;
	
	@GetMapping("/course")
	public ResponseEntity<Object> getCourse(){
	    try {
	       
	    	List<Course> courses = courseRepository.findAll();
	        
	    	return new ResponseEntity<>(courses, HttpStatus.OK);
	    } catch (Exception e) {
	     
	    	return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping("/course")
	public ResponseEntity<Object> adddCourse(@RequestBody Course body) {
		
		try {
			Course course = courseRepository.save(body);
					return new ResponseEntity<>(course,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
			
			
		}
		 
	@GetMapping("/course/{courseID}")
	  public ResponseEntity<Object> getCourseDetail(@PathVariable Integer courseID) {
    	
    	try {
    		
    		Optional<Course> course =courseRepository.findById(courseID);
    		if (course.isPresent()) {
				return new ResponseEntity<>(course, HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Course not found", HttpStatus.BAD_REQUEST);
			}
    		
    		
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
    }

	@PutMapping("/course/{courseID}")

		public ResponseEntity<Object>  updatCourse(@PathVariable Integer courseID ,@RequestBody Course body) {
			
			try {
	
				Optional<Course> course =courseRepository.findById(courseID);
				 	
				 if (course.isPresent()) {
						course.get().setCourseName(body.getCourseName());
						course.get().setCourseDetail(body.getCourseDetail());
						course.get().setTeacher(body.getTeacher());
						
						courseRepository.save(course.get());
			     return new ResponseEntity<>(course,HttpStatus.OK);
				}else 
					return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
			} catch (Exception e) {
				return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
			}
			
	       
			}


    @DeleteMapping("/course/{courseID}")
    public ResponseEntity<Object> deleteCourse(@PathVariable Integer courseID) {
    	
    	try {
    		Optional<Course> course =courseRepository.findById(courseID);
        	
        	if (course.isPresent()) {
        		courseRepository.delete(course.get());
        		
        		return new ResponseEntity<>("DELETE SUCSESS",HttpStatus.OK);
        	
        	}else 
        		return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
    	
    	}
    
  }

    
