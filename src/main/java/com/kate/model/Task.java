package com.kate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by je4282oi on 4/5/2018.
 */
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String text;

    private boolean urgent;

    public Task() {} //empty constructor, needed

    public Long getId() {        return id;    }

    public void setId(Long id) {        this.id = id;    }

    public String getText() {         return text;    }

    public void setText(String text) {        this.text = text;    }

    public boolean isUrgent() {        return urgent;    }

    public void setUrgent(boolean urgent) {        this.urgent = urgent;    }

    @Override
    public String toString() {
        return "Task{" +
                "id = " + id +
                ", text = '" + text + '\'' +
                ", urgent = " + urgent +
                '}';
    }
}
