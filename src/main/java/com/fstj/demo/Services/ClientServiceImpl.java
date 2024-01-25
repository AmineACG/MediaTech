package com.fstj.demo.Services;

import org.springframework.stereotype.Service;

import com.fstj.demo.DTO.ClientRequestDto;
import com.fstj.demo.DTO.ClientResponseDto;

@Service
public class ClientServiceImpl implements ClientService{

    @Override
    public ClientRequestDto save(ClientRequestDto clientRequestDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public ClientResponseDto findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public ClientResponseDto findByNom(String nom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNom'");
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ClientResponseDto update(ClientRequestDto clientRequestDto, Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
