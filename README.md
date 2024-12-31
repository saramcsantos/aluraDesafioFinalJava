# Desafio Final: Conta Corrente

## Descrição
Este repositório é dedicado ao desafio final: Conta Corrente, do curso de Java: criando a sua primeira aplicação. O desafio consiste em criar uma classe chamada Conta Corrente que dispõe de informações do titular da conta e que fornece a este cliente um menu das operações bamcárias que este usuário poderá realizar.

## Detalhes técnicos
Para a realização dessas atividades foi utilizada a IDE Intellij. Não houve instalação de bibliotecas externas. A versão do Java utilizada nas atividades é: Java 21. 

## Pré-requisitos
Antes de executar os códigos Java presentes neste repositório, é necessário instalar o JDK (Java Development Kit).
O JDK é indispensável para compilar o código-fonte (.java) e gerar arquivos .class, que contêm os bytecodes essenciais para que a máquina execute o programa. O bytecode é uma linguagem intermediária compreendida pela Máquina Virtual Java (JVM), mas não diretamente pelos seres humanos. Essa conversão da linguagem Java para bytecode ocorre durante a compilação, por isso a instalação do JDK é imprescindível.

Caso este repositório já incluísse os arquivos .class gerados a partir do código-fonte, seria necessário apenas instalar o JRE (Java Runtime Environment). O JRE fornece o ambiente necessário para executar o bytecode, dispensando a necessidade de compilação. Da mesma forma, se o repositório contivesse um arquivo .jar (um executável Java), apenas a instalação do JRE seria suficiente.

Essas instalações, tanto do JDK quanto do JRE, são importantes porque incluem a Máquina Virtual Java (JVM), responsável por interpretar e executar o bytecode, garantindo a execução do programa Java.

**Link de instalação do JDK e JRE:**
1. JDK: https://www.oracle.com/br/java/technologies/downloads/
2. JRE: https://www.java.com/pt-BR/download/manual.jsp
   
*Importante: ao instalar o JDK escolha a versão com suporte, ela é identificada pela sigla LTS*

**Link de instalação do Intellij e tutorial de uso:**
1. Instalação: https://www.jetbrains.com/pt-br/idea/
2. Tutotrial de uso: https://www.youtube.com/watch?v=0_e9Egeyk2E

*Importante: ao instalar o Intellij escolha a edição community, ela é gratuita*

## Conteúdo estudado e aprendido com o desenvolvimento dessas atividades: 
O desafio foi desenvolvido usando a classe Scanner para obter dados do usuário; método de formatação de String para exibir um texto com mais de uma linha, conhecido também como text block; estrutura de seleção *switch case* para criar o menu de opções e de acordo com a opção escolhida o bloco de instruções pertencente aquela opção é executado, e por fim também utilizei o laço while para contar o número de opções, que no caso do desafio eram 4 opções, ou seja, enquanto a opção fosse diferente de 4 o menu era exibido para o usuário que poderia sair do menu a qualquer momento se digitasse a opção 4 que encerrava o menu. Em caso de uma opção inválida nós acionamos o bloco default da estrutura *switch case*. Também foi utilizado as condicionais para a verificação do saldo do cliente para permitir o não a operação de transferência.
