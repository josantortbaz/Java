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
public class EmpleadoInsertaActionForm extends EmpleadoActionForm {

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getCodigo() == null || getCodigo().length() < 1) {
            errors.add("codigo", new ActionMessage("error.codigo.required"));
        }
        if (getNombre() == null || getNombre().length() < 1) {
            errors.add("nombre", new ActionMessage("error.nombre.required"));
        }
        if (getApellido() == null || getApellido().length() < 1) {
            errors.add("apellido", new ActionMessage("error.apellido.required"));
        }
        if (getFnacimiento() == null || getFnacimiento().toString() == ""
                || getFnacimiento().toString().equals("1900-12-31")) {
            errors.add("fnacimiento", new ActionMessage("error.fnacimiento.required"));
        }
        if (getSalario() == 0 || getSalario() < 0) {
            errors.add("salario", new ActionMessage("error.salario.required"));
        }
        return errors;
    }
}
