package com.mairaribeiro.UseCases;


import com.mairaribeiro.Communication.Requests.Exercicio3Request;
import com.mairaribeiro.Communication.Responses.Exercicio3Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio3UseCase {
    public Exercicio3Response executar(Exercicio3Request request) {

        var soma = request.Numero1 + request.Numero2 + request.Numero3;
        String mensagem = "Seu número é: " + soma;

        var response = new Exercicio3Response();
        response.mensagem = mensagem;

        return response;
    }

}
