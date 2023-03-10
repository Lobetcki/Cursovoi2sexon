package task;

import enams.Type;
import exception.IncorrectArgumentException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {


    private static int idGenerator;
    private String title ;
    private final Type tupe;
    private final int id;

    private final LocalDateTime dateTimeate;


    private String description;

    public Task(String title, Type tupe, LocalDateTime dateTimeate, String description) {
        idGenerator++;
        this.id = idGenerator;
        this.tupe = tupe;
        this.dateTimeate = dateTimeate;
        setTitle(title);
        //this.title = title;
        setDescription(description);
        //this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return idGenerator == task.idGenerator && id == task.id && title.equals(task.title) && tupe == task.tupe && dateTimeate.equals(task.dateTimeate) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idGenerator, title, tupe, id, dateTimeate, description);
    }


    public int getId() {
        return id;
    }

    public Type getTupe() {
        return tupe;
    }

    public void setTitle(String title) throws IncorrectArgumentException {
        if (title == null || title.isBlank()) {
            throw new IncorrectArgumentException("Неверно введены данные");
        } else {
        this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) throws IncorrectArgumentException {
        if (title == null || title.isBlank()) {
            throw new IncorrectArgumentException("Неверно введены данные");
        } else {
            this.description = description;
        }
    }

    public LocalDateTime getDateTimeate() {
        return dateTimeate;
    }

    public String getDescription() {
        return description;
    }

    public abstract boolean appearsln(LocalDate localDate);

    @Override
    public String toString() {
        return "объект-Task{" +
                ", title='" + title + '\'' +
                ", tupe=" + tupe +
                ", id=" + id +
                ", dateTimeate=" + dateTimeate +
                ", description='" + description + '\'' +
                '}' + "\n";
    }
}


