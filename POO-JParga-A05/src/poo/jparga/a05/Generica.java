/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.jparga.a05;

import java.util.ArrayList;


/**
 *
 * @author JESUS PARGA VELA
 * @param <T> */
public class Generica <T>{
    //Creo un arreglo genérico
    ArrayList <T> list;
   
    //Constructor
   public Generica(){  
         list = new ArrayList(100);
    }
   
    //Métodos
    public void almacenarUltimoDisponible(T dato){
        
        list.add(dato);
    }
    public void almacenarEnPosicion(int pos,T dato){
        list.add(pos,dato);
    }
    public T [] devuelveAlmacenados(){
       return  (T [])list.toArray();
    }
    public T devuelvePrimero(){
       return  list.get(0);
    }
    public T devuelveUltimoExistente(){
        return list.get(list.size()-1);
    }

}

