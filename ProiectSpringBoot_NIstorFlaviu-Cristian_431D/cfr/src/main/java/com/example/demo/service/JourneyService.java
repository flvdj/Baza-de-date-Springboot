package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Journey;
public interface JourneyService {
List<Journey> getAllJourney();
Journey saveJourney(Journey journey);
Journey getJourneyById(Long idjourney);
Journey updateJourney(Journey journey);
void deleteJourneyById(Long idjourney);
}