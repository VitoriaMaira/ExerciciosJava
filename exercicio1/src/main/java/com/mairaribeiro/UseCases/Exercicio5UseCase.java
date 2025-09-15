package com.mairaribeiro.UseCases;

import com.mairaribeiro.Communication.Requests.Exercicio5Request;
import com.mairaribeiro.Communication.Responses.Exercicio5Response;
import org.springframework.stereotype.Service;

@Service
public class Exercicio5UseCase {
    public Exercicio5Response executar (Exercicio5Request request) {

      var quinta = request.Numero / request.Numero;

      String mensagem = ("A quinta parte do número:" + quinta);

      var response = new Exercicio5Response();

      response.mensagem = mensagem;
      return response;


    }
}
