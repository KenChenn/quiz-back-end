package com.example.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{  //第一個參數User是指entity裡的哪個表，第二個參數String是指pk的資料型態
	
	public User findByAccountAndPwd(String account,String pwd);

	public boolean existsByAccountAndPwd(String account,String pwd);
}
