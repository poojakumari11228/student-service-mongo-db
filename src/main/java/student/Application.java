package student;

import student.domain.Address;
import student.domain.Student;
import student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("----------- Add 5 Students  ----------------");

		Address add1 = Address.builder()
				.id(1)
				.street("1000 N, 4th St")
				.city("fairfield")
				.zip("52557")
				.build();

		Student st = Student.builder()
				.id(1)
				.name("John")
				.email("john@gmail.com")
				.address(add1)
				.phoneNumber("123456789")
				.build();

		Address add2 = Address.builder()
				.id(2)
				.street("800 N, 4th St")
				.city("fairfield")
				.zip("55666")
				.build();

		Student st2 = Student.builder()
				.id(2)
				.name("Jack")
				.email("jack@gmail.com")
				.address(add2)
				.phoneNumber("3456782")
				.build();

		Address add3 = Address.builder()
				.id(3)
				.street("8000 N, 4th St")
				.city("ottoumwa")
				.zip("52066")
				.build();

		Student st3 = Student.builder()
				.id(3)
				.name("mike")
				.email("mike@gmail.com")
				.address(add3)
				.phoneNumber("8765429378")
				.build();

		Address add4 = Address.builder()
				.id(4)
				.street("700 N, 4th St")
				.city("austin")
				.zip("55556")
				.build();

		Student st4 = Student.builder()
				.id(4)
				.name("maggie")
				.email("maggie@gmail.com")
				.address(add4)
				.phoneNumber("2223456782")
				.build();

		Address add5 = Address.builder()
				.id(5)
				.street("800 N, 4th St")
				.city("dalton")
				.zip("24556")
				.build();

		Student st5 = Student.builder()
				.id(5)
				.name("henna")
				.email("henna@gmail.com")
				.address(add5)
				.phoneNumber("378729456782")
				.build();

		studentRepository.save(st);
		studentRepository.save(st2);
		studentRepository.save(st3);
		studentRepository.save(st4);
		studentRepository.save(st5);

		System.out.println("-------- find all students");
		System.out.println(studentRepository.findAll());
		System.out.println("-------- find student by name: John");
		System.out.println(studentRepository.findByName("John"));
		System.out.println("-------- find student by PhoneNumber: 8765429378");
		System.out.println(studentRepository.findByPhoneNumber("8765429378"));
		System.out.println("-------- find student by City: Fairfield");
		System.out.println(studentRepository.findStudentWithCity("fairfield"));


	}

}
