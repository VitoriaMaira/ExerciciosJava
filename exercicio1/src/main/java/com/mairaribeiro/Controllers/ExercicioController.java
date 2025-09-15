package com.mairaribeiro.Controllers;

import com.mairaribeiro.Communication.Requests.*;
import com.mairaribeiro.Communication.Responses.*;
import com.mairaribeiro.UseCases.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/exercicio")
public class ExercicioController {

    private final Exercicio1UseCase _exercicio1useCase;
    private final Exercicio2UseCase _exercicio2useCase;
    private final Exercicio3UseCase _exercicio3useCase;
    private final Exercicio4UseCase _exercicio4useCase;
    private final Exercicio5UseCase _exercicio5useCase;
    private final Exercicio6UseCase _exercicio6useCase;
    private final Exercicio7UseCase _exercicio7useCase;
    private final Exercicio8UseCase _exercicio8useCase;
    private final Exercicio9UseCase _exercicio9useCase;
    private final Exercicio10UseCase _exercicio10useCase;

    @Autowired
    public ExercicioController(

            Exercicio1UseCase exercicio1useCase,
            Exercicio2UseCase exercicio2useCase,
            Exercicio3UseCase exercicio3useCase,
            Exercicio4UseCase exercicio4UseCase,
            Exercicio5UseCase exercicio5UseCase,
            Exercicio6UseCase exercicio6UseCase,
            Exercicio7UseCase exercicio7UseCase,
            Exercicio8UseCase exercicio8UseCase,
            Exercicio9UseCase exercicio9UseCase,
            Exercicio10UseCase exercicio10UseCase) {


        _exercicio1useCase = exercicio1useCase;
        _exercicio2useCase = exercicio2useCase;
        _exercicio3useCase = exercicio3useCase;
        _exercicio4useCase = exercicio4UseCase;
        _exercicio5useCase = exercicio5UseCase;
        _exercicio6useCase = exercicio6UseCase;
        _exercicio7useCase = exercicio7UseCase;
        _exercicio8useCase = exercicio8UseCase;
        _exercicio9useCase = exercicio9UseCase;
        _exercicio10useCase = exercicio10UseCase;

    }



    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Faça um programa que leia um número inteiro e o imprima.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida do Exercício 1"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio1")
    public Exercicio1Response executarExercicio1UseCase(@RequestBody Exercicio1Request request) {
        return _exercicio1useCase.executar(request);
    }


    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Faça um programa que leia um número real e o imprima.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio2")
    public Exercicio2Response executarExercicio2UseCase(@RequestBody Exercicio2Request request) {
        return _exercicio2useCase.executar(request);

    }

    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Peça ao usuário para digitar três valores inteiros e imprima a soma deles.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio3")
    public Exercicio3Response executarExercicio3UseCase(@RequestBody Exercicio3Request request) {
        return _exercicio3useCase.executar(request);
    }

    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia um número real e imprima o resultado do quadrado desse número.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio4")
    public Exercicio4Response executarExercicio4UseCase(@RequestBody Exercicio4Request request) {
        return _exercicio4useCase.executar(request);
    }

    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia um número real e imprima a quinta parte deste número.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio5")
    public Exercicio5Response executarExercicio5UseCase(@RequestBody Exercicio5Request request) {
        return _exercicio5useCase.executar(request);
    }


    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia uma temperatura em graus Celsius e apresente-a convertida em graus\n" +
                    "Fahrenheit. A fórmula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a\n" +
                    "temperatura em Fahrenheit e C a temperatura em Celsius.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio6")
    public Exercicio6Response executarExercicio6UseCase(@RequestBody Exercicio6Request request) {
        return _exercicio6useCase.executar(request);

    }


    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia uma temperatura em graus Fahrenheit e apresente-a convertida em\n" +
                    "graus Celsius. A fórmula de conversão é: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a\n" +
                    "temperatura em Celsius e F a temperatura em Fahrenheit.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio7")
    public Exercicio7Response executarExercicio7UseCase(@RequestBody Exercicio7Request request) {
        return _exercicio7useCase.executar(request);

    }

    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia uma temperatura em graus Kelvin e apresente-a convertida em graus\n" +
                    "Celsius. A fórmula de conversão é: C = K − 273.15, sendo C a temperatura\n" +
                    "em Celsius e K a temperatura em Kelvin.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio8")
    public Exercicio8Response executarExercicio8UseCase(@RequestBody Exercicio8Request request) {
        return _exercicio8useCase.executar(request);

    }


    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia uma temperatura em graus Celsius e apresente-a convertida em graus\n" +
                    "Kelvin. A fórmula de conversão é: K = C + 273.15, sendo C a temperatura em\n" +
                    "Celsius e K a temperatura em Kelvin.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio9")
    public Exercicio9Response executarExercicio9UseCase(@RequestBody Exercicio9Request request) {
        return _exercicio9useCase.executar(request);

    }


    @Operation(
            summary = "Lista de Exercicios 1",
            description = "Leia uma velocidade em km/h (quilômetros por hora) e apresente-a\n" +
                    "convertida em m/s (metros por segundo). A fórmula de conversão é: M =\n" +
                    "K/3.6, sendo K a velocidade em km/h e M em m/s.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Execução bem-sucedida"),
                    @ApiResponse(responseCode = "400", description = "Requisição inválida")
            }
    )
    @PostMapping("/exercicio10")
    public Exercicio10Response executarExercicio10UseCase(@RequestBody Exercicio10Request request) {
        return _exercicio10useCase.executar(request);

    }

}


