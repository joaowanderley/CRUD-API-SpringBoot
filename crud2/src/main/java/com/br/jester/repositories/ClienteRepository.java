package com.br.jester.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.jester.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}
