/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosFunciones;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class ValidadorFechaNacimiento {

    public boolean fechaValida(String fecha) {

        boolean esValida = false;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); //formato de fecha español

        try
        {
            formatoFecha.parse(fecha);
            esValida = true;
            
        } catch (ParseException ex)
        {
            System.out.println("Esto no es una fecha válida");
        }
        
        
        
        return esValida;

    }

}
