package com.example.validate_form.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
public class UserDto implements Validator {

    private String firstName;


    private String lastName;

    private String phoneNumber;

    private String email;

    private int age;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if ("".equals(userDto.firstName)) {
            errors.rejectValue("firstName", null, "yêu cầu nhập tên ");
        } else if (!userDto.firstName.matches("^(\\w+)\\s(\\w+)$")) {
            errors.rejectValue("firstName", null, "chưa đúng định dạng");
        }else if (userDto.firstName.length()<4||userDto.firstName.length()>45){
            errors.rejectValue("firstName",null,"độ dài tối thiểu 5 ký tự,tối đa 45 ký tự");
        }else if ("".equals(userDto.lastName)){
            errors.rejectValue("lastName",null,"yêu cầu nhập họ");
        } else if (!userDto.lastName.matches("^[A-Z][a-z]+$")) {
            errors.rejectValue("lastName", null, "chưa đúng định dạng");
        } else if (userDto.lastName.length()<4||userDto.lastName.length()>45) {
            errors.rejectValue("lastName",null,"độ dài tối thiểu 5 ký tự,tối đa 45 ký tự");
        } else if ("".equals(userDto.phoneNumber)) {
            errors.rejectValue("phoneNumber",null,"phải nhập số điện thoại");
        } else if (!userDto.phoneNumber.trim().matches("^(0|84)[0-9]{9}$")) {
            errors.rejectValue("phoneNumber",null,"sai định dạng, bắt đầu 0 và đủ 10 chữ số");
        } else if ("".equals(userDto.age)) {
            errors.rejectValue("age", null,"yêu cầu nhập tuổi");
        } else if (userDto.age<18|| userDto.age>120) {
            errors.rejectValue("age", null,"số tuổi lớn hơn hặc bằng 18");
        } else if ("".equals(userDto.email)) {
            errors.rejectValue("email", null,"yêu cầu nhập eamil");
        } else if (!userDto.email.matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+$")) {
            errors.rejectValue("email",null,"email không đúng định dạng");
        }
    }
}
