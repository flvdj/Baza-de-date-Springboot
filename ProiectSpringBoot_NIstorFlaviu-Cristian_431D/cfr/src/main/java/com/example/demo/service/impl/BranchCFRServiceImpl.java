package com.example.demo.service.impl;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.BranchCFR;
import com.example.demo.repository.BranchCFRRepository;
import com.example.demo.service.BranchCFRService;
@Service
public class BranchCFRServiceImpl implements BranchCFRService{
private BranchCFRRepository BranchCFRRepository;
public BranchCFRServiceImpl(BranchCFRRepository BranchCFRRepository)
{
super();
this.BranchCFRRepository = BranchCFRRepository;
}
@Override
public List<BranchCFR> getAllBranchCFR() {
return BranchCFRRepository.findAll();
}
@Override
public BranchCFR saveBranchCFR(BranchCFR BranchCFR) {
return BranchCFRRepository.save(BranchCFR);
}
@Override
public BranchCFR getBranchCFRById(Long idbranchcfr) {
return BranchCFRRepository.findById(idbranchcfr).get();
}
@Override
public BranchCFR updateBranchCFR(BranchCFR BranchCFR) {
return BranchCFRRepository.save(BranchCFR);
}
@Override
public void deleteBranchCFRById(Long idbranchcfr) {
BranchCFRRepository.deleteById(idbranchcfr);
}
}