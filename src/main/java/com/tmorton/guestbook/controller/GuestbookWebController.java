package com.tmorton.guestbook.controller;

import com.tmorton.guestbook.service.GuestBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestbookWebController {
    @Autowired
    private GuestBookService guestBookService;

    private static final String GUESTBOOK_TEMPLATE = "guestbook";
    private static final String ENTRIES_TEMPLATE_ID = "entries";


    @GetMapping ("/")
    public String displayGuestBook (Model model) {
        model.addAttribute (ENTRIES_TEMPLATE_ID, this.guestBookService.findAllEntries ());
        return GUESTBOOK_TEMPLATE;
    }
}

