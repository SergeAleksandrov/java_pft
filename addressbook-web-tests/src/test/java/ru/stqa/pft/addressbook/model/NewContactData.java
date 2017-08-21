package ru.stqa.pft.addressbook.model;

public class NewContactData {
  private final String name;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String mobile;
  private final String email;

  public NewContactData(String name, String lastname, String nickname, String company, String mobile, String email) {
    this.name = name;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.mobile = mobile;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }
}
