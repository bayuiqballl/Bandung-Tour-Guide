/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author oXCToo
 */
public class Pesanan {

    private String id;

    private String email;

    private String date;

    private String gender;
    
    private String classin;
    
    private String telp;

    private String lastname;

    private String firstname;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getLastname ()
    {
        return lastname;
    }

    public String getClassin() {
        return classin;
    }

    public void setClassin(String classin) {
        this.classin = classin;
    }

    public void setLastname (String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname ()
    {
        return firstname;
    }

    public void setFirstname (String firstname)
    {
        this.firstname = firstname;
    }

    
    
    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", email = "+email+", date = "+date+", gender = "+gender+",class = "+classin+", telepon = "+telp+", lastname = "+lastname+", firstname = "+firstname+"]";
    }
}