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

    @GeneratedValue(strategy = GenerationType.IDENTITY)// id tự tăng
    private int id;
//    @NotEmpty
//    @Size(min = 5, max = 45)
    private String firstName;

//    @NotEmpty
//    @Size(min = 5, max = 45)
    private String lastname;

//    @Pattern(regexp = "(84|0[3|5|7|8|9])+([0-9]{8})", message = "số điện thoại không đúng định dạng")
    private String phoneNumber;

//    @Pattern(regexp = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+$", message = "email không đúng định dạng")
    private String email;

//    @Min(18)
    private int age;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if ("".equals(userDto.firstName)) {
            errors.rejectValue("firstName", null, "Yeu cau nhap");
        } else if (!userDto.firstName.matches("^[A-Z][a-z]+$")) {
            errors.rejectValue("firstName", null, "chua dung dinh dang");
        }else if (userDto.firstName.length()<4||userDto.firstName.length()>45){
            errors.rejectValue("firstName",null,"do dai toi thieu 5ky tu,toi da 45 ky tu");
        }else if ("".equals(userDto.lastname)){
            errors.rejectValue("lastName",null,"yeu cau nhap");
        } else if (!userDto.lastname.matches("^[A-Z][a-z]+$")) {
            errors.rejectValue("lastName", null, "chua dung dinh dang");
        } else if (userDto.lastname.length()<4||userDto.lastname.length()>45) {
            errors.rejectValue("lastName",null,"do dai toi thieu 5ky tu,toi da 45 ky tu");
        } else if ("".equals(userDto.phoneNumber)) {
            errors.rejectValue("phoneNumber",null,"yeu cau nhap so dien thoai");
        } else if (!userDto.phoneNumber.trim().matches("^(0||84)\\d{9}$")) {
            errors.rejectValue("phoneNumber",null,"sai dinh dang");
        } else if ("".equals(userDto.age)) {
            errors.rejectValue("age", null,"yeu cau nhap tuoi");
        } else if (userDto.age<18|| userDto.age>120) {
            errors.rejectValue("age", null,"so tuoi phai lon hon hoac bang 18 tuoi");
        } else if ("".equals(userDto.email)) {
            errors.rejectValue("email", null,"yeu cau nhap email");
        } else if (!userDto.email.matches("^[a-zA-Z0-9_.]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+$")) {
            errors.rejectValue("email",null,"email ban nhap khong dung dinh dang");
        }
    }
}
