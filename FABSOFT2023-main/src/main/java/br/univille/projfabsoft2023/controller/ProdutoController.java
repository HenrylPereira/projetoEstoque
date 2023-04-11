package br.univille.projfabsoft2023.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.univille.projfabsoft2023.repository.ProdutoRepository;

@RestController
@RequestMapping("/prouto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;


}
