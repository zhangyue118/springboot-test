package com.yue.testwebservice.service;

import com.yue.testwebservice.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

/**
 * @author: zhangyue
 * @date: 2019/1/3 10:50
 * @description:
 */
@WebService
public interface UserService {

    @WebMethod
    String getName(@WebParam(name = "userId") String userId);

    @WebMethod
    User getUser(String userI);

    @WebMethod
    ArrayList<User> getAlLUser();

}
