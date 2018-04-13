package com.poc.noticias.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poc.noticias.entity.Noticia;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Long> {

}
