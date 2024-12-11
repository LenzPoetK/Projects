/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.beans;

/**
 *
 * @author leona
 */
public class Regular extends User{
    
    public Regular(String name, String email, String password, String cpf){
        super(name, email, password, cpf, "regular");
    }
}
