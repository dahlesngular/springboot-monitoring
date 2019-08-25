package com.sngular.contacts.controller;

import com.sngular.contacts.domain.Contact;
import com.sngular.contacts.manager.ContactManager;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping(value = "/api/v1/contacts")
public class ContactController {

    @Autowired
    private ContactManager contactManager;

    @GetMapping
    public List<Contact> listAll(){
        return contactManager.listAll();
    }

    @GetMapping(value = "/{id}")
    @Timed(value = "com.sngular.contact.find", longTask = true)
    public Contact find(@PathVariable("id") String id){
        return contactManager.find(id);
    }

    @PostMapping
    @Timed(value = "com.sngular.contact.create", longTask = true)
    public Contact create(@RequestBody Contact contact){
        return contactManager.create(contact);
    }

    @PutMapping
    @Timed(value = "com.sngular.contact.update", longTask = true)
    public void update(@RequestBody Contact contact){
        contactManager.update(contact);
    }

    @DeleteMapping
    @Timed(value = "com.sngular.contact.delete", longTask = true)
    public void delete(@RequestBody Contact contact){
        contactManager.delete(contact);
    }
}
