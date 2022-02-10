package sptech.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContadorController {

    private int contador;
    private int vitoria;
    private int empate;
    private int derrota;
    private int pontos;
    private int partida;

    @GetMapping("/contar")
    public String contar() {
        contador++;
        return String.format("Você já fez %d acessos", contador);
    }

    // {n1} e {n2} são PATH PARAMS
    // {n1} foi mapeado para o argumento n1 por causa da anotação "@PathVariable"
    // {n2} foi mapeado para o argumento n2 por causa da anotação "@PathVariable"
    @GetMapping("/somar/{n1}/{n2}")
    public String somar(@PathVariable double n1, @PathVariable double n2) {
        return String.format("A soma entre %.2f e %.2f é %.2f", n1, n2, (n1+n2));
    }



    /*
        Chamada /calcular-vr/{salario}/{nome}
        Ela retorna a frase "Olá, NOME. Seu VR será de X"
        onde X é 8% do salário
    */

    @GetMapping("/calcular-vr/{salario}/{nome}")
    public String calcular(@PathVariable double salario, @PathVariable String nome) {
        Double soma;
        soma = salario * 0.08;
        return String.format("Olá %s. Seu VR será de %.2f", nome, soma);
    }




    // exercicio

    @GetMapping("/cadastrar-vitoria")
    public String vitoria() {
        vitoria++;
        pontos+=3;
        partida++;
        return "Vitoria registrada com sucesso";
    }

    @GetMapping("/cadastrar-derrota")
    public String derrota() {
        derrota++;
        partida++;
        return "Derrota Vitoria registrada com sucesso";
    }

    @GetMapping("/cadastrar-empate")
    public String empate() {
        empate++;
        pontos+=1;
        partida++;
        return "Empate registrada com sucesso";
    }

    @GetMapping("/pontuacao")
    public String pontuacao() {
        Double aproveitamento;
        aproveitamento = (pontos * 100.0) / (partida * 3.0);
        return String.format("Você tem %d pontos em %d partidas e %.2f de aproveitamento",
                pontos, partida, aproveitamento);
    }

}
