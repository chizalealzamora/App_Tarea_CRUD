package Controller;

import Modelo.Conectar;
import Modelo_method.CheckedTarea;
import Modelo_method.DeleteTarea;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class BoxCheckedController {
    @RequestMapping(value = "checked.htm", method = RequestMethod.GET)
    public ModelAndView checked(HttpServletRequest req){
        
        String tarea_realizado = req.getParameter("tarea_realizado");
        int id_tarea=Integer.parseInt(req.getParameter("id_tarea"));
        
        Conectar connection = new Conectar();
        connection.createConnection();
        
        int result= CheckedTarea.checked(connection.getConnection(), tarea_realizado, id_tarea);
        
        connection.closeConnection();
        
        
        return new ModelAndView("redirect:/listar.htm");    
    }
}
