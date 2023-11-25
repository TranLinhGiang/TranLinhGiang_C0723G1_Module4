package com.example.validate_form.controller;


import com.example.validate_form.dto.UserDto;
import com.example.validate_form.model.User;
import com.example.validate_form.service.IUserService;
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
@RequestMapping("/user")
public class FormController {
    @Autowired
    private IUserService userService;
    @GetMapping("/home")
    public String showForm(Model model) {
        UserDto userDto = new UserDto();
        model.addAttribute("userDto", userDto);
        return "user/home";
    }

    @PostMapping("/add")
    public String addForm(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult, RedirectAttributes attributes) {
        User user= new User();
        // custom thì phải thêm đoạn code dưới
        new UserDto().validate(userDto,bindingResult);
        //
        if (bindingResult.hasErrors()){
            return "user/home";
        }
        // copy dữ liệu từ userDto => user
        BeanUtils.copyProperties(userDto,user);
        userService.save(user);
        attributes.addFlashAttribute("mess","them moi thanh cong");
        return "redirect:/create";
    }
}
