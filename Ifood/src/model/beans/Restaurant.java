/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.beans;

/**
 *
 * @author leona
 */
public class Restaurant extends User{
    
    private String address;
    
    public Restaurant(String name, String email, String password, String cpf, String adress){
        super(name, email, password, cpf, "restaurant");
        this.address = adress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
