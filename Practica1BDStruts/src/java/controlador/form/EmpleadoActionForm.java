/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.form;

import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author josea
 */
public class EmpleadoActionForm extends org.apache.struts.action.ActionForm {

    private String codigo, nombre, apellido;
    private Date fnacimiento;
    private float salario;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public float getSalario() {
        return salario;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     *
     */
    public EmpleadoActionForm() {
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
        if (getCodigo() == null || getCodigo().length() < 1) {
            errors.add("codigo", new ActionMessage("error.codigo.required"));
        }
        if (getNombre() == null || getNombre().length() < 1) {
            errors.add("nombre", new ActionMessage("error.nombre.required"));
        }
        if (getApellido() == null || getApellido().length() < 1) {
            errors.add("apellido", new ActionMessage("error.apellido.required"));
        }
        if (getFnacimiento() == null) {
            errors.add("fnacimiento", new ActionMessage("error.fnacimiento.required"));
        }
        if (getSalario() == 0 || getSalario() < 0) {
            errors.add("salario", new ActionMessage("error.salario.required"));
        }
        return errors;
    }
}
