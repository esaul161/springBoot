package com.example.ToDo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {
    private static List<ToDo> toDos = new ArrayList<ToDo>();
    private static int toDoCount = 3;

    static {
        toDos.add(new ToDo(1, "Laquisha", "Homework", "2019/07/07", false));
        toDos.add(new ToDo(2, "Maquisha", "Shoping", "2019/07/07", false));
        toDos.add(new ToDo(3, "Marisha", "Work", "2019/07/07", false));
    }

    public List<ToDo> filtrarToDos(String user){
        List<ToDo> filteredToDo = toDos.stream().filter(t -> t.getUser().equals(user)).collect(Collectors.toList());
        return filteredToDo;
    }

    public static List<ToDo> getToDos() {
        return toDos;
    }

    public static void setToDos(List<ToDo> toDos) {
        ToDoService.toDos = toDos;
    }

    public String addToDo(ToDo toDo){
        toDos.add(toDo);
        return "registro agregado exitosamente";
    }

    public void deleteToDo(int id){
        toDos.removeIf(element -> element.getId() == id);
    }
}
