package com.nurvadli.rest.xml.restxml.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Nurvadli
 */
@Entity
@Data
@Table(name = "employee")
@JacksonXmlRootElement(localName = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "age")
    private int age;

    @Column(name = "delete_flag")
    private boolean deleteFlag;

}

