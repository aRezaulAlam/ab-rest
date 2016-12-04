package com.aimslabs.domains.pojo;

import javax.persistence.Embeddable;

/**
 * Created by sayemkcn on 11/11/16.
 */
@Embeddable
public class Address {
    private String homeAddress;
    private String street_village;
    private String union_ward;
    private String district;
    private String upazila;
    private String division;

    public String getStreet_village() {
        return street_village;
    }

    public void setStreet_village(String street_village) {
        this.street_village = street_village;
    }

    public String getUnion_ward() {
        return union_ward;
    }

    public void setUnion_ward(String union_ward) {
        this.union_ward = union_ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street_village='" + street_village + '\'' +
                ", union_ward='" + union_ward + '\'' +
                ", district='" + district + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
