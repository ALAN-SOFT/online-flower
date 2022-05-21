package com.cl.flower.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String nickname;
    private String number;
    private String avatar;
}
