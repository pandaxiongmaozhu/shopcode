package com.dingli.shop.po;

public class UserVO {
  private Integer id;
  private Integer rid;
  private String username;
  private String mobile;
  private String email;
  private String token;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }
}
