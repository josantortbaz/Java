/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlador.form;

/**
 *
 * @author josea
 */
public class PrimerActionForm extends org.apache.struts.action.ActionForm {
    
    private String mensaje;

    /**
     * @return
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param string
     */
    public void setMensaje(String string) {
        mensaje = string;
    }

    /**
     *
     */
    public PrimerActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
