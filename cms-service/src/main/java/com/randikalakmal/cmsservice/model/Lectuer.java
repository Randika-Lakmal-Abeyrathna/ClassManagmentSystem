package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "lectuer")
public class Lectuer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "weekday", length = 45)
    private String weekday;

    @Column(name = "start_time", length = 45)
    private String startTime;

    @Column(name = "end_time", length = 45)
    private String endTime;

    @Column(name = "duration", length = 45)
    private String duration;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "teachers_subject_id", nullable = false)
    private TeachersSubject teachersSubject;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public TeachersSubject getTeachersSubject() {
        return teachersSubject;
    }

    public void setTeachersSubject(TeachersSubject teachersSubject) {
        this.teachersSubject = teachersSubject;
    }

}