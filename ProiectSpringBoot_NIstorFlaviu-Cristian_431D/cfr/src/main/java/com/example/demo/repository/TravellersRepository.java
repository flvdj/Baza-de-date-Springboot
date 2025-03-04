package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Travellers;
public interface TravellersRepository extends
JpaRepository<Travellers, Long>{
}