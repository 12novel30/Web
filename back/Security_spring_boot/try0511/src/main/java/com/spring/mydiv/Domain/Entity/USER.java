package com.spring.mydiv.Domain.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "USER")
@Entity
public class USER {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long User_id;

    @Column(length = 200, nullable = false)
    private String UserName;
    @Column(length = 200, nullable = false)
    private String email;
    @Column(length = 200, nullable = false)
    private String Password;
    @Column(length = 200, nullable = false)
    private String Account;

    @Builder
    public USER(Long User_id, String UserName, String Email, String Password, String Account) {
        this.User_id = User_id;
        this.UserName = UserName;
        this.email = Email;
        this.Password = Password;
        this.Account = Account;
    }
}