package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

import com.example.demo.Repository.MycourseRepository;
import com.example.demo.model.Member;
import com.example.demo.model.Mycourse; // แก้แถวนี้

@RestController
public class MycourseController {
	@Autowired
	MycourseRepository mycourseRepository;
	
	private List<Mycourse> data =new ArrayList<Mycourse>();
	
	@GetMapping("/mycourse")
	public ResponseEntity<Object> getMycourse(){
	    try {
	        List<Mycourse> mycourses = mycourseRepository.findAll();
	        return new ResponseEntity<>(mycourses, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

	@PostMapping("/mycourse")
public ResponseEntity<Object> adddMycourse(@RequestBody Mycourse body) {
		
		try {
			Mycourse mycourse = mycourseRepository.save(body);
					return new ResponseEntity<>(mycourse,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
			
			
		}
	@GetMapping("/mycourse/{memberName}")
	 public ResponseEntity<Object> getMycourse(@PathVariable String memberName) {
try {
    		
			Optional<Mycourse> mycourse =mycourseRepository.findById(memberName);
    		if (mycourse.isPresent()) {
				return new ResponseEntity<>(mycourse, HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Course not found", HttpStatus.BAD_REQUEST);
			}
    		
    		
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
    }
	@PutMapping("/mycourse/{memberName}")
	public ResponseEntity<Object> updateMycourse(@PathVariable String memberName, @RequestBody Mycourse body) {
	    try {
	        Optional<Mycourse> mycourseOptional = mycourseRepository.findById(memberName);
	        
	        if (mycourseOptional.isPresent()) {
	            Mycourse existingMycourse = mycourseOptional.get();
	            existingMycourse.setMember(body.getMember());
	            existingMycourse.setCourse(body.getCourse());
	            // และอื่น ๆ ตามที่คุณต้องการที่จะอัพเดต
	            mycourseRepository.save(existingMycourse);
	            
	            return new ResponseEntity<>(existingMycourse, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>("Mycourse not found", HttpStatus.NOT_FOUND);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}



		
	
		 @DeleteMapping("/mycourse/{memberName}")
		    public ResponseEntity<Object> deleteMycourse(@PathVariable String memberName) {
		        try {
		            Optional<Mycourse> mycourse = mycourseRepository.findById(memberName);
		            if (mycourse.isPresent()) {
		                mycourseRepository.delete(mycourse.get());
		                return new ResponseEntity<>(HttpStatus.OK);
		            } else {
		                return new ResponseEntity<>("Mycourse not found", HttpStatus.BAD_REQUEST);
		            }
		        } catch (Exception e) {
		            return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
		}