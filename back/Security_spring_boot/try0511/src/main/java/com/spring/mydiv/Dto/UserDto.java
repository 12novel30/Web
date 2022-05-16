package com.spring.mydiv.Dto;

import lombok.*;

import java.time.LocalDateTime;

import com.spring.mydiv.Domain.Entity.USER;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long User_id;
    private String UserName;
    private String Email;
    private String Password;
    private String Account;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    public USER toEntity(){
        return USER.builder()
        		.User_id(User_id)
        		.UserName(UserName)
        		.Email(Email)
        		.Password(Password)
        		.Account(Account)
                .build();
    }

    @Builder
    public UserDto(Long User_id, String UserName, String Email, String Password, String Account) {
        this.User_id = User_id;
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
        this.Account = Account;
    }
}