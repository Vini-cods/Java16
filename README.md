# Curso de Java - Arrays Unidimensionais

Este repositório contém exemplos práticos sobre arrays unidimensionais em Java, abordando declaração, inicialização, percurso, operações matemáticas e tratamento de exceções relacionadas a arrays.

## 📚 Conceitos Fundamentais

### 🗂️ O que são Arrays?
Arrays são estruturas de dados que armazenam múltiplos valores do mesmo tipo em uma única variável, organizados sequencialmente na memória.

```java
// Declaração e inicialização
int[] numeros = {10, 20, 30, 40, 50};
//      ↑        ↑
//   nome    elementos
```

### 📊 Características dos Arrays:
- **Tamanho fixo**: Definido na criação
- **Índices**: Começam em 0 (zero-based)
- **Tipo homogêneo**: Todos elementos do mesmo tipo
- **Acesso direto**: O(1) para acessar qualquer elemento

## 🛠️ Exemplos Práticos

### 1. **Percurso de Arrays**
Demonstra duas formas principais de iterar sobre arrays.

#### Loop For Tradicional:
```java
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento " + i + ": " + numeros[i]);
}
```

#### Loop For-Each (Enhanced For):
```java
for (int numero : numeros) {
    System.out.println("Elemento: " + numero);
}
```

### 2. **Calculadora de Média de Notas**
Aplicação prática usando arrays para cálculos matemáticos.

**Funcionalidades:**
- Array de notas (tipo `double`)
- Cálculo automático da soma
- Determinação da média aritmética
- Demonstração de operações com arrays

### 3. **Tratamento de Exceções**
Exemplo de como lidar com `ArrayIndexOutOfBoundsException`.

**Características:**
- Tentativa de acesso a índice inválido
- Captura e tratamento da exceção
- Continuidade segura do programa

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java ou terminal

### Executando o Projeto

1. **Clone o repositório:**
```bash
git clone <url-do-repositorio>
cd java-arrays-course
```

2. **Compile:**
```bash
javac -d out src/main/java/org/example/Main.java
```

3. **Execute:**
```bash
java -cp out org.example.Main
```

### 🔧 Testando Diferentes Exemplos

Para testar exemplos específicos, descomente as seções correspondentes:

- **Exemplo 1 - Percurso**: Descomente linhas 6-18
- **Exemplo 2 - Média**: Descomente linhas 19-32
- **Exemplo 3 - Exceções**: Já está ativo (linhas 33-45)

## 📋 Tipos de Declaração de Arrays

### 1. **Declaração com Inicialização Direta:**
```java
int[] numeros = {1, 2, 3, 4, 5};
String[] nomes = {"Ana", "João", "Maria"};
double[] precos = {10.50, 25.00, 8.75};
```

### 2. **Declaração com Tamanho Específico:**
```java
int[] numeros = new int[5];        // Array de 5 inteiros (inicializados com 0)
String[] nomes = new String[3];    // Array de 3 strings (inicializadas com null)
boolean[] flags = new boolean[10]; // Array de 10 booleans (inicializados com false)
```

### 3. **Declaração e Posterior Inicialização:**
```java
int[] numeros;
numeros = new int[]{1, 2, 3, 4, 5};
```

## 💡 Exemplos de Saída

### Percurso com For Tradicional:
```
Percorrendo o array com for:
Elemento 0: 10
Elemento 1: 20
Elemento 2: 30
Elemento 3: 40
Elemento 4: 50
```

### Percurso com For-Each:
```
Percorrendo o array com for-each:
Elemento: 10
Elemento: 20
Elemento: 30
Elemento: 40
Elemento: 50
```

### Calculadora de Média:
```
A média das notas é: 8.2
```

### Tratamento de Exceção:
```
Erro: Índice fora dos limites do array.
Elementos do array:
1
2
3
```

## 🔍 Operações Comuns com Arrays

### ✅ Busca Linear:
```java
public static int buscar(int[] array, int valor) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == valor) {
            return i; // Retorna o índice
        }
    }
    return -1; // Não encontrado
}
```

### ✅ Encontrar Maior/Menor Valor:
```java
public static int encontrarMaior(int[] array) {
    int maior = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > maior) {
            maior = array[i];
        }
    }
    return maior;
}
```

### ✅ Soma de Elementos:
```java
public static int somar(int[] array) {
    int soma = 0;
    for (int elemento : array) {
        soma += elemento;
    }
    return soma;
}
```

## ⚠️ Cuidados Importantes

### 🚨 ArrayIndexOutOfBoundsException:
```java
int[] array = new int[5]; // Índices válidos: 0, 1, 2, 3, 4
// array[5] = 10; // ❌ ERRO! Índice inválido
// array[-1] = 5; // ❌ ERRO! Índice negativo
```

### 🚨 NullPointerException:
```java
int[] array = null;
// int tamanho = array.length; // ❌ ERRO! Array não inicializado
```

### 🚨 Valores Padrão:
| Tipo | Valor Padrão |
|------|--------------|
| `int`, `byte`, `short`, `long` | `0` |
| `float`, `double` | `0.0` |
| `boolean` | `false` |
| `char` | `'\u0000'` |
| Objetos (String, etc.) | `null` |

## 🎯 Boas Práticas

### ✅ Recomendações:
- Use `for-each` quando não precisar do índice
- Sempre verifique os limites antes de acessar
- Inicialize arrays com valores apropriados
- Use nomes descritivos para arrays
- Prefira `array.length` a valores hardcoded

### ✅ Tratamento de Exceções:
```java
try {
    return array[indice];
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Índice inválido: " + indice);
    return valorPadrao;
}
```

## 📖 Vantagens e Desvantagens

### ✅ Vantagens:
- Acesso rápido aos elementos (O(1))
- Uso eficiente de memória
- Estrutura simples e direta
- Suporte nativo da linguagem

### ❌ Limitações:
- Tamanho fixo após criação
- Não pode misturar tipos diferentes
- Inserção/remoção no meio é custosa
- Não possui métodos auxiliares (como `ArrayList`)

## 🔄 Comparação: Array vs ArrayList

| Aspecto | Array | ArrayList |
|---------|-------|-----------|
| **Tamanho** | Fixo | Dinâmico |
| **Performance** | Melhor | Ligeiramente menor |
| **Métodos** | Limitados | Muitos métodos |
| **Sintaxe** | `array[i]` | `list.get(i)` |
| **Tipos primitivos** | Suporta | Precisa wrapper |

## 📖 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- 🎯 Como declarar e inicializar arrays
- 🔄 Diferentes formas de percorrer arrays
- 💻 Aplicações práticas (cálculo de média)
- 🛡️ Tratamento de exceções relacionadas a arrays
- 📊 Operações matemáticas com arrays
- 🔧 Boas práticas de programação
- ⚠️ Armadilhas comuns e como evitá-las

## 🤝 Contribuição

Este é um projeto educacional. Contribuições com novos exemplos e exercícios são bem-vindas!

## 📚 Próximos Passos

- Arrays multidimensionais (matrizes)
- Collections Framework (`ArrayList`, `LinkedList`)
- Algoritmos de ordenação e busca
- Manipulação avançada de arrays

---

**Autor**: Vinícius Santos Briches 
**Curso**: Fundamentos Java 
**Versão**: 1.0  
**Data**: 2025
