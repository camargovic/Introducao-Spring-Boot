package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @GetMapping
    public String cumprimentar() {
        return "Minha primeira API <3";
    }
}
