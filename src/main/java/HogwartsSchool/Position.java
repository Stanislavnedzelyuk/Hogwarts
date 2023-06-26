package HogwartsSchool;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import nonapi.io.github.classgraph.json.Id;

@Entity
public class Position {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
