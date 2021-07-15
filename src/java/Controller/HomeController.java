package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

public class HomeController extends HttpServlet {
    private JdbcTemplate jdbc;
    private Conectar connection;
    
    
    
    
    //REPASAR ESTÉ TIPO DE CÓDIGO
    @RequestMapping("home.htm") 
    public ModelAndView controlador(){
        return new ModelAndView("index");
    }
    
    
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(HttpServletRequest request){
        String nombre = request.getParameter("nombre");
        String sql="insert into tarea(id_tarea, nombre_tarea, tarea_realizado, fecha_hora, eliminar_tarea)"
                + "values (DEFAULT, '" + nombre + "', false, NOW(), false)";
        this.jdbc.execute(sql);
        
        return new ModelAndView("redirect:/listar.htm");    
    }
    
    @RequestMapping(value = "borrar_tarea.htm", method = RequestMethod.GET)
    public ModelAndView borrar(HttpServletRequest request){
        String id= request.getParameter("id_tarea");
        String sentencia="delete from tarea where id_tarea = "+id;
        this.jdbc.execute(sentencia);
        
        return new ModelAndView("redirect:/listar.htm");    
    }
    
    @RequestMapping(value = "checked.htm", method = RequestMethod.GET)
    public ModelAndView checked(HttpServletRequest request){
        String id = request.getParameter("id_tarea");
        String bool=request.getParameter("tarea_realizado");
        
        String sentencia_bool="UPDATE tarea set tarea_realizado= "+bool+"::boolean where id_tarea ="+id;
        
        this.jdbc.update(sentencia_bool);
        return new ModelAndView("redirect:/listar.htm"); 
    }
}