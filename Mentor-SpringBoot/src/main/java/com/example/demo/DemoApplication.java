package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;



@SpringBootApplication
@EnableJpaRepositories(basePackages="com.example.demo.repo")
public class DemoApplication {

	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);}
	
	/*@Controller
	@RequestMapping(value="/upload")
	
	public class upload
	{
		@Autowired 
		private UserRepo u;
		
		@PostMapping
		public String uploadForm(@RequestParam("marks") int marks, @RequestParam("name") String name,@RequestParam("sub") String subject,@RequestParam("dos") Date date_of_Submission,@RequestParam("roll") int roll_no)
		{
			System.out.println("Inside function of inner class");
			//byte[] file=file1.getBytes();
			Student s1=new Student();
			s1.setDate_of_Submission(date_of_Submission);
			//s1.setFile(file);
			s1.setMarks(marks);
			s1.setName(name);
			s1.setRoll_no(roll_no);
			s1.setSubject(subject);
			u.save(s1);
			
			
			
		return "index";	
		}
		
	}
	
	@Bean(name="entityManagerFactory")
	public LocalSessionFactoryBean sessionFactory() {
	    LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

	    return sessionFactory;
	} */
	
}