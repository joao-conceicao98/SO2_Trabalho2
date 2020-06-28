package SO2.SO2_Trabalho2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import SO2.SO2_Trabalho2.model.Loja;
import SO2.SO2_Trabalho2.model.Registo;
import SO2.SO2_Trabalho2.model.Utilizador;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/")
    public String red() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/admin")
    public String user(Model model) {
        model.addAttribute("utilizador", new Utilizador());
        return "admin";
    }

    @GetMapping("/lojas")
    public String lojas(Model model1, Model model2) {
        model1.addAttribute("loja", new Loja());
        model2.addAttribute("registo", new Registo());
        return "lojas";
    }

    @GetMapping("/result")
    public String result() {
        return "result";
    }

    @GetMapping("/utilizadores2")
    public String utilizadores2() {
        return "utilizadores2";
    }

}