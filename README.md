# 📦 Sistema de Pedido com Frete e Desconto

Projeto em Java com Spring Boot que calcula o valor total de um pedido, considerando:
- Um valor básico
- Um percentual de desconto
- Um valor de frete baseado em regras

---

## ✅ Regras de Frete

| Valor Básico do Pedido | Frete          |
|------------------------|----------------|
| Abaixo de R$ 100.00    | R$ 20.00       |
| De R$ 100.00 até R$ 199.99 | R$ 12.00   |
| R$ 200.00 ou mais       | Grátis (R$ 0.00) |

---

## 🧮 Cálculo do Valor Total

```java
total = valor_básico - desconto + frete

🖥️ Exemplo de Uso
Entrada:

Código: 1034
Valor básico: 150.00
Desconto (%): 20.0

Saída:
Pedido código 1034
Valor total: R$ 132.00

🚀 Como Rodar o Projeto
Clone o repositório:

git clone https://github.com/Lucasdev796/pedido-spring.git

Acesse o diretório:

bash
Copiar
Editar
cd pedido-spring

Execute a aplicação (em IDE ou terminal):

bash
Copiar
Editar
./mvnw spring-boot:run

Digite os dados do pedido no terminal e veja o resultado.

🛠️ Tecnologias
Java 17+

Spring Boot

Maven

👤 Autor
Lucas Costa
GitHub
