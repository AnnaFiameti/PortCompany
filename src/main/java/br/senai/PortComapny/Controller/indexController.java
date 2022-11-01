package br.senai.PortComapny.Controller;


import br.senai.PortComapny.Model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/")
    public String cadastrar(Model model) {
        model.addAttribute("usuario", new Usuario());
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
