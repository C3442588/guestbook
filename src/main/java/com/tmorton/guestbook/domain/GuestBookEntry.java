package com.tmorton.guestbook.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "entries")
public class GuestBookEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty
    private String user;
    @NotEmpty
    private String comment;

    public GuestBookEntry() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "GuestBookEntry{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
