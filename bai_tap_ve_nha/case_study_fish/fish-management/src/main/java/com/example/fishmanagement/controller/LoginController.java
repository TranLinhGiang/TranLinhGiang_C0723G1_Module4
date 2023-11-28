package com.example.fishmanagement.controller;

import com.example.fishmanagement.dto.LoginDto;
import com.example.fishmanagement.model.Login;
import com.example.fishmanagement.service.ILoginService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("")
public class LoginController {
    @Autowired
    private ILoginService loginService;
    @GetMapping
    public String showFormLogin(Model model){
        LoginDto loginDto= new LoginDto();
        model.addAttribute("loginDto", loginDto);
        return "/login";
    }
    @PostMapping("/home")
    public String add(@Validated @ModelAttribute LoginDto loginDto, BindingResult bindingResult, RedirectAttributes attributes){
        Login login= new Login();
        // custom thì phải thêm đoạn code dưới
        new LoginDto().validate(loginDto,bindingResult);
        //
        if (bindingResult.hasErrors()){
            return "/login";
        }
        // copy dữ lệu từ loginDto sang login
        BeanUtils.copyProperties(loginDto,login);
        loginService.save(login);
        return "home";
    }
}
