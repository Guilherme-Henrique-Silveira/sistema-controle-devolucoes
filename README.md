# Sistema de Controle de Devoluções Logísticas (G.C MAXX)

Sistema desenvolvido em Java para automatizar o fluxo diário de triagem e controle de devoluções, substituindo planilhas manuais por uma aplicação orientada a objetos interativa e segura.

## 🚀 Sobre o Projeto
O software foi idealizado para resolver dores reais de logística, permitindo gerenciar o alto volume diário de mercadorias retornadas de plataformas de e-commerce, calcular valores financeiros automaticamente, validar estados de produtos e aplicar regras de negócio em tempo real.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Java (JDK 26)
* **Ambiente de Desenvolvimento:** IntelliJ IDEA
* **Conceitos de POO:** Criação de Classes, Construtores, Encapsulamento, Métodos de Sobrescrita (`toString`).
* **Estruturas de Dados:** `ArrayList` para persistência dinâmica em memória.
* **Entrada e Validação:** `Scanner`, manipulação de strings (`equalsIgnoreCase`, `toUpperCase`, `startsWith`) e tratamento de fluxo de entradas numéricas e textuais.

## ⚙️ Funcionalidades do Sistema (CRUD & Lógica)
1. **Cadastro Completo:** Registro detalhado de devoluções contendo plataforma de venda, data da triagem, número do pedido, SKU, nome do produto, motivo, descrição do estado atual, quantidade, valor unitário, aptidão para revenda, recebedor do reembolso e modalidade de envio.
2. **Cálculo Financeiro Automático:** Multiplicação precisa de quantidade por valor unitário com arredondamento monetário de duas casas decimais.
3. **Relatório Geral Formatado:** Exibição estruturada de todas as linhas registradas no sistema, simulando uma tabela corporativa.
4. **Atualização de Pedidos:** Busca dinâmica por número de pedido para atualizar o estado físico da mercadoria e sua aptidão de revenda sem perda de dados.
5. **Filtro Inteligente por Plataforma:** Listagem isolada de devoluções baseada na origem da venda (ex: Shopee, Mercado Livre).

## 💻 Como Executar o Projeto
1. Certifique-se de ter o **Java JDK 26** instalado na sua máquina.
2. Clone este repositório ou baixe os arquivos compactados (`Main.java` e `Devolucao.java`).
3. Abra a sua IDE Java favorita (como o **IntelliJ IDEA**).
4. Insira os arquivos dentro da pasta de código-fonte (`src`) de um novo projeto.
5. Execute a classe **`Main.java`** e interaja com o menu diretamente pelo terminal.

---
Desenvolvido por **Guilherme**.
