package com.demo.serviceI;

import java.util.List;

import com.demo.modal.Contect;

public interface UserServiceI {
	
	boolean saveContect(Contect contect);
	
	List<Contect>getAllContact();
	
	Contect getContectById(Integer cid);
	
	public boolean UpdateContect(Contect contect);
	
	public boolean deleteById(int cid);
	
}
