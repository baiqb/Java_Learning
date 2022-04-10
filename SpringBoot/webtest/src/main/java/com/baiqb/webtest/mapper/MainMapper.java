package com.baiqb.webtest.mapper;

import com.baiqb.webtest.entity.UserData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MainMapper {
    @Select("select * from t_user where fullname = #{fullname}")
    UserData findUserByName(String fullname);
}
