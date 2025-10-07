## Aula 11 - 06/10/2025

Resumo do capítulo 4

- Uma característica de arquitetura possui os seguintes critérios:
    - Especifica uma consideração de design fora do domínio
    - Influencia algum aspecto estrutural de design
    - É essencial ou importante para o sucesso da aplicação

Podemos visualizar os critérios como um triângulo, desta maneira fica claro que cada elemento da suporte ao outro.

As características podem variar de um software para outro. Os arquitetos separam em grandes categorias:,

- Características Operacionais da Arquitetura: envolvem capacidades como desempenho, escalabilidade, elasticidade...
- Características Estruturais da Arquitetura: Configuração, Extensão, Instabilidade, Localização
- Características Transversais da Arquitetura: Acessibilidade, Armazenamento, Autenticação, Autorização

Muitos dos termos são ambíguos,imprecisos e podem se sobrepor, por exemplo, disponibilidade e confiabilidade.
Não há uma lista completa de características, mas a ISO possui uma lista de capacidades publicadas que contém, também, uma lista de categorias incompletas.

== Trade-offs e Arquitetura Menos Pior ==
Os softwares suportam apenas poucas características. O maior problema é que cada característica pode ter um grande impacto nas outras
Uma arquitetura com características excessivas pode causar conflitos e levam a soluções genéricas que tentam resolver todos os problemas, e eles raramente funcionam.
Portanto, uma arquitetura deve ser feita de maneira mais iterativa possível, permitindo mudanças com mais facilidade.



