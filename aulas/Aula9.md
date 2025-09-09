## Aula 9 - 08/09/2025

Compensações (trade-offs)

- Toda vez que se define uma arquitetura, não é possível atender a todos os pedidos
- "Não existem respostas corretas ou erradas, apenas compensações"

- Arquitetura baseada em tópicos
    - Um tópico funciona como um grupo de família no Whatsapp
    - É semelhante a um padrão Observer: Publisher, 1 - Subscriber, muitos
    - Inscreve-se no broker (tópico) e ele empurra a mensagem para os assinantes
    - Se o tópico sair do ar e tentar entregar a mensagem, a mensagem pode se perder
    - Ao incluir um subscriber novo, não há mudanças necessárias
    - Rastreabilidade de problemas menor
    - Menor acomplamento

- Arquitetura baseada em listas
    - Sender <-> Fila <-> Receiver
    - Enqueue
    - Dequeue
    - 1 (sender) para 1 (receiver)
    - Cada receiver possui sua própria fila, fazendo uma desconexão em relação aos outros
    - Garantia de entrega em ordem
    - Serve como buffer (salva a mensagem)
    - O receiver vai para a fila, verifica se tem mensagem e busca (pooling)
    - Ao incluir um receiver novo, é necessário criar uma fila, incluir no sender e conectá-los, causando mais impacto nos dois lados
    - Rastreabilidade de problemas maior
    - Maior acomplamento

- Arquitetura baseada em 