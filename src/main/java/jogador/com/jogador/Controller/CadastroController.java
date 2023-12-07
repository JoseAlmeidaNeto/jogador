package jogador.com.jogador.Controller;

import jogador.com.jogador.Mode.Jogador;
import jogador.com.jogador.dao.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {
    @Autowired
    JogadorRepository jogadorRepository;
    @GetMapping("/cadastro")
    public String abrir(Jogador jogador){return "Cadastro";}
        @PostMapping("/cadastrar_jogador")
                public String cadastro(Jogador jogador){
        jogadorRepository.save(jogador);
        return "index";

    }

}
