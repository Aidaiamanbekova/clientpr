package com.hbj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hbj.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Integer > {

    public Client findByEmail (String email);

    public void save(ch.qos.logback.core.net.server.Client client);


     
}
