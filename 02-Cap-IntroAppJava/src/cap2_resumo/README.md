##Resumo do Capítulo 2 - Introdução aos aplicativos JAVA
###Seção 2.2 Nosso primeiro programa Java imprimindo uma linha de texto
- Um aplicativo Java é um programa de computador que é executado quando você utiliza o comando java para carregar a JVM.
- Os comentários documentam programas e aprimoram sua legibilidade. Eles são ignorados pelo compilador.
- Um comentário que começa com // é chamado de comentário de fim de linha – ele termina no fim da linha em que aparece.
- Comentários tradicionais podem se estender por várias linhas e são delimitados por /* e */.
- Os comentários da Javadoc, delimitados por /\*\* e \*/, permitem que você incorpore a documentação do programa no código. - O programa utilitário javac gera páginas em HTML, com base nesses comentários.
- Um erro de sintaxe (também chamado erro de compilador, erro em tempo de compilação ou erro de compilação) ocorre quando o compilador encontra um código que viola as regras da linguagem do Java. Isso é semelhante a um erro de gramática em uma língua natural.
- Linhas em branco, caracteres de espaço em branco e caracteres de tabulação são conhecidos como espaços em branco. O espaço em branco torna os programas mais fáceis de ler e não é ignorado pelo compilador.
- Todo programa que você cria consiste em pelo menos uma classe definida pelo programador.
- As palavras-chaves são reservadas para uso pelo Java e sempre são escritas com todas as letras minúsculas.
- A palavra-chave class introduz uma declaração de classe e é imediatamente seguida pelo nome da classe.
- Por convenção, todos os nomes de classes em Java iniciam com uma letra maiúscula e apresentam a letra inicial de cada palavra que eles incluem em maiúsculas (por exemplo, SampleClassName).
- O nome de uma classe Java é um identificador – uma série de caracteres que consiste em letras, dígitos, sublinhados ( _ ) e sinais de cifrão ($) que não iniciem com um dígito e não contenham espaços.
- O Java diferencia entre letras maiúsculas e minúsculas – isto é, letras maiúsculas e minúsculas são diferentes.
- O corpo de cada declaração de classe é delimitado por chaves, { e }.
- Uma declaração de classe public deve ser salva em um arquivo com o mesmo nome da classe seguindo pela extensão de nome de arquivo “ .java”.
- O método main é o ponto de partida de cada aplicativo Java e deve iniciar com : public static void main( String[] args) Caso contrário, a JVM não executará o aplicativo.
- Os métodos realizam tarefas e informações de retorno quando eles completam suas tarefas. A palavra-chave void indica que um método realizará uma tarefa, mas não retornará nenhuma informação.
- As instruções fazem o computador realizar ações.
- Uma string entre aspas duplas é às vezes chamada de string de caracteres ou string literal.
- O objeto de saída padrão (System.out) exibem caracteres na janela de comando.
- O método System.out.println exibe seu argumento na janela de comando seguindo por um caractere de nova linha para posicionar o cursos de saída no começo da próxima linha.
- Você compila um programa com o comando javac. Se o programa não contiver nenhum erro de sintaxe, um arquivo de classe contendo os bytecodes Java que representam o aplicativo é criado. Esses bytecodes são interpretados pela JVM quando executamos o programa.
- Para executar um aplicativo, digite java seguido pelo nome da classe que contém o main.

###Seção 2.3 Modificando nosso primeiro programa Java
- System.out.print exibe seu argumento e posiciona o cursor de saída imediatamente após caractere exibido.
- Uma barra investida (\) em uma string é um caractere de escape. O Java combina o próximo caractere com as barras investidas para formar uma sequência de escape. A sequência de escape. A sequência de escape \n representa o caractere de nova linha.

