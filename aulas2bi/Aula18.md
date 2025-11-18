## Aula 18 - 10/11/2025

Resumo do capítulo 13: Estilo de Arquitetura Microsserviços

Os padrões de arquitetura normalmente surgem de certos padrões que continuam reaparecendo, o que não é o caso dos microserviços.
Ela é inspirada no DDD, mais especificamento nos conceitos de contexto e nos domínios. Isso permite que cada contexto defina apenas o que precisa.

**Distribuída**

Os microsserviços rodam em computadores ou máquinas virtuais separadas, o que permite uma melhor utilização dos recursos (memória, largura de banda de rede, espaço em disco).
No entanto, a performance pode ser afetada, pois as chamadas de rede levam mais que as chamadas de métodos e é necessário realizar verificações de segurança em cada serviço

**Contexto delimitado**

Cada serviço modela um domínio ou fluxo de trabalho, contendo tudo que precisa operar dentro da aplicação.
Os microsserviços levam ao extremo o conceito de uma arquitetura particionada por domínio

**Granularidade**

É preciso cuidado para não tornar os serviços pequenos demais. A finalidade dos limites de nos microsserviços é capturar um domínio ou fluxo de trabalho. Para isso, há algumas diretrizes:
- Finalidade: cada microsserviço seja coeso de modo funcional;
- Transações: em fluxos de trabalho corporativos; é melhor evitar
- Coreografia: se um conjunto de microsserviços com bom isolamento de domínio mas requer grande comunicação para funcionar, pode-se considerar o agrupamento desse serviços em um maior

Raramente os arquitetos descobrem a granularidade perfeita na primeira vez, portanto é ideal iterar sobre as operações

**Isolamento de dados**

Outro requisito é o isolamento de dados. É um fator a se considerar na granularidade do serviço.
Cada serviço tem seu banco de dados, e é preciso cuidado para não modelá-lo para lembrar entidades simples em um banco. Esse isolamento oferece uma opção de banco diferente para cada serviço, com base no preço, armazenamento, entre outros fatores, sem que afete as outras equipes

**Camada da API**

A maioria das imagens dos microsserviços incluem uma camada da API, que pode oferecer operações úteis. No entanto, ela não deve ser usada como mediador ou uma ferramenta de orquestração

**Reutilização Operacional**

Uma das filosofias na arquitetura tradicional orientada a serviços era reutilizar o máximo possível de funcionalidades, por domínio e operacional, igualmente. Em microsserviços, os arquitetos tentam dividir essas duas preocupações.
O padrão sidecar lida com todas as preocupações peracionais que as equipes se beneficiam com um acoplamento.
Assim que as equipes entendem que cada serviço inclui um sidecar comum, elas podem criar uma malha de serviços, permitindo um controle unificado na arquitetura para preocupações como log e monitoramento.

**Front-ends**

Na visão origina dos microsserviços, as interfaces eram partes do contexto delimitado. Porém, os aspectos práticos do particionamento requeridos pelas aplicações web e por outros limites externos dificultam esse objetivo. Dois estilos de interfaces aparecem normalmente:
A primeira utiliza uma camada de API para comunicar com os microsserviços, e a segunda utiliza um nível de granularidade para isolar a interface assim como os serviços de back-end

**Comunicação**

Encontrar o estilo de comunicação certo ajuda a equipe a manter o desacoplamento, mas ainda coordenados. Eles devem decidir sobre uma comunicação síncrona ou assíncrona.

**Coreografia e Orquestração**

Coreografia utiliza o mesmo estilo de comunicação de uma arquitetura baseada em eventos do broker, respeitando a filosofia do contexto delimitado.

**Transações e Sagas**

Criar transações nos limites de serviço viola o princípio básico do desacoplamento na arquitetura de microsserviços. Os limites da transação são um dos indicadores comuns de granularidade do serviço.

**Classificações das Características da Arquitetura**

Os pontos altos dessa arquitetura são escalabilidade, elasticidade e ser evolutiva. Alguns dos sistemas mais escaláveis já escritos utilizaram esse estilo com grande sucesso. 

Performance costuma ser um problema nos microsserviços, ou seja, as arquiteturas distribuídas devem fazer muitas chamadas de rede para concluírem o trabalho, tendo um alto overhead na performance, e devem fazer verificações de segurança para checar a identidade e o acesso para cada extremidade.