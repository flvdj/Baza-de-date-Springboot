package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Travellers;
import com.example.demo.service.TravellersService;

@Controller
public class TravellersController {
    private TravellersService travellersService;

    public TravellersController(TravellersService travellersService) {
        super();
        this.travellersService = travellersService;
    }

    // metoda handler care se ocupa cu lista calatorilor, returnarea si vizualizarea lor
    @GetMapping("/travellers")
    public String listTravellers(Model model) {
        model.addAttribute("travellers", travellersService.getAllTravellers());
        return "travellers";
    }

    @GetMapping("/travellers/new")
    public String createTravellersForm(Model model) {
        // creaza obiectul travellers pentru a stoca datele din formular
        Travellers travellers = new Travellers();
        model.addAttribute("travellers", travellers);
        return "create_travellers";
    }

    @PostMapping("/travellers")
    public String saveTravellers(@ModelAttribute("travellers") Travellers travellers) {
        travellersService.saveTravellers(travellers);
        return "redirect:/travellers";
    }

    @GetMapping("/travellers/edit/{id_travellers}")
    public String editTravellersForm(@PathVariable Long id_travellers, Model model) {
        model.addAttribute("travellers", travellersService.getTravellersById(id_travellers));
        return "edit_travellers";
    }

    @PostMapping("/travellers/{id_travellers}")
    public String updateTravellers(@PathVariable Long id_travellers,
                                    @ModelAttribute("travellers") Travellers travellers,
                                    Model model) {
        // preia travellers-ul din baza de date dupa campul idtravellers
        Travellers travellersExistent = travellersService.getTravellersById(id_travellers);
        travellersExistent.setId_travellers(id_travellers);
        travellersExistent.setName(travellers.getName());
        travellersExistent.setSurname(travellers.getSurname());
        travellersExistent.setCnp(travellers.getCnp());
        travellersExistent.setPhonenumber(travellers.getPhonenumber());
        travellersExistent.setCity(travellers.getCity());
        // salveaza un obiect travellers modificat
        travellersService.updateTravellers(travellersExistent);
        return "redirect:/travellers";
    }

    // metoda de tip handler folosita pentru a se ocupa cu cererea de stergere a calatorului
    @GetMapping("/travellers/{id_travellers}")
    public String deleteTravellers(@PathVariable Long id_travellers) {
        travellersService.deleteTravellersById(id_travellers);
        return "redirect:/travellers";
    }
}
