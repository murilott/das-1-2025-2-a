## Aula 3 - 11/08/2025

- SOLID:
    - O: Aberto/fechado - Uma classe deve estar aberta para extensões e fechada para modificações. Ou seja, é possível extender as suas funcionalidades, 
        feito por classes abstratas e por interfaces
    - L:
    - D: Princípio da inversão de dependências - uma classe deve possuir dependências com abstrações (interfaces) e não implementações concretas
        Exemplo: Controller(var service) -> Service(interface) <- ServiceImpl(código)
        Isto é feito para reduzir acoplamento entre classes, permitindo que as classes concretas mudem sem alterar o funcionamento. Múltiplas classes com diferentes
        implementações podem utilizar a interface

Conceitos utilizados no SOLID:
- Prefira a composição a herança - a classe herdada herda tudo do pai e é difícil de representar em bancos de dados. a herança é utilizada quando duas classes irmãs não podem
    se "assumir" o lugar da outra, por exemplo: Cão -> Animal <- Gato (Ok), Funcionário -> Pessoa <- Cliente (Não ok). Por isso, sempre que possível é melhor
    utilizar composição.

- Princípio de Demeter: princípio do menor conhecimento - a classe deve utilizar código que pertence somente a sua própria classe, ou que foi passada como parâmetro. Ou seja
    ela é feita para evitar variáveis globais, que são frágeis.

