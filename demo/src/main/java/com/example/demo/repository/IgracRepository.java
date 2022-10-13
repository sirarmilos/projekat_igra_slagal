package com.example.demo.repository;

import com.example.demo.entity.Igrac;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IgracRepository extends JpaRepository<Igrac, String> {

}
