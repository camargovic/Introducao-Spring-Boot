package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bairros") //Esta anotação define o inicio padrão de todas as chamadas
public class BairrosController {

    @GetMapping // URI: /bairros
    public String getBairros() {
        return "lista de todos os bairros";
    }

    @GetMapping("/{id}") // URI: /bairros/{id}
    public String getBairros(@PathVariable int id) {
        return "bairro de id " + id;
    }

    @GetMapping("/top-5}") // URI: /bairros/top-5
    public String getBairrosTop5() {
        return "Top 5 bairros";
    }

}
