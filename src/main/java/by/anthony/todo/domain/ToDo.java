package by.anthony.todo.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.StringJoiner;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    private String description;
    private Timestamp created;
    private Timestamp modified;
    private boolean completed;

    public ToDo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getModified() {
        return modified;
    }

    public void setModified(Timestamp modified) {
        this.modified = modified;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ToDo toDo = (ToDo) o;
        if (completed != toDo.completed) return false;
        if (id != null ? !id.equals(toDo.id) : toDo.id != null) return false;
        if (description != null ? !description.equals(toDo.description) : toDo.description != null) return false;
        if (created != null ? !created.equals(toDo.created) : toDo.created != null) return false;
        return modified != null ? modified.equals(toDo.modified) : toDo.modified == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (modified != null ? modified.hashCode() : 0);
        result = 31 * result + (completed ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ToDo.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("description='" + description + "'")
                .add("created=" + created)
                .add("modified=" + modified)
                .add("completed=" + completed)
                .toString();
    }
}