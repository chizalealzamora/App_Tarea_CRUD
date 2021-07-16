package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import Modelo_method.CreateTarea;
import Modelo_method.DeleteTarea;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class DeleteController {
    @RequestMapping(value = "borrar_tarea.htm", method = RequestMethod.GET)
    public ModelAndView agregar(HttpServletRequest req, HttpServletResponse res) throws IOException{
        
        int id_tarea=Integer.parseInt(req.getParameter("id_tarea"));
        
        Conectar connection = new Conectar();
        connection.createConnection();
        
        int data= DeleteTarea.delete(connection.getConnection(), id_tarea);
        
        connection.closeConnection();
        
        
        return new ModelAndView("redirect:/listar.htm");    
    }
}
