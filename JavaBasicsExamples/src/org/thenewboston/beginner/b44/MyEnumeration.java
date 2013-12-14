package org.thenewboston.beginner.b44;

public enum MyEnumeration {
  bucky("nice", "22"),
  kelsey("cutie", "10"),
  julia("bigmistake", "12");
  
  private final String desc;
  private final String year;
  
  MyEnumeration(String description, String birthday){
     desc = description;
     year = birthday;
  }
  
  public String getDesc(){
     return desc;
  }
  
  public String getYear(){
     return year;
  }
}
