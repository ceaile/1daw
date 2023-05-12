/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package com.mycompany.proyecto_dawbank;

/**
 *
 * @author Admin
 */
public class CuentaException extends Exception {

    /**
     * Creates a new instance of <code>CuentaException</code> without detail
     * message.
     */
    public CuentaException() {
    }

    /**
     * Constructs an instance of <code>CuentaException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public CuentaException(String msg) {
        super(msg);
    }
}
