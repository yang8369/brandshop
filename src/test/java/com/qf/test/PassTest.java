package com.qf.test;

import com.qf.util.EncryptUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: brandshop
 * @description: 测试密码的加解密
 * @author: money
 * @create: 2020-07-18 13:01
 */
public class PassTest {
    @Test
    public void testPass(){
      String  key = EncryptUtil.createAESKey();
        System.out.println(key);
        String pass = "123456";
        String wm = EncryptUtil.aesenc(key, pass);
        System.out.println("密文："+wm);
        String rm = EncryptUtil.aesdec(key, wm);
        System.out.println("解密："+rm);

    }

}
