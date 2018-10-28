package com.imooc.miaosha.dao;

import com.imooc.miaosha.domain.MiaoshaUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author: woodpecker
 * @Date: 2018/8/25 21:49
 */

@Mapper
public interface MiaoshaUserDao {

    @Select("select * from miaosha_user where mobile = #{id}")
    public MiaoshaUser getById(@Param("id")long  id);
}
