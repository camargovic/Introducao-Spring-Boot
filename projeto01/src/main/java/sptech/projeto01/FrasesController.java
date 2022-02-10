package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

/*
A a notação @RestController possibilita que a classe tenha CHAMADAS para a rest api
ou seja, transforma a classe numa rest controller
 */

@RestController
public class FrasesController {

    /*
     a anotação @GetMapping transforma um método numa chamada api
     o que estiver desntro dos paramentros dela é uri da chamada
    */
    @GetMapping("/cumprimentar") //uri: /cumprimentar
    public String cumprimentar() {
        return "minha primeira API <3";
    }

    // obs: A voncenção para valores de URI é kebab-case
    // (tudo minúsculo separado por hífem "-"
    @GetMapping("/boa-noite")
    public String boaNoite(){
        return "Boa noite, durma com os anjos";
    }



    /*
        Chamada /sorteio-loko que retorna a frase "Numero sorteado: X"
        onde X é um número ineiro aleatório entre 1 e 99
    */

    @GetMapping("/numero-loko")
    public String numeroLoko() {
        int sorteado = ThreadLocalRandom.current().nextInt(1,99);
        return String.format("Número sorteado é: %d", sorteado);
    }
}
