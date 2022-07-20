package com.contact.controller;


import com.contact.services.ContactService;
import entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;



    @RequestMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId" ) Long userId){

        return this.contactService.getContactService(userId);
    }
}
