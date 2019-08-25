package com.sngular.contacts.manager;

import com.sngular.contacts.domain.Contact;
import com.sngular.contacts.mapper.ContactMapper;
import com.sngular.contacts.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactManager {

    @Autowired
    private ContactService contactService;

    private ContactMapper mapper=ContactMapper.INSTANCE;

    public List<Contact> listAll() {
        return contactService.listAll().stream()
                .map(c -> mapper.contactEntityToContact(c)).collect(Collectors.toList());
    }

    public Contact find(String id) {
        return mapper.contactEntityToContact(contactService.find(id).get());
    }

    public Contact create(Contact contact) {
        return mapper.contactEntityToContact(contactService.create(mapper.contactToContactEntity(contact)));
    }

    public void update(Contact contact) {
        contactService.update(mapper.contactToContactEntity(contact));

    }

    public void delete(Contact contact) {
        contactService.delete(mapper.contactToContactEntity(contact));
    }
}
