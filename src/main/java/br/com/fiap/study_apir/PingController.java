package br.com.fiap.study_apir;

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

    @GetMapping("rota")
    public String rota() {
        return "rota";
    }
}
