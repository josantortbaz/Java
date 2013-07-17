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
public class LoginActionForm extends org.apache.struts.action.ActionForm {
    
    private String usuario, clave;

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    /**
     *
     */
    public LoginActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsuario() == null || getUsuario().length() < 1) {
            errors.add("usuario", new ActionMessage("errors.user.required"));
        }
        if (getClave() == null || getClave().length() < 1) {
            errors.add("clave", new ActionMessage("errors.key.required"));
        }
        return errors;
    }
}
