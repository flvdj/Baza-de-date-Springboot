package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.Journey;
import com.example.demo.service.JourneyService;
import com.example.demo.entity.Travellers;
import com.example.demo.repository.BranchCFRRepository;
import com.example.demo.repository.TravellersRepository;
import com.example.demo.entity.BranchCFR;

@Controller
public class JourneyController {
    private JourneyService journeyService;

    @Autowired
    private TravellersRepository travellersRepo;

    @Autowired
    private BranchCFRRepository branchCFRRepo;

    public JourneyController(JourneyService journeyService) {
        super();
        this.journeyService = journeyService;
    }

    @GetMapping("/journey")
    public String listJourney(Model model) {
        model.addAttribute("journey", journeyService.getAllJourney());
        return "journey";
    }

    @GetMapping("/journey/new")
    public String createJourneyForm(Model model) {
        List<Travellers> totitravellers = travellersRepo.findAll();
        List<BranchCFR> totibranchcfr = branchCFRRepo.findAll();
        Journey journey = new Journey();
        model.addAttribute("journey", journey);
        model.addAttribute("totitravellers", totitravellers);
        model.addAttribute("totibranchcfr", totibranchcfr);
        return "create_journey";
    }

    @PostMapping("/journey")
    public String saveJourney(@ModelAttribute("journey") Journey journey) {
        journeyService.saveJourney(journey);
        return "redirect:/journey";
    }

    @GetMapping("/journey/edit/{idjourney}")
    public String editJourneyForm(@PathVariable Long idjourney, Model model) {
        List<Travellers> totitravellers = travellersRepo.findAll();
        List<BranchCFR> totibranchcfr = branchCFRRepo.findAll();
        model.addAttribute("journey", journeyService.getJourneyById(idjourney));
        model.addAttribute("totitravellers", totitravellers);
        model.addAttribute("totibranchcfr", totibranchcfr);
        return "edit_journey";
    }

    @PostMapping("/journey/{idjourney}")
    public String updateJourney(@PathVariable Long idjourney,@ModelAttribute("journey") Journey journey,Model model) {
        Journey journeyExistenta = journeyService.getJourneyById(idjourney);
        journeyExistenta.setIdjourney(idjourney);
        journeyExistenta.setTravellers(journey.getTravellers());
        journeyExistenta.setBranchcfr(journey.getBranchcfr());
        journeyExistenta.setDate(journey.getDate());
        journeyExistenta.setHour(journey.getHour());
        journeyExistenta.setTicket(journey.getTicket());
        journeyExistenta.setClasa(journey.getClasa());
        journeyExistenta.setStart(journey.getStart());
        journeyExistenta.setDestination(journey.getDestination());
        
        journeyService.updateJourney(journeyExistenta);
        return "redirect:/journey";
    }

    @GetMapping("/journey/{idjourney}")
    public String deleteJourney(@PathVariable Long idjourney) {
        journeyService.deleteJourneyById(idjourney);
        return "redirect:/journey";
    }
}
