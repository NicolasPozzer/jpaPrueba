package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistence.ControladoraPersistencia;



public class ControladoraLogica {
    
    /*==============================================
    Esta controladora va contener
    todos los metodos que vamos a necesitar
    para poder llamarlos a nuestra persistencia para
    que interactue con nuestra base de datos
    Ejemplo: si yo quiero crear un metodo "create", 
    esto va a llamar al create de la 
    controladora de persistencia
    ===============================================*/
    
    //Primero conectar con la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Crear un metodo que se encargue de dar de alta un nuevo
    //Alumno para pasarlo luego a la persistencia
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    
    
    
    
}