package SO2.SO2_Trabalho2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("utilizador", new Utilizador());
        return "user";
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