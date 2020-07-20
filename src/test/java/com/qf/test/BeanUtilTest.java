package com.qf.test;

import com.qf.dto.UserDto;
import com.qf.pojo.User;
import com.qf.util.BeanCopyUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: brandshop
 * @description:
 * @author: money
 * @create: 2020-07-17 21:46
 */
public class BeanUtilTest {
    @Test
    public void testBeanUtil(){
        UserDto userDto = new UserDto();
        userDto.setUserName("张三");
        userDto.setUserPass("123");
        userDto.setUserPhone("15649150445");
        User user = BeanCopyUtil.copyDto(User.class,userDto,userDto.getClass().getDeclaredFields());
        System.out.println(user);
    }

}
