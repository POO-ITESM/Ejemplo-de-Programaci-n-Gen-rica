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
public class POOJPargaA05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Generica<String> str = new Generica<>();
        Generica<Integer> in = new Generica<>();
        Generica<Float> fl = new Generica<>();
        Generica<Persona> pers = new Generica<>();
        
        System.out.println("Mete datos al arreglo de Strings: ");
        str.almacenarEnPosicion(0, "lol");
        System.out.println("primer valor: " + str.devuelvePrimero());

        str.almacenarUltimoDisponible("Roberto");
        System.out.println("ultimo valor: " + str.devuelveUltimoExistente());

        Object[] s = str.devuelveAlmacenados();
        for (int i = 0; i < s.length; ++i) {
            System.out.println(s[i]);
        }
        System.out.println("");
        System.out.println("Mete datos al arreglo de enteros: ");
        in.almacenarEnPosicion(0, 5);
        System.out.println("primer valor: " + in.devuelvePrimero());

        in.almacenarUltimoDisponible(6);
        System.out.println("ultimo valor: " + in.devuelveUltimoExistente());

         s = in.devuelveAlmacenados();
        for (int i = 0; i < s.length; ++i) {
            System.out.println(s[i]);
        }
        System.out.println("");
        System.out.println("Mete datos al arreglo de float: ");
        fl.almacenarEnPosicion(0, 5.3f);
        System.out.println("primer valor: " + fl.devuelvePrimero());

        fl.almacenarUltimoDisponible(6.7f);
        System.out.println("ultimo valor: " + fl.devuelveUltimoExistente());

        s = fl.devuelveAlmacenados();
        for (int i = 0; i < s.length; ++i) {
            System.out.println(s[i]);
        }
        System.out.println("");
        System.out.println("Mete datos al arreglo de Persona: ");
        Persona p = new Persona();
        p.setNombre("Jesús");
        p.setEdad(22);
        p.setSexo("masculino");
        pers.almacenarEnPosicion(0,p);
        p = pers.devuelvePrimero();
        System.out.println("primer valor: " + "nombre: " + p.getNombre() + " edad: " + p.getEdad() + " sexo: " + p.getSexo());

        pers.almacenarUltimoDisponible(new Persona("Clara",50,"femenino"));
        p = pers.devuelveUltimoExistente();
        System.out.println("ultimo valor: " + "nombre: " + p.getNombre() + " edad: " + p.getEdad() + " sexo: " + p.getSexo());

        s = pers.devuelveAlmacenados();
        for (int i = 0; i < s.length; ++i) {
            p=(Persona)s[i];
            System.out.println("nombre: " + p.getNombre() + " edad: " + p.getEdad() + " sexo: " + p.getSexo());
        }
     
    }

}
