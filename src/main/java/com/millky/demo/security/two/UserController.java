package com.millky.demo.security.two;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Slf4j
@Controller
public class UserController {

    @Autowired
    UserJoinService userJoinService;


    @GetMapping("/user")
    public String users(Principal principal) {
        log.debug("principal={}", principal);
        return "user";
    }

    @GetMapping("/login")
    public String loginForm(Model model, String status) {
        model.addAttribute("status", status);
        return "login";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "join";
    }

    @PostMapping("/join")
    public String join(User user) {
        userJoinService.join(user);
        return "redirect:/login?status=joinSuccess";
    }
}
