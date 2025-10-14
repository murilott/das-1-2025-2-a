## Aula 13 - 13/10/2025

= Padrão retry =

É preciso implementar uma estratégia ao o padrão de Retry

- Retry imediatamente: após falhar, tenta novamente logo após
- Retry depois de delay: aguarda período de tempo após a falha e tenta novamente, o tempo aumenta caso falhe novamente(exponencialmente). A ideia é dar um tempo para o serviço voltar, mas é preciso de limites para evitar tempos infinitos


= Estilos/padrões arquiteturais =

Um software usa mais de um estilo/padrão.

- Padrão Grande bola de Lama: uma grande confusão de código. São sistemas que cresceram de forma orgânica, sem planejamento, desenvolvidos de qualquer jeito, com repetidas manutenções, e hoje em dia é muito caro e difícil de implementar coisas novas ou fazer correção.
- Arquitetura unitária: usado em softwares embarcados(geladeira, microondas, friobagr, máquina de lavar), usado em um hardware específico
- Cliente/servidor: divisão de papéis
- Desktop + servidor de banco de dados: várias máquinas em uma instalação conectam-se em um computador com banco de dados
- Navegador + servidor web: o banco de dados conecta no web server, e os clientes(máquinas) utilizam os navegadores para conectar no servidor web e retornar e devolver páginas HTML.