package br.com.gabriel.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping; // Importe a classe GetMapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRote")
public class MyFirstController {

    @GetMapping("/")
    public String firstMessage() {
        return "Funcionou";
    }
}
