/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.action;

import DAO.EmpleadoDAO;
import controlador.form.EmpleadoEliminaActionForm;
import java.util.List;
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
public class EmpleadoEliminaAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String ELIMINA = "elimina";
    private static final String NOELIMINA = "noElimina";
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
        
        EmpleadoEliminaActionForm ef = (EmpleadoEliminaActionForm) form;
        
        String codigo = ef.getCodigo();
        
        List<Empleado> resultado = ce.eliminaEmpleado (codigo);
        
        if (resultado == null) {
            return mapping.findForward(NOELIMINA);
        }
        
        request.setAttribute("empleados", resultado);
        
        return mapping.findForward(ELIMINA);
    }
}
