package com.example.crudproject.service;

import com.example.crudproject.model.Cliente;
import com.example.crudproject.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class ClienteService {
    Scanner scanner = new Scanner(System.in);

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente save(Cliente cliente) {
        if (cliente.getNome() == null || cliente.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou vazio.");
        }
        else if(cliente.getEmail() == null || cliente.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("O email do cliente não pode ser nulo ou vazio.");
        }
        
        System.out.print("Deseja cadastrar o cliente sem telefone? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                throw new IllegalArgumentException("O telefone do cliente não pode ser nulo ou vazio.");
            } else {
                System.out.println("Digite o telefone do cliente (ou pressione Enter para deixar em branco): ");
                cliente.setTelefone(scanner.nextLine());
            }
            return clienteRepository.save(cliente);
        }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public java.util.Optional<Cliente> findByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }
}