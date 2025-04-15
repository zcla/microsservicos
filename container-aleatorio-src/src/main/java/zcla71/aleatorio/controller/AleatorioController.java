package zcla71.aleatorio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import zcla71.aleatorio.entity.Aleatorio;

@RestController
@RequestMapping("aleatorio")
public class AleatorioController {
    @GetMapping("/aleatorio")
    public ResponseEntity<Aleatorio> aleatorio() {
        Aleatorio aleatorio = new Aleatorio();
        aleatorio.setNumero(Math.round(Math.random() * 100.0));
        return  new ResponseEntity<>(aleatorio, HttpStatus.OK);
    }
}
