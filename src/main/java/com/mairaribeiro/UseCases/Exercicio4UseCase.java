package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio3Request;
import com.mairaribeiro.Communication.Requests.Exercicio4Request;
import com.mairaribeiro.Communication.Responses.Exercicio3Response;
import com.mairaribeiro.Communication.Responses.Exercicio4Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio4UseCase {
    public Exercicio4Response executar(Exercicio4Request request) {

        var quadrado = request.Numero * request.Numero;
        String mensagem = ("O quadrado do seu número é:" + quadrado);

        var response = new Exercicio4Response();
        response.mensagem = mensagem;

        return response;


    }
}