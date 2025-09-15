package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio6Request;
import com.mairaribeiro.Communication.Responses.Exercicio6Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio6UseCase {
    public Exercicio6Response executar(Exercicio6Request request) {

        var fahrenheit = request.celsius * (9/5) + 32;

        String mensagem = ("A temperatura em fahrenheit é: " + fahrenheit);

         var response = new Exercicio6Response();
         response.mensagem = mensagem;

         return response;

    }

}
