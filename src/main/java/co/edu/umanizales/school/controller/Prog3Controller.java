package co.edu.umanizales.school.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")

public class Prog3Controller {
    @GetMapping
    public String getHello() {
        return "Hola Campeones";
    }
}
