## Aula 10 - 29/09/2025

https://learn.microsoft.com/pt-br/azure/architecture/patterns/circuit-breaker?wt.mc_id=AZ-MVP-5003638

Padrão Circuit Breaker
- Muito comum em sistemas distribuídos (rodas em diferentes computadores)
- Em sistemas que se comunicam pela rede, muitas coisas podem acontecer no tráfego de dados entre os sistemas
- Para evitar que as chamadas fiquem paradas indefinidamentes, foi feito um circuit breaker
- Funcionamento análogo a um disjuntor
- Estados: Aberto, Meio-Aberto, Fechado
- Aberto: aconteceu uma falha (demora na resposta, erro)
- Meio-aberto: de tempos em tempos, tenta conectar e vê se dá certo, e se sim, volta ao estado de fechado. se não, volta para o aberto, espera e tenta novamente
- Fechado: está tudo bem
- Faz uma chamada, verifica se está funcionando, se não espera um pouco e tenta novamente.