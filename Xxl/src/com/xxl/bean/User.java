package com.xxl.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="user"
    ,catalog="login"
)

public class User  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String name;
     private String password;
     private String email;
     private Integer stats;


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String name, String password, String email, Integer stats) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.stats = stats;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="id", unique=true, nullable=false)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="name", length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="password", length=50)

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Column(name="email", length=100)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="stats")

    public Integer getStats() {
        return this.stats;
    }
    
    public void setStats(Integer stats) {
        this.stats = stats;
    }
   








}