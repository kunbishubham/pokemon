package com.example.demo.controller;

import com.example.demo.entity.Pokemon;
import com.example.demo.repository.PokemonRepository;
import com.example.demo.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//This is Pokemon  Controller
public class PokemonController {


    //autowire the BooksService class
    @Autowired
    PokemonService pokemonService;

    //creating a get mapping that retrieves all the Pokemon detail from the database
    @GetMapping("/getpokemon")
    private List<Pokemon> getAllBooks() {
        return pokemonService.getAllPokemon();
    }

    //creating a get mapping that retrieves the detail of a specific Pokemon
    @GetMapping("/pokemon/{id}")
    private Pokemon getBooks(@PathVariable("id") int id) {
        return pokemonService.getPokemonById(id);
    }

    //creating a delete mapping that deletes a specified Pokemon
    @DeleteMapping("/pokemon/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        pokemonService.delete(id);
    }

    //creating post mapping that post the Pokemon detail in the database
    @PostMapping("/addPokemon")
    private int saveBook(@RequestBody Pokemon pokemon) {
        pokemonService.saveOrUpdate(pokemon);
        return pokemon.getId();
    }

    //creating put mapping that updates the Pokemon detail
    @PutMapping("/pokemon")
    private Pokemon update(@RequestBody Pokemon pokemon) {
        pokemonService.saveOrUpdate(pokemon);
        return pokemon;
    }

}
