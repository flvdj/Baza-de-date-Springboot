package com.example.demo.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Travellers;
import com.example.demo.repository.TravellersRepository;
import com.example.demo.service.TravellersService;
@Service
public class TravellersServiceImpl implements TravellersService{
private TravellersRepository TravellersRepository;
public TravellersServiceImpl(TravellersRepository
TravellersRepository) {
super();
this.TravellersRepository = TravellersRepository;
}
@Override
public List<Travellers> getAllTravellers() {
return TravellersRepository.findAll();
}
@Override
public Travellers saveTravellers(Travellers Travellers) {
return TravellersRepository.save(Travellers);
}
@Override
public Travellers getTravellersById(Long id_travellers) {
return TravellersRepository.findById(id_travellers).get();
}
@Override
public Travellers updateTravellers(Travellers Travellers) {
return TravellersRepository.save(Travellers);
}
@Override
public void deleteTravellersById(Long id_travellers) {
TravellersRepository.deleteById(id_travellers);
}
}