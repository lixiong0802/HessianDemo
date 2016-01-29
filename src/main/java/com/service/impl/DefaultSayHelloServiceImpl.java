package com.service.impl;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 9:31
 * Desc:
 */

import com.service.ISayHelloService;

/**
 * 服务接口实现
 */
public class DefaultSayHelloServiceImpl implements ISayHelloService {

    public String doSayHello(String name) {
        return doSayHello(name, "hello");
    }

    public String doSayHello(String name, String welcomeStr) {
        return name + "," + welcomeStr;
    }
}