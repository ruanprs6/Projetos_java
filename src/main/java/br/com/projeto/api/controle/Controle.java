package br.com.projeto.api.controle;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;
import org.springframework.web.bind.annotation.PostMapping;




@RestController


public class Controle {
    @GetMapping("")
     public String mensagem(){
         return "Hello word!";
     }

     @GetMapping("/boasVindas/{nome}")
     public String boasVindas(@PathVariable String nome){
        return "Seja Bem Vindo" + nome;
     }

     @PostMapping("/pessoa")
     public Pessoa pessoa(@RequestBody Pessoa p){
        return p;
     }
}

