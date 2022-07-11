package com.randikalakmal.cmsservice.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "user_token")
public class UserToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "expiry_data")
    private Instant expiryData;

    @Column(name = "token")
    private String token;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_email", nullable = false)
    private User userEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getExpiryData() {
        return expiryData;
    }

    public void setExpiryData(Instant expiryData) {
        this.expiryData = expiryData;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(User userEmail) {
        this.userEmail = userEmail;
    }

}