package com.projeto.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projeto.demo.model.Contato;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("contatos", contatos);
        return "index";
    }
    
    @PostMapping("/adicionar")
    public String adicionar(@RequestParam String nome, @RequestParam String telefone) {
       contatos.add(new Contato(nome, telefone));
       return "redirect:/";
    }
    
}
