package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio1Request;
import com.mairaribeiro.Communication.Responses.Exercicio1Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio1UseCase {
    public Exercicio1Response executar(Exercicio1Request request) {
        String mensagem = "Seu número é: " + request.Numero;

        var response = new Exercicio1Response();
        response.mensagem = mensagem;

        return response;
    }
}
