package com.drouj.mvcproject.dao;

/**
 * Created by Dmitri on 15.07.2015.
 */

import com.drouj.mvcproject.domain.Contact;

import java.util.List;

public interface ContactDAO {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
