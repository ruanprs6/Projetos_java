package br.com.projeto.api.controle;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Pessoa;
import br.com.projeto.api.repositorio.Repositorio;

import org.springframework.web.bind.annotation.PostMapping;




@RestController


public class Controle {
   @Autowired
   private Repositorio acao;


   @PostMapping("/api")
   public Pessoa cadastrar(@RequestBody Pessoa obj){
      return acao.save(obj);
   }

   @GetMapping("/api")
   public List<Pessoa> selecionar(){
      return acao.findAll();
   }

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

