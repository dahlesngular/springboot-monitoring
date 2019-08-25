package com.sngular.contacts.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "contacts")
@Data
public class ContactEntity implements Serializable {
    private static final long serialVersionUID = 2L;

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
