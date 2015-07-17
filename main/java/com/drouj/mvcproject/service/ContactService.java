package com.drouj.mvcproject.service;

import com.drouj.mvcproject.domain.Contact;

import java.util.List;

/**
 * Created by Dmitri on 15.07.2015.
 */
public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
