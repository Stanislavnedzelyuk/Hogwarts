package HogwartsSchool.service;

import HogwartsSchool.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final Map<Long, Student> students = new HashMap<>();
    private Long idCounter = 1L;

    public Student create(String name, int age) {
        Student student = new Student(idCounter, name, age);
        students.put(idCounter++, student);
        return student;
    }

    public Student read(Long id) {
        return students.get(id);
    }

    public Student update(Long id, String name, int age) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
        }
        return student;
    }

    public void delete(Long id) {
        students.remove(id);
    }

    public List<Student> filterByAge(int age) {
        return students.values().stream()
                .filter(student -> student.getAge() == age)
                .collect(Collectors.toList());
    }
}

