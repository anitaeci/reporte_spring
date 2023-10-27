/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kontrol.workorderweb.repository;

import com.kontrol.workorderweb.record.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
/**
 *
 * @author anita
 */
@RepositoryRestResource(collectionResourceRel = "clients", path = "client")
public interface ClientRepository extends MongoRepository<Client,String>{
    
}
