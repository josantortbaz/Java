/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.action;

import DAO.EmpleadoDAO;
import controlador.form.EmpleadoActionForm;
import java.sql.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Empleado;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author josea
 */
public class EmpleadoInsertaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "inserta";
    private static final String NOINSERTA = "noInserta";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        EmpleadoDAO ce = new EmpleadoDAO();
        
        EmpleadoActionForm ef = (EmpleadoActionForm) form;
        
        String codigo = ef.getCodigo();
        String nombre = ef.getNombre();
        String apellido = ef.getApellido();
        Date fnacimiento = ef.getFnacimiento();
        float salario = ef.getSalario();
        
        Empleado e = new Empleado (codigo, nombre, apellido, fnacimiento, salario);
        
        Empleado insertado = ce.insertaEmpleado (e);
        
        if (insertado == null) {
            return mapping.findForward(NOINSERTA);
        }
        
        request.setAttribute("empleado", insertado);
        
        return mapping.findForward(SUCCESS);
    }
}
