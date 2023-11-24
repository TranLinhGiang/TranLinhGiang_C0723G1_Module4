package com.example.validating_form_input.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotEmpty //không để trống
    @Size(min = 2, max = 30)  // độ dài ký tự ừ 2 đến 30
    private String name;

    @Min(18)  // tuổi có giá trị nhỏ nhất là 18 tuổi
    private int age;
}
