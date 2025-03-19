# README

## Exercício 5 e Exercício 6 - Método da Bisseção

Este repositório contém duas implementações do **método da bisseção** em Java para encontrar as raízes de funções matemáticas com uma determinada precisão.

### 📌 Exercício 5

O **Exercício 5** implementa o método da bisseção para encontrar as raízes da função:

\(f(x) = x^3 - 7x^2 + 14x - 6\)

A função é analisada dentro de três intervalos diferentes: `[0,1]`, `[1,3.2]` e `[3.2,4]`, com uma tolerância de 0.01.

#### 🔧 Estrutura do Código

1. A função `f(x)` representa a equação matemática.
2. O método `bisection(double a, double b, double tolerance)` executa o algoritmo da bisseção.
3. O método `main` chama `bisection` para cada intervalo e exibe os resultados.

### 📌 Exercício 6

O **Exercício 6** resolve três equações diferentes usando o método da bisseção, com uma precisão de \(10^{-5}\):

• x − 2^x = 0 para 0 ≤ x ≤ 1
• e^x − x^2 + 3x − 2 = 0 para 0 ≤ x ≤ 1
• 2xcos(2x) − (x + 1)^2 = 0 para −3 ≤ x ≤ −2 e 1 ≤ x ≤ 0

#### 🔧 Estrutura do Código

1. O código utiliza uma interface funcional `Function` para representar as funções matemáticas.
2. O método `bissecao(Function func, double a, double b, double tol)` implementa o algoritmo da bisseção.
3. No `main`, as equações são resolvidas para os intervalos especificados e os resultados são impressos.

### 🚀 Como Executar

1. Certifique-se de ter o **Java JDK** instalado.
2. Compile os arquivos Java:
   ```sh
   javac Exercicio5.java Exercicio6.java
   ```
3. Execute os programas:
   ```sh
   java Exercicio5
   java Exercicio6
   ```

