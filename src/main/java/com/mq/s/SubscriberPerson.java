package com.mq.s;

import java.io.Serializable;

public class SubscriberPerson implements Serializable {

  private static final long serialVersionUID = 1L;

  private String name;
  private int age;
  
  public SubscriberPerson() { }
  
  public SubscriberPerson(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String toString() {
    return "Person [name=" + name + ", age=" + age + "]";
  }  
}
