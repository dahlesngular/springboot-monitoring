package com.sngular.contacts.mapper;
import com.sngular.contacts.domain.Contact;
import com.sngular.contacts.entity.ContactEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);
    ContactEntity contactToContactEntity(Contact contact);
    Contact contactEntityToContact(ContactEntity contactEntity);
}

