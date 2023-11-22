package com.example.tu_dien.controller;

import com.example.tu_dien.service.IWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.stream.Stream;

@Controller
@RequestMapping("")
public class WorkController {
  @Autowired
  private IWorkService workService;
  @GetMapping("/home")
    public String showHome(){
      return "/home";
  }
  @PostMapping("/search")
  public String search(@RequestParam String work, Model model){
    String works= workService.search(work);
    model.addAttribute("list", works);
    return "/home";
  }
}
