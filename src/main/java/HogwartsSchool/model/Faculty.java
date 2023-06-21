package HogwartsSchool.model;

import java.util.Objects;

public class Faculty {
    private long id;
    private String name;
    private String color;

    public Faculty(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = String.valueOf(Integer.parseInt(color));
    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = String.valueOf(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty faculty)) return false;
        return getColor() == faculty.getColor() && Objects.equals(getId(), faculty.getId()) && Objects.equals(getName(), faculty.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getColor());
    }
}
