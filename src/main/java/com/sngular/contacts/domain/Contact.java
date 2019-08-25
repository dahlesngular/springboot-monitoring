package com.sngular.contacts.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

}
