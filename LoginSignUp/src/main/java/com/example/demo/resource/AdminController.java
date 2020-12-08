package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepo;

@Controller
public class AdminController {

	@Autowired
	AdminRepo repo;
	
	@RequestMapping("/home")
	public String home(){
		return "Home.jsp";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "type.jsp";
	}
	
	@RequestMapping("/registerStudent")
	public String registerForm() {
		return "regStudent.jsp";
	}
	
	@RequestMapping("/studentRegister")
	public String studentRegister(Admin admin) {
		admin.setType("Student");
		String id = admin.getEmail();
		if(repo.findById(id).isPresent()) {
			return "error.jsp";
		}
		else
		{
			repo.save(admin);
			return "save.jsp";
		}
			
	}
	
	@RequestMapping("/registerTeacher")
	public String regTeacher() {
		return "regTeacher.jsp";
	}
	
	@RequestMapping("/teacherRegister")
	public String teacherRegister(Admin admin) {
		admin.setType("Teacher");
		String id = admin.getEmail();
		if(repo.findById(id).isPresent()) {
			return "error.jsp";
		}
		else
		{
			repo.save(admin);
			return "save.jsp";
		}
			
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginStudent.jsp";
	}
	
	@RequestMapping("/LoginDetails")
	public String Login(Admin admin) {
		String id = admin.getEmail();
		String pwd = admin.getPassword();
		if(repo.findById(id).isPresent()) {
			Admin ad = repo.findById(id).orElse(null);
			if(ad.getPassword().equals(pwd))
				return "login.jsp";
			else
				return "pwderror.jsp";
		}
		else
			return "wrongdata.jsp";
	}
	
}
