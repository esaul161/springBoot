package com.example.demo;

import com.example.ToDo.ToDo;
import com.example.ToDo.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ToDoController {
    @Autowired
    ToDoService todoService;
    @Autowired
    ToDo toDoForm;

    @RequestMapping("/list-todos")
    public String showToDos(ModelMap model){
        model.put("toDos", ToDoService.getToDos());
        System.out.println(ToDoService.getToDos());
        return "toDo";
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String addToDo(ModelMap model){
        model.put("ToDo", toDoForm);
        return "toDoForm";
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public RedirectView addToDoToList(@ModelAttribute("ToDo")ToDo toDo, ModelMap model){
        model.put("ToDo", toDo);
        System.out.println(toDo);
        todoService.addToDo(toDo);
       // model.put("toDos", ToDoService.getToDos());
        return new RedirectView("/list-todos");
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
    public String removeToDobyId(ModelMap model){
        return "removeToDo";
    }

    @RequestMapping(value = "/eliminar", method = RequestMethod.POST)
    public RedirectView removeToDo(@RequestParam int id, ModelMap model){
        model.put("ToDo", id);
        System.out.println("id "+ id);
        todoService.deleteToDo(id);
        return new RedirectView("/list-todos");
    }
}
