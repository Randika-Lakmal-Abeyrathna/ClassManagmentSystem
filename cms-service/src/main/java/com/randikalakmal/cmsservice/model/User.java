package com.randikalakmal.cmsservice.model;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "email", nullable = false, length = 300)
    private String id;

    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "middle_name", length = 45)
    private String middleName;

    @Column(name = "last_name", length = 45)
    private String lastName;

    @Column(name = "address_no", length = 25)
    private String addressNo;

    @Column(name = "address_street", length = 75)
    private String addressStreet;

    @Column(name = "address_street2", length = 75)
    private String addressStreet2;

    @Column(name = "contact_number1")
    private Integer contactNumber1;

    @Column(name = "contact_number2")
    private Integer contactNumber2;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private Integer enabled;

    @Column(name = "createddate")
    private Instant createddate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_type_iduser_type", nullable = false)
    private UserType userTypeIduserType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status_idstatus", nullable = false)
    private Status statusIdstatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_data_idimage_data")
    private ImageDatum imageDataIdimageData;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "salutation_idsalutation", nullable = false)
    private Salutation salutationIdsalutation;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "gender_idgender", nullable = false)
    private Gender genderIdgender;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_idcity", nullable = false)
    private City cityIdcity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "marital_status_id", nullable = false)
    private MaritalStatus maritalStatus;

    @Column(name = "lastmodifieddate")
    private LocalDate lastmodifieddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressStreet2() {
        return addressStreet2;
    }

    public void setAddressStreet2(String addressStreet2) {
        this.addressStreet2 = addressStreet2;
    }

    public Integer getContactNumber1() {
        return contactNumber1;
    }

    public void setContactNumber1(Integer contactNumber1) {
        this.contactNumber1 = contactNumber1;
    }

    public Integer getContactNumber2() {
        return contactNumber2;
    }

    public void setContactNumber2(Integer contactNumber2) {
        this.contactNumber2 = contactNumber2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Instant getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Instant createddate) {
        this.createddate = createddate;
    }

    public UserType getUserTypeIduserType() {
        return userTypeIduserType;
    }

    public void setUserTypeIduserType(UserType userTypeIduserType) {
        this.userTypeIduserType = userTypeIduserType;
    }

    public Status getStatusIdstatus() {
        return statusIdstatus;
    }

    public void setStatusIdstatus(Status statusIdstatus) {
        this.statusIdstatus = statusIdstatus;
    }

    public ImageDatum getImageDataIdimageData() {
        return imageDataIdimageData;
    }

    public void setImageDataIdimageData(ImageDatum imageDataIdimageData) {
        this.imageDataIdimageData = imageDataIdimageData;
    }

    public Salutation getSalutationIdsalutation() {
        return salutationIdsalutation;
    }

    public void setSalutationIdsalutation(Salutation salutationIdsalutation) {
        this.salutationIdsalutation = salutationIdsalutation;
    }

    public Gender getGenderIdgender() {
        return genderIdgender;
    }

    public void setGenderIdgender(Gender genderIdgender) {
        this.genderIdgender = genderIdgender;
    }

    public City getCityIdcity() {
        return cityIdcity;
    }

    public void setCityIdcity(City cityIdcity) {
        this.cityIdcity = cityIdcity;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public LocalDate getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(LocalDate lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

}