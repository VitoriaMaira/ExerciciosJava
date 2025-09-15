package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio2Request;
import com.mairaribeiro.Communication.Responses.Exercicio2Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio2UseCase {
    public Exercicio2Response executar(Exercicio2Request request) {
        String mensagem = "Seu número é: " + request.Numero;

        var response = new Exercicio2Response();
        response.mensagem = mensagem;

        return response;
    }
}
