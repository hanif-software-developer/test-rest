package co.id.hanif.dev.onetable.crudonetable.repository;

import co.id.hanif.dev.onetable.crudonetable.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;


public interface RepositoryStudent extends JpaRepository<Student,Integer> {
    @Query(value = "SELECT * FROM students WHERE student_id = ?1", nativeQuery = true)
    Student findByStudentId(String studentId);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE Student s SET s.studentName = ?1 WHERE s.studentId =?2")
    void updateName(String name, String id);

    @Modifying
    @Query("DELETE FROM Student s WHERE s.studentId =?1 ")
    void deleteStudentById(String id);



}
