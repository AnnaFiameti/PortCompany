package br.senai.PortComapny.Controller;

import br.senai.PortComapny.Model.Usuario;
import br.senai.PortComapny.Service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @PostMapping("/usuario/new")
    public String create(Usuario usuario, Model model) {
        try {
            usuarioService.create(usuario);
            model.addAttribute("usuario", usuario);
            model.addAttribute("isSave", true);
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("usuario", usuario);
            model.addAttribute("isError", true);
            model.addAttribute("errorMsg", e.getMessage());
            return "/cadastro";
        }
    }
}
