package br.com.lipealves.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compenet")
public class MeuControllerComponet {

    @Autowired
    MeuComponet meuComponet;

    @GetMapping("/")
    public String chamndoComponent() {
        var resultado = meuComponet.chamarMeuComponet();
        return resultado;
    }
}
