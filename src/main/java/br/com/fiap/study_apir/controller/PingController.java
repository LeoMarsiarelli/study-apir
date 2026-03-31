package br.com.fiap.study_apir.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping()
public class PingController {

    @GetMapping("ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("rota1")
    public String rota1() {
        return "rota1";
    }

    @GetMapping("rota2")
    public String rota2() {
        return "rota2";
    }

    @GetMapping("rota3/teste")
    public String rota3() {
        return "rota3";
    }
}
