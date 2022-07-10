package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "image_data")
public class ImageDatum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idimage_data", nullable = false)
    private Integer id;

    @Column(name = "path")
    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}