package br.com.lipealves.ioc_di;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class MeuComponet {
    public String chamarMeuComponet(){
        return "Chamado meu componet";
    }
}
