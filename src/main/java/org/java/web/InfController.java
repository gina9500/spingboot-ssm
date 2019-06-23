package org.java.web;

import org.java.Service.InfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class InfController {

    @Autowired
    private InfService infService;

    @GetMapping("findAll")
    public String findAll(Model model){
        List<Map> list = infService.findAll();
        model.addAttribute("list", list);
        return "show";
    }
}
