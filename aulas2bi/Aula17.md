## Aula 17 - 03/11/2025

Resumo do capítulo 12: Estilo de Arquitetura Microkernel

**Sistema Central**

O sistema central é formalmente definido como a funcionalidade mínima requerida para rodar o sistema. Depois que se acrescentam plug-ins, o produto começa a se tornar útil.
Não só os componentes de plug-in específicos do cliente isolam a lógica do dispositivo independente do resto do fluxo de processamento como também permitem a expansão. 

Dependendo do tamanho e da complexidade, o sistema central pode ser implementado como uma arquitetura em camadas ou um bloco monolítico modular. Em alguns casos, o sistema central pode ser dividido em serviços de domínio implantados separadamente, com cada serviço contendo componentes de plug-in específicos do domínio. 

**Componentes de Plug-in**

Os componentes de plug-in são autônomos e independentes, contendo um processamento especializado, recursos adicionais e um código personalizado para melhorar ou estender o sistema central. E mais, eles podem ser usados para isolar um código altamente volátil, criando uma melhor manutenção e testabilidade na aplicação.

A comunicação entre os componentes de plug-in e o sistema central normalmente é de ponto a ponto, ou seja, o “canal” que conecta o plug-in ao sistema central costuma ser uma chamada do método ou da função para a classe de ponto de entrada do componente de plug-in.

Esses benefícios têm trade-offs. O acesso do plug-in remoto torna a arquitetura microkernel uma arquitetura distribuída, em vez de uma monolítica, dificultando implementar e implantar para a maioria dos produtos locais de terceiros. Além disso, cria mais complexidade geral, custo e complica a topologia de implementação em geral. 

**Registro**

O sistema central precisa saber quais módulos de plug-in estão disponíveis e como obtê-los. Um modo comum de implementar isso é com um registro de plug-in. Esse registro contém informações sobre cada módulo de plug-in, inclusive coisas como nome, contrato dos dados e detalhes do protocolo de acesso remoto (dependendo de como o plug-in está conectado ao sistema central).

O registro pode ser tão simples quanto uma estrutura de mapa interna que o sistema central possui, contendo uma chave e a referência do componente de plug-in, ou pode ser tão complexo quanto uma ferramenta de registro e descoberta incorporada no sistema central ou implantada externamente.

**Contratos**

Os contratos entre os componentes de plug-in e o sistema central costumam ser padrão em um domínio dos componentes de plug-in e incluem o comportamento e os dados de entrada e saída retornados do componente de plug-in.

**Classificações das Características da Arquitetura**

Assim como o estilo de arquitetura em camadas, simplicidade e custo geral são os principais pontos fortes do estilo de arquitetura microkernel; escalabilidade, tolerância a falhas e elasticidade são os principais pontos fracos.

O estilo de arquitetura microkernel é único, no sentido de que pode ser particionado por domínio e tecnicamente.

Testabilidade, implementabilidade e confiabilidade se classificam um pouco acima da média, basicamente porque a funcionalidade pode ser isolada nos componentes de plug-in independentes. 

Com o estilo de arquitetura microkernel, uma funcionalidade extra pode ser adicionada, removida e alterada por meio de componentes de plug-in independentes e autocontidos.