package com.baizhi.controller;


import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import com.baizhi.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("per")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/queryAll")
    public String queryAll(HttpSession session){
        List<Person> list = personService.queryAll();
        session.setAttribute("list",list);
        return "index";
    }
}
