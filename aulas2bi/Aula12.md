## Aula 12 - 06/10/2025

CQRS - Coammnd Query Responsability Segregation

Delegar operações de escrita e leitura no storage, para fins de performance

Contexto: Tela, logica de validação, regra de negócio, instância banco de dados

Usar quando se tem problemas de:
- Performance: não é possível melhorar a máquina (memória RAM, CPU). Limites da escalabidade vertical
- Problema de lock: quando há muito problema de lock (o travamento ao realizar uma operação). Problema crítico de concorrência no sistema ao realizar operaçõe de banco

Com uma instância primária do banco, é feita leitura e escrita. Toda vez que for escrito, replica a ação para as réplicas, que são somente de leitura.
Na instância primária somente são feitas escritas, e as réplicas servem para leitura.

- Pode haver atrasos por ser feito de forma assíncrona
