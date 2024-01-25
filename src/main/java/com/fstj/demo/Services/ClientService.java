package com.fstj.demo.Services;


import com.fstj.demo.DTO.ClientRequestDto;
import com.fstj.demo.DTO.ClientResponseDto;

public interface ClientService {

    ClientRequestDto save(ClientRequestDto clientRequestDto);

    ClientResponseDto findById(Integer id);

    ClientResponseDto findByNom(String nom);
    
    void delete(Integer id);

    ClientResponseDto update(ClientRequestDto clientRequestDto,Integer id);

    
} 