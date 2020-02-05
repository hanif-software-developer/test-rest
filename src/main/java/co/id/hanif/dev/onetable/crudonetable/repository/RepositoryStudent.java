package co.id.hanif.dev.onetable.crudonetable.repository;

import co.id.hanif.dev.onetable.crudonetable.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryStudent extends CrudRepository <Student,Integer> {
    public List<Student> findAll();
}
