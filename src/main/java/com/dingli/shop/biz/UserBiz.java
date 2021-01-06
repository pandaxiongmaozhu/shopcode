package com.dingli.shop.biz;

import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;

public interface UserBiz {
  UserVO findUser(User user);
}
