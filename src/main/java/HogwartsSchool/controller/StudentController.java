package HogwartsSchool.controller;

import HogwartsSchool.model.Student;
import HogwartsSchool.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> create(@RequestParam String name, @RequestParam int age) {
        return ResponseEntity.ok(studentService.create(name, age));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> read(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id, @RequestParam String name, @RequestParam int age) {
        return ResponseEntity.ok(studentService.update(id, name, age));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/age/{age}")
    public List<Student> filterStudentsByAge(@PathVariable int age) {
        return studentService.filterByAge(age);
    }
}
