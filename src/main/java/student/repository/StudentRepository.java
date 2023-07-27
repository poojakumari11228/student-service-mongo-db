package student.repository;

import student.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
    Student findByPhoneNumber(String phone);
    Student findByName(String name);

    @Query("{'address.city' : ?0}")
    List<Student>  findStudentWithCity(String city);

}

