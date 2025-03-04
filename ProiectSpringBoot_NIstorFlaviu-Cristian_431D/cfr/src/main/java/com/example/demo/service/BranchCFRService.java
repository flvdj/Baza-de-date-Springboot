package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.BranchCFR;
public interface BranchCFRService {
List<BranchCFR> getAllBranchCFR();
BranchCFR saveBranchCFR(BranchCFR branchcfr);
BranchCFR getBranchCFRById(Long idbranchcfr);
BranchCFR updateBranchCFR(BranchCFR branchcfr);
void deleteBranchCFRById(Long idbranchcfr);
}