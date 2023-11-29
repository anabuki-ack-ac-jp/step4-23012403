package com.classroom.assignment.model.request;

public class Student {
  private String id;
  private String name;
  private String sub;


  public Student(String id, String name, String sub) {
    this.setId(id);
    this.setName(name);
    this.setSub(sub);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }


}
