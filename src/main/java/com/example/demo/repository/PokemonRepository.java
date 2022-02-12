package com.example.demo.repository;


import com.example.demo.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This is PokemonRepository
@Repository
public interface PokemonRepository extends JpaRepository<Pokemon,Integer> {
}
