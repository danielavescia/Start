# Start - Projeto Fazenda 
![Java CI with Maven](https://github.com/danielavescia/Start/actions/workflows/maven.yml/badge.svg)
![Java](https://img.shields.io/badge/Java-21-blue)
![JUnit 5](https://img.shields.io/badge/tests-JUnit%205-orange)
![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![License](https://img.shields.io/badge/license-MIT-green)

## Descrição

O projeto **Fazenda** é uma aplicação de exemplo em Java, construída com **Maven**, que simula o funcionamento de uma fazenda.  
Inclui classes concretas que representam animais (`Cow`, `Cat`, `Dog`) e um rádio (`Radio`) que implementa a interface `Talkable`.  

## Estrutura das classes

- Animal: classe abstrata que define comportamento básico dos animais.
- Cow, Cat, Dog: herdam de Animal(classe abstrata) e implementam talk() da interface Talkable.
- Radio: implementa a interface Talkable.
- Talkable: interface para objetos que podem falar.
- FarmApp: classe principal (main) que demonstra a interação entre os objetos.

Abaixo o UML das Classes do Projeto e seus relacionamentos:
![Diagrama de Classe do Projeto Fazenda](https://www.plantuml.com/plantuml/png/bPBTwXCn4CNlynG3NhZBd-q3b59QjlHAHAft8ZBTZEjeFaeoRSMFTtTZTgkfgz3Bd3FpovnCDb4moDaQ9Io6OCVO1xG8cg0r62D5q1vU1V-9n8DIx8J21-m8tg3vZ4T3tnG0m9CCnwfUmci9x7hrGoayHWdO2NG915l75WsmFHcov2JU4Pw1GqiJ84F7fkfFfnwjdkJb85VrNKiSzIp-WWub5yzwB12VhRywSuH2RE3z1Grh54hGSX38s9GrHsnHWBu8EJt57HydEMNl_9KtqixtywJaF4Hg_NMUb9o7I0VKxF-zlwTSKCrZPj--vEynsEtfb6aDM7OVSOzVoMbSmWkEifekN6VQr57zhtGQXnrtZ26Lbz_18hiAGn-dYTw-gtylzZaSo637tc4AxQCQ__7gUzEaPHJd5gKy-wkQ9XcKnGAoMuhvuTIO1ffc3JT_2UU8QaDEdwtv2G00)


## Tecnologias utilizadas

- **Java 21 (Temurin)**
- **Maven** para gerenciamento de dependências e build
- **JUnit 5** para testes unitários e parametrizados
- **GitHub Actions** para integração contínua e testes automáticos


## Como rodar o projeto

1. Clone o repositório:

```bash
git clone https://github.com/danielavescia/Start.git
cd Start
```

2. Compile e execute o projeto com Maven:

```bash
mvn clean package
```

3. Para rodar os testes:
```bash
mvn test
```
