package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.Student;
import com.example.demo.service.StudentService;





@Controller
public class IndexController {
	
	@Autowired
	private StudentService stuS;
	
	@GetMapping("/index")
	public String indexpag()
	{
		return "index";
	}
	
	
	@GetMapping("/login")
	public String loginpag()
	{
		return "login";
	}

	@GetMapping("/about")
	public String aboutpag()
	{
		return "about";
	}
	
	@PostMapping("/upload")
	public void upload(@RequestParam("name") String name, @RequestParam("marks") int marks,@RequestParam("roll") int roll, @RequestParam("sub") String sub,@RequestParam("dos") String dos )
	{
		//code to upload form data in database automatically created by Hibernate
		//i.e what happens when the user clicks on submit button of uploadfile.jsp
		
		Student stu= new Student();
		
		stu.setDate_of_Submission(dos);
		stu.setMarks(marks);
		stu.setName(name);
		stu.setRoll_no(roll);
		stu.setSubject(sub);
		
		stuS.saveToDb(stu);
		
		
	}
	
	@PostMapping("/SiteController")
	public String controller(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		String val="";
			
		if(username.equals("sa") && password.contentEquals("sa"))
		{
					val="uploadfile";
		}
		else 
		{
			val="login";
		}
		
		return val;
	}
	
	
	
	
	
}

