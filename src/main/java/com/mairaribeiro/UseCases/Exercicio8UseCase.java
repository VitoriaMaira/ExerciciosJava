package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio8Request;
import com.mairaribeiro.Communication.Responses.Exercicio8Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio8UseCase {
    public Exercicio8Response executar(Exercicio8Request request) {

        double celsius = request.kelvin - 273.15;
        String mensagem = ("Sua temperatura em Celsius é: " + celsius);

        var response = new Exercicio8Response();
        response.mensagem = mensagem;

        return response;


    }
}
