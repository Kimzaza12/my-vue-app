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

import com.example.demo.Repository.MemberRepository;
import com.example.demo.model.Course;
import com.example.demo.model.Member;

@RestController
public class MemberController {
	private static final Member member = null;

	@Autowired
	MemberRepository memberRepository;
	
	private List<Member> data =new ArrayList<Member>();
	
	@GetMapping("/member")
	public ResponseEntity<Object> getMember(){	    
		try {
	        List<Member> members = memberRepository.findAll();
	        return new ResponseEntity<>(members, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}

		
		
	@PostMapping("/member")
	public ResponseEntity<Object> adddMember(@RequestBody Member body) {
		
		try {
			Member member = memberRepository.save(body);
					return new ResponseEntity<>(member,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
			
			
		}
		 
	@GetMapping("/member/{memberID}")
	  public ResponseEntity<Object> getMemberDetail(@PathVariable Integer memberID) {
    	
    	try {
    		
    		Optional<Member> member =memberRepository.findById(memberID);
    		if (member.isPresent()) {
				return new ResponseEntity<>(member, HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Course not found", HttpStatus.BAD_REQUEST);
			}
    		
    		
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
    }

	@PutMapping("/member/{memberID}")
	
	public ResponseEntity<Object>  updatMember(@PathVariable Integer memberID ,@RequestBody Member body) {
		
		try {

			Optional<Member> member =memberRepository.findById(memberID);
			 	
			if (member.isPresent()) {
				member.get().setMemberName(body.getMemberName());
				member.get().setMemberLastname(body.getMemberLastname());
				member.get().setMemberPhone(body.getMemberPhone());
				member.get().setEmail(body.getEmail());
				
				memberRepository.save(member.get());
		     return new ResponseEntity<>(member,HttpStatus.OK);
			}else 
				return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
		
       
		}



    @DeleteMapping("/member/{memberID}")
 public ResponseEntity<Object> deleteMember(@PathVariable Integer memberID) {
    	
    	try {
    		Optional<Member> member =memberRepository.findById(memberID);
        	
        	if (member.isPresent()) {
        		memberRepository.delete(member.get());
        		
        		return new ResponseEntity<>("DELETE SUCSESS",HttpStatus.OK);
        	
        	}else 
        		return new ResponseEntity<>("Employee not found", HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal sever erorr", HttpStatus.INTERNAL_SERVER_ERROR );
		}
    	
    	}
    
  }

    
