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
    //REPASAR ESTÉ TIPO DE CÓDIGO
    @RequestMapping("home.htm") 
    public ModelAndView controlador(){
        return new ModelAndView("index");
    }
}