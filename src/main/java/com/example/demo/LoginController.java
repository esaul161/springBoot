package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    //Injected acutomatically
    @Autowired
    LoginService service;

    //Model para enviar datos del controlador a la vista.
    //para agregar parametros de la url a la vista se usa el model map
    //despues en el la vista se usan xpressions lenguage ${} para obtener el valor
    // @RequestParam String name

    @RequestMapping(value = "/login", method = RequestMethod.GET) //Get, post, put, para todos los metodos
    public String showLoginPage( ModelMap model){
        //model.put("name", name);
        // System.out.println("name is "+ name);
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST) //Get, post, put, para todos los metodos
    public String showWelcomePage(@RequestParam String Nombre, @RequestParam String Password, ModelMap model){
        model.put("Nombre", Nombre);
         System.out.println("name is "+ Nombre +  " " + Password);
         boolean validUser = service.validateUser(Nombre, Password);
        if (! validUser){
            model.put("message", "Usuario O Password invalidos");
            return "login";
        }else{
            return "welcome";
        }
    }
}
