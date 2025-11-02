# Start - Projeto Fazenda ![Java CI with Maven](https://github.com/danielavescia/Start/actions/workflows/maven.yml/badge.svg)

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
![Diagrama de Classe do Projeto Fazenda](https://www.plantuml.com/plantuml/png/bP71IiH038RlUOg01rkMxWCi8hjKzEPXzIOUicqiWpEPCfEAeBwxKpjLhAnYRycV_y-NpZOg1HsS1JLg6MjBCN9402FAuO4QnbkoZtIm_0AOlfMciYWtUAF1I0Tl07I86gXHR4OtxiGuicXSRzcnQ5madA1untF059fDXT2NKcQfOxrEXg9SM7w2JFjhKkHdPMbdbaoELwH-kUBNg0lV7ObAoh-IzjGQV_oVhAQ1ug-OImfkr_UpoP6HWa8Nvycx-sHwygOTBQUuPqkDyIEeg8-Gd-RijQh62xxLDIdCKAcpNkUB5yqFJiWSM5Nd-AblS8W4MvPsSFOT)


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
