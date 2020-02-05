package co.id.hanif.dev.onetable.crudonetable.controller;

import co.id.hanif.dev.onetable.crudonetable.entity.Student;
import co.id.hanif.dev.onetable.crudonetable.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/demo")
public class ControllerStudent {
    @Autowired
    private RepositoryStudent repositoryStudent;

//  http://localhost:8080/demo/add?id=10511173&name=Muhamad Hanif Muhsin
    @PostMapping(path = "/add")
    public @ResponseBody String addNewStudent(@RequestParam String id, @RequestParam String name){
        Student student = new Student();
        student.setStudentId(id);
        student.setStudentName(name);
        repositoryStudent.save(student);
        return student.toString();
    }


}
