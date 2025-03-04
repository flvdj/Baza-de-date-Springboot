package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.BranchCFR;
import com.example.demo.service.BranchCFRService;

@Controller
public class BranchCFRController {
    private BranchCFRService branchCFRService;

    public BranchCFRController(BranchCFRService branchCFRService) {
        super();
        this.branchCFRService = branchCFRService;
    }

    // metoda handler care se ocupa cu lista BranchCFR, returnarea si vizualizarea lor
    @GetMapping("/branchcfr")
    public String listBranchCFR(Model model) {
        model.addAttribute("branchcfr", branchCFRService.getAllBranchCFR());
        return "branchcfr";
    }

    @GetMapping("/branchcfr/new")
    public String createBranchCFRForm(Model model) {
        // creaza obiectul branchCFR pentru a stoca datele din formular
        BranchCFR branchCFR = new BranchCFR();
        model.addAttribute("branchcfr", branchCFR);
        return "create_branchcfr";
    }

    @PostMapping("/branchcfr")
    public String saveBranchCFR(@ModelAttribute("branchcfr") BranchCFR branchCFR) {
        branchCFRService.saveBranchCFR(branchCFR);
        return "redirect:/branchcfr";
    }

    @GetMapping("/branchcfr/edit/{idbranchcfr}")
    public String editBranchCFRForm(@PathVariable Long idbranchcfr, Model model) {
        model.addAttribute("branchcfr", branchCFRService.getBranchCFRById(idbranchcfr));
        return "edit_branchcfr";
    }

    @PostMapping("/branchcfr/{idbranchcfr}")
    public String updateBranchCFR(@PathVariable Long idbranchcfr,
                                    @ModelAttribute("branchcfr") BranchCFR branchCFR,
                                    Model model) {
        // preia branchCFR-ul din baza de date dupa campul idbranchcfr
        BranchCFR branchCFRExistent = branchCFRService.getBranchCFRById(idbranchcfr);
        branchCFRExistent.setIdbranchcfr(idbranchcfr);
        branchCFRExistent.setName(branchCFR.getName());
        branchCFRExistent.setCity(branchCFR.getCity());
        branchCFRExistent.setAddress(branchCFR.getAddress());
        branchCFRExistent.setPhone(branchCFR.getPhone());
        branchCFRExistent.setSite(branchCFR.getSite());
        
        
        // salveaza un obiect branchCFR modificat
        branchCFRService.updateBranchCFR(branchCFRExistent);
        return "redirect:/branchcfr";
    }

    // metoda de tip handler folosita pentru a se ocupa cu cererea de stergere a BranchCFR
    @GetMapping("/branchcfr/{idbranchcfr}")
    public String deleteBranchCFR(@PathVariable Long idbranchcfr) {
        branchCFRService.deleteBranchCFRById(idbranchcfr);
        return "redirect:/branchcfr";
    }
}
