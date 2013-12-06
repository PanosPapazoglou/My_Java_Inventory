package com.panos;

public class Members {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String name;
    
    public Members(String name){
        this.name = name;
    }
    
    public Members(){
        
    }
    
}
