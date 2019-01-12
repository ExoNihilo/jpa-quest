package com.wildcodeschool.example.springHibernateExample.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;     /* Le type Long permet de prévoir 
                        le cas où l'id aurait une valeur importante */

    private String loggin;

    private String password;

    @Override
    public String toString() {
        return "User [id=" + id + ", loggin=" + loggin + 
                ", password=" + password + "]";
    }            
    /* Permet d'afficher les attributs de l'objet lors de l'invocation 
    de sa méthode toString() */                

    public User() {
    }

    public User(String loggin, String password) {
        this.loggin = loggin;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    /* On ne définit pas de setId() car l'id sera généré automatiquement */

    public String getLoggin() {
        return loggin;
    }

    public void setLoggin(String loggin) {
        this.loggin = loggin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}