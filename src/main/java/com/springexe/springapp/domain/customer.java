package com.springexe.springapp.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fstName;
    private String lstName;


    public void setFstName(String fstName) {
        this.fstName = fstName;
    }

    public String getFstName() {
        return fstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public String getLstName() {
        return lstName;
    }
}
