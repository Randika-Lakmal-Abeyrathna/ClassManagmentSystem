package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "student_has_class")
public class StudentHasClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lectuer_id", nullable = false)
    private Lectuer lectuer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lectuer getLectuer() {
        return lectuer;
    }

    public void setLectuer(Lectuer lectuer) {
        this.lectuer = lectuer;
    }

}