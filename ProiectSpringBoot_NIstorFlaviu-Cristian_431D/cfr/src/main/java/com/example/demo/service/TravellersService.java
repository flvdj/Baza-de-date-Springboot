package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Travellers;
public interface TravellersService {
List<Travellers> getAllTravellers();
Travellers saveTravellers(Travellers travellers);
Travellers getTravellersById(Long id_travellers);
Travellers updateTravellers(Travellers travellers);
void deleteTravellersById(Long id_travellers);
}