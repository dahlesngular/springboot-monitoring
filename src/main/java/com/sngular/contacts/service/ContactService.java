package com.sngular.contacts.service;

import com.sngular.contacts.entity.ContactEntity;
import com.sngular.contacts.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ContactService {


    @Autowired
    private ContactRepository contactRepository;

    public List<ContactEntity> listAll(){
        return contactRepository.findAll();
    }

    public Optional<ContactEntity> find(String id){
        return contactRepository.findById(id);
    }

    public ContactEntity create(ContactEntity contact) {
        return contactRepository.save(contact);
    }

    public void update(ContactEntity contact) {
        contactRepository.save(contact);
    }

    public void delete(ContactEntity contact) {
        contactRepository.save(contact);
    }
}
