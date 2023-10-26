package br.com.lipealves.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraContoller {

    @GetMapping("/primeiroMetodo/") // http://localhost:8080/primeiraController/primeiroMetodo/
    public String primeiroMetodo() {
        return "Parabéns! Você criou sua primeira rota";
    }

    @GetMapping("/metodoComId/{id}") // http://localhost:8080/primeiraController/metodoComId/5
    public String metodoId(@PathVariable String id) {
        return "O paramentro é " + id;
    }

    @GetMapping("/metodoComQueryParamns") // http://localhost:8080/primeiraController/metodoComQueryParamns?id=5
    public String metodoComQueryParamns(@RequestParam String id) {
        return "O paramentro com query params é " + id;
    }

    @GetMapping("/metodoComQueryParamns2") // http://localhost:8080/primeiraController/metodoComQueryParamns2?id=5&nome=filipe&curso=java
    public String metodoComQueryParamns2(@RequestParam Map<String, String> allParams) {
        return "O paramentro com query params, retornando varias informações " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParms")
    public String metodoComBodyParms(@RequestBody Usuario usuario) {
        return "metodoComBodyParams " + usuario.username;
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComBodyParms(@RequestHeader("name") String name) {
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListBodyParms(@RequestHeader Map<String, String> headers) {
        return "metodoComListHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoResponseEntity/{id}")
    public ResponseEntity<Object> metodoResponseEntity(@PathVariable Long id) {

        var usuario = new Usuario("lipealves");
        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Numnero menor que 5");

    }

    record Usuario(String username) {

    }
}
