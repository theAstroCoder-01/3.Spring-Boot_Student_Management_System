package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Student;
import net.javaguides.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		 Student student1 = new Student("Rafael", "Cervera", "rafael@gmail.com");
		 studentRepository.save(student1);

		 Student student2 = new Student("Astro", "Coder", "astro@gmail.com");
		 studentRepository.save(student2);

		 Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
		 studentRepository.save(student3);

		 Student student4 = new Student("Stephen", "Strange", "stephen@gmail.com");
		 studentRepository.save(student4);

		 Student student5 = new Student("Steve", "Rogers", "steve@gmail.com");
		 studentRepository.save(student5);

		 Student student6 = new Student("Natasha", "Romanov", "natasha@gmail.com");
		 studentRepository.save(student6);

		 Student student7 = new Student("Peter", "Quill", "peter@gmail.com");
		 studentRepository.save(student7);

	}
}
