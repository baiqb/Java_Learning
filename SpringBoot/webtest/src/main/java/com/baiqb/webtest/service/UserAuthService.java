package com.baiqb.webtest.service;

import com.baiqb.webtest.entity.UserData;
import com.baiqb.webtest.mapper.MainMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserAuthService implements UserDetailsService {
    @Resource
    MainMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserData data = mapper.findUserByName(username);
        if(data==null) throw new UsernameNotFoundException("用户" + username + "登录失败，用户名不存在！ ");
        return User
                .withUsername(data.getFullname())
                .password(new BCryptPasswordEncoder().encode("123456"))
                .roles("user")
                .build();
    }
}
