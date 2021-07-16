/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modelo.Conectar;
import Modelo.Tarea;
import Modelo_method.CreateTarea;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class CreateTareaController {

    @RequestMapping(value = "agregar.htm", method = RequestMethod.POST)
    public ModelAndView agregar(HttpServletRequest request, HttpServletResponse res) throws IOException{
        
        Tarea tar = new Tarea();
        
        
        tar.setNombre_tarea(request.getParameter("nombre_tarea"));
        tar.setTarea_realizado(false);
        tar.setEliminar_tarea(false);
        
        Conectar connection = new Conectar();
        connection.createConnection();
        
        int result= CreateTarea.save(connection.getConnection(), tar);
        
        connection.closeConnection();
        
        
        return new ModelAndView("redirect:/listar.htm");    
    }
}