package com.example.demo.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Journey;
import com.example.demo.repository.JourneyRepository;
import com.example.demo.service.JourneyService;
@Service
public class JourneyServiceImpl implements
JourneyService{
private JourneyRepository JourneyRepository;
public JourneyServiceImpl(JourneyRepository
JourneyRepository) {
super();
this.JourneyRepository = JourneyRepository;
}
@Override
public List<Journey> getAllJourney() {
return JourneyRepository.findAll();
}
@Override
public Journey saveJourney(Journey
Journey) {
return JourneyRepository.save(Journey);
}
@Override
public Journey getJourneyById(Long idjourney)
{
return
JourneyRepository.findById(idjourney).get();
}
@Override
public Journey updateJourney(Journey
Journey) {
return JourneyRepository.save(Journey);
}
@Override
public void deleteJourneyById(Long idjourney) {
JourneyRepository.deleteById(idjourney);
}
}