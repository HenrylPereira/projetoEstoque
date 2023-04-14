package br.univille.projfabsoft2023.controller;

import java.util.HashMap;
import java.util.List;

import br.univille.projfabsoft2023.entity.Categoria;
import br.univille.projfabsoft2023.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping()
    public ResponseEntity<List<Categoria>> listarTodos() {
        return ResponseEntity.ok(categoriaRepository.findAll());
    }

    @PostMapping()
    public Categoria novCategoria(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}
