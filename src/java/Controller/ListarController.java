package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import Modelo_method.Tarea_DAO;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class ListarController {
    private Conectar connection;
    
    @RequestMapping ("listar.htm")
    public ModelAndView listar(){
        
        connection = new Conectar();
        connection.createConnection();
        
        List <Tarea> list_false = Tarea_DAO.getAllFalse(connection.getConnection());
        int cont= Tarea_DAO.getCount(connection.getConnection());
        List <Tarea> list_true= Tarea_DAO.getAllTrue(connection.getConnection());
        
        connection.closeConnection();
        
        ModelAndView mav=new ModelAndView();
        mav.addObject("Tareas",list_false);
        mav.addObject("tarea_realizado", list_true);
        mav.addObject("contador", cont);
        
        mav.setViewName("listar");
        return mav;
    }
}
