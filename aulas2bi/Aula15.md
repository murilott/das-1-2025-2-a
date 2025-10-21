## Aula 15 - 20/10/2025

Resumo do capítulo 10: Estilo de Arquitetura em Camadas

A arquitetura em camadas é um estilo comum de arquitetura. por ser simples e de baixo custo

*Topologia*

Os componentes são definidos em camadas horizontais com uma função específica.
A quantidade de camadas pode variar, mas a maioria consiste em 4 camadas padrões: apresentação, comercial, persistência e banco de dados.

Cada camada tem uma função e responsabilidade específica e devem se abstrair uma das outras.
O conceito de separação das responsabilidades facilita a criação de funções eficientes e de modelos de responsabilidade dentro da arquitetura.
Os componentes de uma camada tem o escopo limitado a ela, então, por exemplo, os componentes na camada de apresentação só lidam com a lógica de apresentação, enquanto a camada de negócio lida com a lógica de negócio.
Desta maneira, cada desenvolvedor pode ser atribuido a uma camada que melhor tem conhecimento técnico

A arquitetura em camadas é particionada tecnicamente. Isso significa que um grupo de componentes são agrupados por sua função técnica na arquitetura (como apresentação) e não por seu domínio ("cliente"), dificultando fazer alterações nesse domínio

