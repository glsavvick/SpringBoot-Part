package com.humutkazan.projectmanagement.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startdate")
    private Date startdate;

//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "enddate")
    private Date enddate;

    @Column(name = "people")
    private String people;

    @Column(name = "github")
    private String github;

    @Column(name = "published")
    private boolean published;

    public Project() {

    }

    public Project(String title, String description, boolean published, Date startdate, Date enddate, String people, String github) {
        this.title = title;
        this.description = description;
        this.published = published;
        this.startdate = startdate;
        this.enddate = enddate;
        this.people = people;
        this.github = github;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startdate;
    }

    public void setStartDate(Date startDate) {
        this.startdate = startDate;
    }

    public Date getEndDate() {
        return enddate;
    }

    public void setEndDate(Date endDate) {
        this.enddate = endDate;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }


}
