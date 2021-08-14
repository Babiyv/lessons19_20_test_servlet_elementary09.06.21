package com.hillel.dto;

import lombok.Data;

// DTO (data transfer object) - промежуточные объект, который мы создаем только с необходимыми для передачи
// на фронт-энд полями. Например нам не нужно передавать пароль или еще что-то, в таком случае мы просто создаем отдельный DTO под наши условия;
@Data
public class CustomerDto {
    private int id;
    private String name;
    private String surname;
    private String email;
}