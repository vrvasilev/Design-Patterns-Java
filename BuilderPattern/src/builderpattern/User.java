/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author user
 */
public class User {
    private final String firstName;    //required
    private final String lastName;    //required
    private final int age;    //optional
    private final String phone;    //optional
    private final String address;    //optional
    
    private User(Builder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
        this.phone=builder.phone;
        this.address=builder.address;
    }
   public static class Builder{
    private final String firstName;    
    private final String lastName;    
    private  int age;    
    private  String phone;    
    private  String address; 
    
    Builder(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public Builder setAge(int age){
        this.age=age;
        return this;
    }
    
    public Builder setPhone(String phone){
        this.phone=phone;
        return this;
    }
    
    public Builder setAdress(String adress){
        this.address=adress;
        return this;
    }
    
    public User build(){
        return new User(this);
    }
       
   }

}
