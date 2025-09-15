package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio9Request;
import com.mairaribeiro.Communication.Responses.Exercicio9Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio9UseCase {
    public Exercicio9Response executar (Exercicio9Request request) {

        double kelvin = request.celsius + 273.15;

        String mensagem = ("Sua temperatura em Kelvin é:" + kelvin);
        var response = new Exercicio9Response();
        response.mensagem = mensagem;

        return response;

  }
}
