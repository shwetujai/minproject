package com.demo.serviceI;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.modal.Contect;
import com.demo.repositry.UserRespositry;

@Service
public class ServiceImp implements UserServiceI{

	@Autowired
private UserRespositry userRepository;
	@Override
	public boolean saveContect(Contect contect) {
		Contect save= userRepository.save(contect);
		if(save !=null) {
			return true;
		}
			else {
				return false;
	}
		}

	@Override
	public List<Contect> getAllContact() {
		List<Contect> contect=userRepository.findAll();
		if(contect !=null) {
			return contect;
		}else {
		
		return null;
	}
		}

	@Override
	public Contect getContectById(Integer cid) {
		Optional<Contect> findById= userRepository.findById(cid);
		if(findById.isPresent()) {
			Contect contect = findById.get();
			
		}
		return null;
	}

	@Override
	public boolean UpdateContect(Contect contect) {
		Contect save= userRepository.save(contect);
		if(save != null) {
			return true;
		}else {
			
		}
		return false;
	}

	@Override
	public boolean deleteById(int cid) {
		Optional<Contect> findById=userRepository.findById(cid);
		if(findById.isPresent()) {
			userRepository.deleteById(cid);
			return true;
		}else {
			return false;
		}
		
		
		
	}

}