###Seção 2.4 Exibindo texto com printf
- O método System.out.printf (f significa “formatado”) exibe os dados formatados.
- O primeiro argumento do método printf é uma string de formado que pode consistir um texto fixo e especificadores de formato. Cada especificador de formato é um marcador de lugar para um valor e especifica o tipo de saída de dados.
- Especificadores de formato iniciam com um sinal de percentagem (%) e são seguidos por um caractere que representa o tipo de dados. Os especificadores de formato % é um marcador de lugar para uma string.
- Cada especificador de formato é substituído pelo valor de argumento correspondente que aparece depois da string de formato.

###Seção 2.5 Outro aplicativo: somando inteiros
- Uma declaração import ajuda o compilador a localizar uma classe utilizada em um programa.
- O rico conjunto do Java de classes predefinidas é agrupado em pacotes – chamados de grupos de classes.
- Coletivamente, os pacotes do Java são chamados de bibliotecas de classes Java ou Java Application Programming Interface (Java API).
- Uma variável é uma posição na memória do computador onde um valor pode ser armazenado para utilização posterior em um programa. Todas as variáveis devem ser declaradas com um nome é um tipo antes que elas possam ser utilizadas.
- O nome de uma variável permite que o programa acesse o valor da variável na memória.
- Um Scanner (pacote java.util) permite a um programa ler os dados para uso em um programa. Antes de um Scanner poder utilizado, o programa deve cria-lo e especificar a origem dos dados.
- Variáveis devem ser inicializadas para prepará-las para uso em um programa.
- A expressão new Scanner (System.in) cria um Scanner que lê o objeto de entra padrão (System.in) – normalmente o teclado.
- O tipo de dados int é utilizado para declarar variáveis que conterão valores de inteiro. O intervalo de valores para um int é -2.147.483.648 a +2.147.483.647.
- Os tipos float e double especificam número reais com pontos decimais, como 3.4 e -11.19.
- Variáveis do tipo char representam caracteres individuais, como uma letra maiúscula (por exemplo, A), um digito (por exemplo, 7), um caractere especial (por exemplo, * ou %) ou uma sequência de escape (por exemplo, nova linha \n).
- Tipos como int, float, double e char são tipos primitivos, Os nomes dos tipos primitivos são palavras-chaves, portanto, todos devem aparecer em letras minúsculas.
- Um prompt direciona o usuário a tomar uma ação específica.
- O método Scanner nextInt obtém um inteiro para uso em um programa.
- O Operador de atribuição, =, permite ao programa atribuir um valor a uma variável. O operador = é chamado operador binário porque tem dois operandos.
- Partes das instruções que contêm valores são chamados expressões.
- O Especificador de formato %d é um marcador de lugar para um valor int.

###Seção 2.6 Conceitos de memória
- Os nomes de variável correspondem a posições na memória do computador. Cada variável tem um nome, um tipo, um tamanho e um valor.
- Um valor que é colocado em uma posição de memória substitui o valor anterior da posição, que é perdido.

###Seção 2.7 Aritmética
- Os operadores aritméticos são + (adição), -(Subtração), \*(multiplicação), /(divisão) e % (resto).
- A divisão de inteiros produz um quociente inteiro.
- O operador de módulo, % fornece o resto depois da divisão.
- As expressões aritméticas devem ser escritas em sequência direta.
- Se uma expressão contiver parênteses aninhados, o conjunto mais interno dentro dos parênteses é avaliador primeiro.
- O Java aplica os operadores a expressões aritméticas em uma sequência precisa determinar pelas regras de precedência de operadores.
- Quando dizemos que operadores são aplicados da esquerda para direita, estamos referindo a sua associatividade. Alguns operadores associam da direita para esquerda.
- Os parênteses redundantes em uma expressão podem tornar uma expressão mais clara.

###Seção 2.8 Tomada de decisão: Operadores de igualdade e operadores relacionados
- A instrução if toma uma decisão baseada no valor de uma condição (verdadeiro ou falso).
- As condições em instruções in podem ser formatadas utilizando-se os operadores de igualdade ( == e !=) relacionadas (>, <, >= e <=).
- Uma instrução if começa com a palavra-chave if, seguida por uma condição entre parênteses e espera uma instrução no seu corpo.
- A instrução vazia é uma instrução que não realiza nenhuma tarefa.
