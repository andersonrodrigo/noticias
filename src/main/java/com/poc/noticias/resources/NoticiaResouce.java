package com.poc.noticias.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.noticias.entity.Noticia;
import com.poc.noticias.repository.NoticiaRepository;

@RestController
@RequestMapping("/noticias")
public class NoticiaResouce {

    @Autowired
    NoticiaRepository noticiaRepository;

    @RequestMapping(path = "/salvar", method = { RequestMethod.POST })
    public ResponseEntity<String> salvar(@RequestBody final Noticia noticia) {
        final String msg = "Salvo com sucesso";
        noticiaRepository.save(noticia);
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }

    @RequestMapping(path = "/all", method = { RequestMethod.GET })
    public List<Noticia> getAll() {
        return (List<Noticia>) noticiaRepository.findAll();
    }

}
