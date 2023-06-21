package HogwartsSchool.service;

import HogwartsSchool.model.Faculty;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    private final Map<Long, Faculty> faculties = new HashMap<>();
    private Long idCounter = 1L;

    public Faculty create(String name, String color) {
        Faculty faculty = new Faculty(idCounter, name, color);
        faculties.put(idCounter++, faculty);
        return faculty;
    }

    public Faculty read(Long id) {
        return faculties.get(id);
    }

    public Faculty update(Long id, String name, String color) {
        Faculty faculty = faculties.get(id);
        if (faculty != null) {
            faculty.setName(name);
            faculty.setColor(color);
        }
        return faculty;
    }


    public void delete(Long id) {
        faculties.remove(id);
    }

    public List<Faculty> filterByColor(String color) {
        return faculties.values().stream()
                .filter(faculty -> faculty.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }
}


