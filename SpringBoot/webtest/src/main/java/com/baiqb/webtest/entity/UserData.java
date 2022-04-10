package com.baiqb.webtest.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserData {
    String id;
    String fullname;
    String nickname;
    String email;
    String parentEmail;
    LocalDateTime createTime;
    LocalDateTime updateTime;
    String avatar;
    String level1Department;
    String level2Department;
    String level3Department;
    String openidInfo;
    String sub;
}
