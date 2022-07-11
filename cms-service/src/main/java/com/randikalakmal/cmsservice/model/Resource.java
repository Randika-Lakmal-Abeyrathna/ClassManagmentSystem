package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "resource")
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "url", length = 1000)
    private String url;

    @Column(name = "name", length = 45)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "lectuer_id", nullable = false)
    private Lectuer lectuer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lectuer getLectuer() {
        return lectuer;
    }

    public void setLectuer(Lectuer lectuer) {
        this.lectuer = lectuer;
    }

}