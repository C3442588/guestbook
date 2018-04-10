package com.tmorton.guestbook.service;

import com.tmorton.guestbook.domain.GuestBookEntry;
import com.tmorton.guestbook.domain.GuestBookEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class GuestBookService {
    @Autowired
    private GuestBookEntryRepository guestBookEntryRepository;
    public List<GuestBookEntry> findAllEntries () {
        return this.guestBookEntryRepository.findAll ();
    }
}