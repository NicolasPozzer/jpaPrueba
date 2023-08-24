
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        
        //Llamamos a la controladoraLogica que va a llamar a
        //la de Persistencia de capa en capa
        ControladoraLogica control = new ControladoraLogica();
        
        //Creamos un alumno que ira a la base de datos
        Alumno alu = new Alumno(14, "Martin", "Pozzer", new Date());//va a agregar la fecha de hoy
        
        //llamamos al metodo
        //para que cree un alumno
        control.crearAlumno(alu);
        
    }
}
