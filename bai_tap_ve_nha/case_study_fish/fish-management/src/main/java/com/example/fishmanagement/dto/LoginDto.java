package com.example.fishmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto implements Validator {
    private int id;
    private String name;
    private String passWork;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        LoginDto loginDto = (LoginDto) target;
        if ("".equals(loginDto.name)) {
            errors.rejectValue("name", null, "Không được để trống");
        } else if (!loginDto.name.matches("^Tran\\sLinh\\sGiang$")) {
            errors.rejectValue("name", null, "Chưa có tên tài khoản này");
        }else if ("".equals(loginDto.passWork)) {
            errors.rejectValue("passWork", null, "Không được để trống");
        }
    }
}
