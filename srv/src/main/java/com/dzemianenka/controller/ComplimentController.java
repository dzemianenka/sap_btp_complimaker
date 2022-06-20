package com.dzemianenka.controller;

import com.dzemianenka.genarator.ComplimentGen;
import com.dzemianenka.model.Gender;
import com.dzemianenka.model.Name;
import com.dzemianenka.model.Number;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ComplimentController {

    private Name name = null;

    private final ComplimentGen complimentGen;

    public ComplimentController(ComplimentGen complimentGen) {
        this.complimentGen = complimentGen;
    }

    @GetMapping
    public String complimentGet(Model model) {
        model.addAttribute("name", new Name());
        return "index";
    }

    @PostMapping
    public String compliment(Name name) {
        this.name = name;
        return "redirect:/complimenter";
    }

    @GetMapping("/complimenter")
    public String complimentPage(Model model) {
        Name name = new Name();
        String userName = this.name.getMyName();
        System.out.println(this.name.getMyName());
        Gender gender = this.name.getGender();
        name.setMyName((userName.isEmpty() ? "Пользователь" : userName) + complimentGen.getPhrase(gender));

        Number number = new Number();
        number.setNum(complimentGen.getNumber());

        model.addAttribute("number" , number);
        model.addAttribute("name", name);
        return "compliment";
    }

    @GetMapping("/enough")
    public String enoughCompliments() {
        return "enough-compliment";
    }
}
