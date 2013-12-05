/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * To Session Scoped to bazoume epeidi theloume na metaferoume data metaxi 2 pages
 * 
 * Java Server Faces Tutorial 4 - Managed Bean
 */

package com.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User {
    
    private String name;
    
    // Getter Method for Instance Variable Name
    public String getName(){
        return name;
    }
    
    // Setter Method for Instance Variable Name
    public void setName(String name1){
        this.name = name1;
    }
    
}
