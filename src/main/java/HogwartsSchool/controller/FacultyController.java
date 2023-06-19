package HogwartsSchool.controller;



import HogwartsSchool.model.Faculty;
import HogwartsSchool.service.FacultyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/faculty")
public class FacultyController {

    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping
    public ResponseEntity<Faculty> create(@RequestParam String name, @RequestParam String color) {
        return ResponseEntity.ok(facultyService.create(name, color));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Faculty> read(@PathVariable Long id) {
        return ResponseEntity.ok(facultyService.read(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Faculty> update(@PathVariable Long id, @RequestParam String name, @RequestParam String color) {
        return ResponseEntity.ok(facultyService.update(id, name, color));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        facultyService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/color/{color}")
    public List<Faculty> filterFacultiesByColor(@PathVariable String color) {
        return facultyService.filterByColor(color);
    }

}




