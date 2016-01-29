package com.service;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2016/1/29 9:29
 * Desc:
 */

/**
 * 服务接口
 */
public interface ISayHelloService {

    /**
     * @param name
     * @return
     */
    String doSayHello(String name);

    /**
     * @param name
     * @param welcomeStr
     * @return
     */
    String doSayHello(String name, String welcomeStr);
}