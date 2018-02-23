package com.ncs.sorsoldki.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Lottery implements Serializable
{

  @Id
  @GeneratedValue
  private Long id;

  @Column(nullable = false)
  private String name;

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}