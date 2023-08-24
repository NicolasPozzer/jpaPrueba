
package com.mycompany.jpaprueba.persistence;

//Controladora de todas nuestras persistencias

import com.mycompany.jpaprueba.logica.Alumno;



public class ControladoraPersistencia {
    
    //Declaramos Todas las unidades de persistencia que tenemos
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    
    
}
