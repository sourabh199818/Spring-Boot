package com.contact.services;

import entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactSerImpl implements  ContactService{

    List<Contact> list = List.of
            (new Contact(1l, "SourabhBisht120@Gmail.com","Sourabh bsiht", 1L),
            new Contact(2l, "NagendraRana123@Gmail.com","Nagendra Rana", 2L),
            new Contact(3l, "AkaashRawat@Gmail.com","Akash Rawat", 3l));



    @Override
    public List<Contact> getContactService(Long userId) {
        return list.stream().filter(contact -> contact.getstuId().equals(userId)).collect(Collectors.toList());
    }
}
