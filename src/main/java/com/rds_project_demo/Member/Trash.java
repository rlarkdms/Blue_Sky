package com.rds_project_demo.Member;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trash")
public class Trash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    private String dong;
    private String street;
    public String location;
    private String location_setting;
    private String bin;
    private String bin_form;
    private String year;
    private String director;
    private float latitude;
    private float longitude;
}

