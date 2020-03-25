package com.lwy.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 5231134212346077681L;

    private String name;
    private Integer age;
    private char six;
}
