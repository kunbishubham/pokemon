package com.example.demo.service;

import com.example.demo.entity.Pokemon;
import com.example.demo.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService {


    @Autowired
    PokemonRepository pokemonRepository;

    public List<Pokemon> getAllPokemon() {
        List<Pokemon> pokemons = new ArrayList<Pokemon>();
        pokemonRepository.findAll().forEach(books1 -> pokemons.add(books1));
        return pokemons;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Pokemon getPokemonById(int id) {
        return pokemonRepository.findById(id).get();
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Pokemon pokemon) {
        pokemonRepository.save(pokemon);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
        pokemonRepository.deleteById(id);
    }

    //updating a record
    public void update(Pokemon pokemon, int id) {
        pokemonRepository.save(pokemon);
    }
}
