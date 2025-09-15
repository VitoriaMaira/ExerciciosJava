package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio10Request;
import com.mairaribeiro.Communication.Responses.Exercicio10Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio10UseCase {
    public Exercicio10Response executar (Exercicio10Request request){
        double metros = request.quilometros / 3.6;

        String mensagem = ("Sua velocidade em metros é: " + metros);
        var response = new Exercicio10Response();
        response.mensagem = mensagem;

        return response;

    }

}
