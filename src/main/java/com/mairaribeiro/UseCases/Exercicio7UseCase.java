package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio7Request;
import com.mairaribeiro.Communication.Responses.Exercicio7Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio7UseCase {
    public Exercicio7Response executar(Exercicio7Request request) {

        double celsius = 5 * (request.Fahrenheit - 32)/9;
        String mensagem = ("Sua temperatura em celsius é:" + celsius);

        var response = new Exercicio7Response();
        response.mensagem = mensagem;

        return response;


    }
}