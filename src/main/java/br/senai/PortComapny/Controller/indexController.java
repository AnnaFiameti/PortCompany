package br.senai.PortComapny.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "cadastrar";}

    @GetMapping("/config")
    public String config(){
        return "config";}

    @GetMapping("/login")
    public String login(){
        return "login";}

    @GetMapping("/vizusuario")
    public String vizusuario(){
        return "vizusuario";}

    @GetMapping("/recuperarsenha")
    public String recuperarsenha(){
        return "recuperarsenha";}

    @GetMapping("/criarpost")
    public String criarpost(){
        return "criarpost";}
}
