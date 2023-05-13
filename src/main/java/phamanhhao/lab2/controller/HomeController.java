package phamanhhao.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import phamanhhao.lab2.entity.Contact;


@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String index(){
        return "Home/index";
    }
    @GetMapping("/contact")
    public String showContactForm(Model model){
        model.addAttribute("contact",new Contact());
        return "Home/contact";

    }
    @PostMapping("/contact")
    public  String submitContact(@ModelAttribute("contact")Contact contact,Model model){
        model.addAttribute("contact",contact);
        return "Home/result";
    }
}

