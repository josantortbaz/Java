/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.action;

import controlador.form.LoginActionForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author josea
 */
public class LoginAction extends org.apache.struts.action.Action {

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return "bien" si el usuario y la clave son correctos (Alumno, poseidon).
     *         "mal" en otro caso.
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginActionForm la = (LoginActionForm) form;
        String user = la.getUsuario();
        String key = la.getClave();
        String ruta = "mal";
        if (user.equals("Alumno") && key.equals("poseidon")) {
            ruta="bien";
        }
        return mapping.findForward(ruta);
    }
}
