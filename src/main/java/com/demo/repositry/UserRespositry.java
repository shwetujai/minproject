package com.demo.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.modal.Contect;
@Repository
public interface UserRespositry extends JpaRepository<Contect,Serializable>{

}
