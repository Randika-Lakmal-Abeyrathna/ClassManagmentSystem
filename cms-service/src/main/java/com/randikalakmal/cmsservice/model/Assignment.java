package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "assignment")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "uri", length = 1000)
    private String uri;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lectuer_id", nullable = false)
    private Lectuer lectuer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Lectuer getLectuer() {
        return lectuer;
    }

    public void setLectuer(Lectuer lectuer) {
        this.lectuer = lectuer;
    }

}