package com.randikalakmal.cmsservice.model;

import javax.persistence.*;

@Entity
@Table(name = "salutation")
public class Salutation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsalutation", nullable = false)
    private Integer id;

    @Column(name = "salutation", length = 45)
    private String salutation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

}