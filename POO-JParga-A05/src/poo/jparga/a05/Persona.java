/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jparga.a05;

/**
 *
 * @author JESUS PARGA VELA
 */
public class Persona {
    //Atributos
    private String Nombre;
    private  int edad;
    private  String sexo;
    
    //Constructor
    public Persona(){
        
    }
    
    public Persona(String Nombre, int edad, String sexo){
        this.Nombre= Nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Métodos
    public String getNombre(){
        return  this.Nombre;
    }
    public void setNombre(String n){
        this.Nombre= n;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setEdad(int e){
        this.edad= e;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo=s;
    }        
}
