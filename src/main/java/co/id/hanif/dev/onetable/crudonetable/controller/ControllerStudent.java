package co.id.hanif.dev.onetable.crudonetable.controller;

import co.id.hanif.dev.onetable.crudonetable.entity.Student;
import co.id.hanif.dev.onetable.crudonetable.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



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

//  http://localhost:8080/demo/findAll
    @GetMapping(path = "/findAll")
    public @ResponseBody Iterable<Student> findAll(){
        return repositoryStudent.findAll();
    }

//  http://localhost:8080/demo/findById?id=10511173
    @GetMapping(path = "/findById")
    public @ResponseBody String findByStudentId(@RequestParam String id){
        return repositoryStudent.findByStudentId(id).toString();
    }

//  http://localhost:8080/demo/editName?name=Muhamad Hanif Muhsin, S.Kom&id=10511173
    @PutMapping(path ="/editName")
    @Transactional
    public @ResponseBody String editNameById(@RequestParam String name, @RequestParam String id){
        repositoryStudent.updateName(name,id);
        return "Updated";
    }

//  http://localhost:8080/demo/deleteById?id=10511150
    @Transactional
    @DeleteMapping(path = "/deleteById")
    public @ResponseBody String deleteStudentById(@RequestParam String id){
        repositoryStudent.deleteStudentById(id);
        return "Deleted";
    }



}
