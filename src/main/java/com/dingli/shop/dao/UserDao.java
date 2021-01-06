package com.dingli.shop.dao;

import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;

public interface UserDao {
  UserVO findUser(User user);
}
