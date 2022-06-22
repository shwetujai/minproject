package com.demo.controllar;

import java.util.List;

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

import com.demo.modal.Contect;
import com.demo.serviceI.UserServiceI;

@RestController
public class UserControllar {
	private static final List<Contect> ResponseEntity = null;
	@Autowired
	private UserServiceI userServiceI;
	
@PostMapping(value="/saveContect",consumes="APPLICATION/JSON")
public ResponseEntity<String>saveContect(@RequestBody Contect contect){
	
	boolean save= userServiceI.saveContect(contect);
	if(save == true) {
		String msg="Contect saved Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}else {
			String msg="Contect not-saved Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	
	}
@GetMapping(value="/getAllContect",produces="APPLICATION/JSON")
public ResponseEntity<List<Contect>> getAllContect(){
	
	List<Contect>List=userServiceI.getAllContact();
	if(List !=null) {
		return new ResponseEntity<List<Contect>>(List,HttpStatus.OK);
	}

	else {
		String msg="Data not found";
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
}
	@GetMapping(value="/edit/{cid}")
	public ResponseEntity<Contect>getContectById(@PathVariable Integer cid){
		Contect contect=userServiceI.getContectById(cid);
		
		if(contect !=null) {
			return new ResponseEntity<Contect>(contect,HttpStatus.OK);
		}
		else {
			String s="Record not found";
			return new ResponseEntity(s,HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping(value="/UpdateContect")
	public ResponseEntity<String>updateContect(Contect contect){
		boolean contect2=userServiceI.UpdateContect(contect);
		if(contect2 ==true) {
			return new ResponseEntity<String>("Contect is Updated sucessfully",HttpStatus.OK);
		}
		else {
			String msg="not updated";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
		}
	@DeleteMapping("/deleteContactById/{cid}")
	public String deleteContactById(@PathVariable("cid") Integer cid) {
		
		boolean deleteById = userServiceI.deleteById(cid);
		if(deleteById ==true) {
			return "Record deleted Successfully";
		}else {
		return "Record not deleted";
		}
	}
	
	



	
	
	
}
	
	
	
	
	


