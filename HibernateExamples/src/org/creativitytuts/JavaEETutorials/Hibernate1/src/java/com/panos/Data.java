package com.panos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

@ManagedBean
@SessionScoped
public class Data {
    
    // This object will stored into database
    private Members m;
    
    // This object will help us retrieve SessionFactory Object from our HibernateUtil Java Class..
    private HibernateUtil helper;
    
    // Session Object - This will help us save the member object into the database
    private Session session;
    
    // Gia na apothikeysoume to name apo tin basi (retrieve) dilonoume ena String name
    private String name;
    

    
    
    // WRITE TO DATABASE //
    // ----------------- //
    // This method will add a member object into Database
    public void addMember(){
        
        // We initialize  Member Object - creating a Member Object with name Steve
        m = new Members("Steve");
        
        // Pairounme to Session apo tin SessionFactory
        session = helper.getSessionFactory().openSession();
        
        
        // Save Starts //
        
        //    Begin Transaction
        // Having our Hibernate Object Session obdained from SessionFactory Object
        // .. we are reaady to begin our Transaction
        session.beginTransaction();
        
        
        //    Interact with Database (insert,update,delete...) sta plaisia tou transaction..
        //This method will store our object to the database
        session.save(m);

        
        //    Commit Transaction
        // Kai molis kanoume commit apothikey9ontai gia panta oles oi parapano .save entoles pou exoume kanei
        // blepe comit kai rollback pou kanoume stin oracle... giati milame gia transaction
        // opou ena transaction se mia RDBMS mporei na apoteleite apo polles kai diadoxikes diergasies stin basi 
        // p.x. multiple delete, inserts, updates..
        session.getTransaction().commit();
        
        // Save Ends //
        
        
        
        // Kleinoume to Session
        session.close();

    }

    
    
    
    
    // READ FROM DATABASE //
    // ------------------ //    
    
    // Ayti i methodos tha mas ferei to onoma tou record pou tha tou zitisoume apo tin basi
    public String getName(){
        // Katarxas ksanadimiourgoume ena Session
        session = helper.getSessionFactory().openSession();
        
        // Ksekina to Treansaction
        session.beginTransaction();
        
        // H parakato entoli epistrefei object alla epeidi xeroume oti ayto pou iparxei ekei 
        // einai ena antikeimeno tipou Member to kanoume cast 
        // me to Members.class pernoume to class type - epi tis ousias dimiourgeite ena antikeimeno tis klasis Members 
        // xoris na kanoume new..
        m = (Members) session.get(Members.class , 2);
        
        // Thetoume to onoma pou pernoume apo to antikeimeno pou dimiourgithike pou einai se antistoixeia me to record tis basis
        // stin local metabliti mas name kalontas tin methodo pou exoume ftiaxei sto pojo mas Members.java
        this.name = m.getName();
        
        // Epistrefoume to onoma
        return name;

    }
    
    
}
