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

A arquitetura em camadas é particionada tecnicamente. Isso significa que um grupo de componentes são agrupados por sua função técnica na arquitetura (como apresentação) e não por seu domínio ("cliente"), dificultando fazer alterações nesse domínio.

*Camadas de Isolamento*

Cada camada pode ser fechada ou aberta. A fechada significa que, conforme uma requisição desce as camadas, ela não pode pular nenhuma, mas pode passar pela camada imediatamente abaixo dela para chegar na próxima.

O conceito de camadas de isolamento torna as camadas independentes, permitindo que qualquer camada seja substituída sem alterar a outra

*Adicionando camadas*

As camadas abertas são úteis quando se é necessário adicionar uma nova camada para facilitar a comunicação entre duas camadas

*Outras considerações*

A arquitetura em camadas é um bom ponto de partida para a maioria das aplicações quando a arquitetura ainda não foi bem definida.
O antipadrão sinkhole da arquitetura ocorre quando as solitações passam de camada em camada sem lógica de negócio realizada dentro de cada uma, realizando processamento desnecessário.
Esse antipadrão é inevitável na arquitetura em camadas, por isso segue-se a regra 80-20: é aceitável que 20% das solicitações sejam sinkholes, mas caso sejam 80%, é um indicativo de problema na escolha da arquitetura.

*Por que usar esse estilo de arquitetura*

É uma boa escolha par aplicações ou sites pequenos e simples, e em projetos com orçamento apertado e com limites de tempo. Também é uma boa escolha quando o arquiteto ainda está analisando as necessidades comerciais e os requisitos

