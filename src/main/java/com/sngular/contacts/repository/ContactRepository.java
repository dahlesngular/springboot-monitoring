package com.sngular.contacts.repository;

import com.sngular.contacts.entity.ContactEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ContactRepository extends MongoRepository<ContactEntity, String> {

}
