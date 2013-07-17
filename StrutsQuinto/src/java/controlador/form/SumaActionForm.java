/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author josea
 */
public class SumaActionForm extends org.apache.struts.action.ActionForm {
    
    private int operando1, operando2;

    public int getOperando1() {
        return operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int getResultado() {
        return operando1 + operando2;
    }

    /**
     *
     */
    public SumaActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

}
