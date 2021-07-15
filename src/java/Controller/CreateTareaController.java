/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Conectar;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class CreateTareaController {
    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(HttpServletRequest request){
        Conectar connection = new Conectar();
        connection.createConnection();
        
        
        
        return new ModelAndView("redirect:/listar.htm");    
    }
}
