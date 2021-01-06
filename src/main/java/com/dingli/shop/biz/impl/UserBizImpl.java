package com.dingli.shop.biz.impl;

import com.dingli.shop.biz.UserBiz;
import com.dingli.shop.dao.UserDao;
import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {
  @Autowired
  private UserDao userDao;

  @Override
  public UserVO findUser(User user) {
    try {
      return userDao.findUser(user);
    }catch (Exception e){
      return null;
    }
  }
}
