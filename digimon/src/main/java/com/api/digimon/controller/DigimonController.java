package com.api.digimon.controller;

import com.api.digimon.models.Digimon;
import com.api.digimon.service.DigimonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

// O @RestController indica que essa classe é um endpoint que vai retornar requisições REST
// A injeção da independencia do repositório esta feita no construtor, que é
// gerado com a anotação @AllArgsConstructor
// O @RequestMapping indica a URL do controller
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class DigimonController {

    private final DigimonService digimonService;

    // As anotações de mapping indicam o endereço para chamada do método
    @GetMapping("/digimons")
    public String index() {
        return "<h1>Exemplo de API REST - Java Spring</h1>Com objetivo de consumir a API https://digimon-api.vercel.app/<span></span>"
                + "<hr><table><thead><tr><th>ROTA</th><th>HTTP (Verbo)</th><th>Request</th><th>Return</th><th>Description</th></tr></thead><tbody><tr><td>/api/digimons</td><td>GET</td><td>-</td><td>HTML</td><td>API index</td></tr><tr><td>/api/digimons/list</td><td>GET</td><td>-</td><td>JSON[]</td><td>Lista todos os digimons</td></tr><tr><td>/api/digimons/level/{level}</td><td>GET</td><td>String(level)</td><td>JSON[]</td><td>Lista os digimons pelo nível</td></tr><tr><td>/api/digimons/name/{name}</td><td>GET</td><td>String(name)</td><td>JSON</td><td>Busca o digimon pelo nome</td></tr></tbody></table>";
    }

    // Listar digimons
    @GetMapping("/digimons/list")
    public Digimon[] listDigimon() {
        return this.digimonService.findAllDigimons();
    }

    // Recuperar digimon por nível
    @GetMapping("/digimons/level/{level}")
    public Digimon[] findDigimonBylevel(@PathVariable(value = "level") String level) {
        return this.digimonService.findDigimonByLevel(level);
    }

    // Recuperar digimon por nome
    @GetMapping("/digimons/name/{name}")
    public Digimon[] findDigimonByName(@PathVariable(value = "name") String name) {
        return this.digimonService.findDigimonByName(name);
    }

    // // Salvar digimon
    // @PostMapping("digimons")
    // public Digimon saveDigimon(@RequestBody Digimon digimon) {
    // return this.digimonService.saveDigimon(digimon);
    // }

    // // Atualizar digimon
    // @PutMapping("digimons/{id}")
    // public Digimon updateDigimon(@PathVariable(value = "id") long id,
    // @RequestBody Digimon digimon) {
    // if (id != digimon.getId()) {
    // return null;
    // }
    // return this.digimonService.saveDigimon(digimon);
    // }

    // // Remover digimon
    // @DeleteMapping("digimons/{id}")
    // public void deleteDigimon(@PathVariable(value = "id") long id, @RequestBody
    // Digimon digimon) {
    // if (id != digimon.getId()) {
    // return;
    // }
    // this.digimonService.deleteDigimon(digimon);
    // }

}
