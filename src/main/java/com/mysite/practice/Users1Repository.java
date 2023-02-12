package com.mysite.practice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysite.practice.users1.Users1;

public interface Users1Repository extends JpaRepository<Users1, Integer> {
	
	
	
}
