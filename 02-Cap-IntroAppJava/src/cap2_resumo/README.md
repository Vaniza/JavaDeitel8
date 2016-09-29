##Resumo do Cap�tulo 2 - Introdu��o aos aplicativos JAVA
###Se��o 2.2 Nosso primeiro programa Java imprimindo uma linha de texto
- Um aplicativo Java � um programa de computador que � executado quando voc� utiliza o comando java para carregar a JVM.
- Os coment�rios documentam programas e aprimoram sua legibilidade. Eles s�o ignorados pelo compilador.
- Um coment�rio que come�a com // � chamado de coment�rio de fim de linha � ele termina no fim da linha em que aparece.
- Coment�rios tradicionais podem se estender por v�rias linhas e s�o delimitados por /* e */.
- Os coment�rios da Javadoc, delimitados por /\*\* e \*/, permitem que voc� incorpore a documenta��o do programa no c�digo. - O programa utilit�rio javac gera p�ginas em HTML, com base nesses coment�rios.
- Um erro de sintaxe (tamb�m chamado erro de compilador, erro em tempo de compila��o ou erro de compila��o) ocorre quando o compilador encontra um c�digo que viola as regras da linguagem do Java. Isso � semelhante a um erro de gram�tica em uma l�ngua natural.
- Linhas em branco, caracteres de espa�o em branco e caracteres de tabula��o s�o conhecidos como espa�os em branco. O espa�o em branco torna os programas mais f�ceis de ler e n�o � ignorado pelo compilador.
- Todo programa que voc� cria consiste em pelo menos uma classe definida pelo programador.
- As palavras-chaves s�o reservadas para uso pelo Java e sempre s�o escritas com todas as letras min�sculas.
- A palavra-chave class introduz uma declara��o de classe e � imediatamente seguida pelo nome da classe.
- Por conven��o, todos os nomes de classes em Java iniciam com uma letra mai�scula e apresentam a letra inicial de cada palavra que eles incluem em mai�sculas (por exemplo, SampleClassName).
- O nome de uma classe Java � um identificador � uma s�rie de caracteres que consiste em letras, d�gitos, sublinhados ( _ ) e sinais de cifr�o ($) que n�o iniciem com um d�gito e n�o contenham espa�os.
- O Java diferencia entre letras mai�sculas e min�sculas � isto �, letras mai�sculas e min�sculas s�o diferentes.
- O corpo de cada declara��o de classe � delimitado por chaves, { e }.
- Uma declara��o de classe public deve ser salva em um arquivo com o mesmo nome da classe seguindo pela extens�o de nome de arquivo � .java�.
- O m�todo main � o ponto de partida de cada aplicativo Java e deve iniciar com : public static void main( String[] args) Caso contr�rio, a JVM n�o executar� o aplicativo.
- Os m�todos realizam tarefas e informa��es de retorno quando eles completam suas tarefas. A palavra-chave void indica que um m�todo realizar� uma tarefa, mas n�o retornar� nenhuma informa��o.
- As instru��es fazem o computador realizar a��es.
- Uma string entre aspas duplas � �s vezes chamada de string de caracteres ou string literal.
- O objeto de sa�da padr�o (System.out) exibem caracteres na janela de comando.
- O m�todo System.out.println exibe seu argumento na janela de comando seguindo por um caractere de nova linha para posicionar o cursos de sa�da no come�o da pr�xima linha.
- Voc� compila um programa com o comando javac. Se o programa n�o contiver nenhum erro de sintaxe, um arquivo de classe contendo os bytecodes Java que representam o aplicativo � criado. Esses bytecodes s�o interpretados pela JVM quando executamos o programa.
- Para executar um aplicativo, digite java seguido pelo nome da classe que cont�m o main.

###Se��o 2.3 Modificando nosso primeiro programa Java
- System.out.print exibe seu argumento e posiciona o cursor de sa�da imediatamente ap�s caractere exibido.
- Uma barra investida (\) em uma string � um caractere de escape. O Java combina o pr�ximo caractere com as barras investidas para formar uma sequ�ncia de escape. A sequ�ncia de escape. A sequ�ncia de escape \n representa o caractere de nova linha.

###Se��o 2.4 Exibindo texto com printf
- O m�todo System.out.printf (f significa �formatado�) exibe os dados formatados.
- O primeiro argumento do m�todo printf � uma string de formado que pode consistir um texto fixo e especificadores de formato. Cada especificador de formato � um marcador de lugar para um valor e especifica o tipo de sa�da de dados.
- Especificadores de formato iniciam com um sinal de percentagem (%) e s�o seguidos por um caractere que representa o tipo de dados. Os especificadores de formato % � um marcador de lugar para uma string.
- Cada especificador de formato � substitu�do pelo valor de argumento correspondente que aparece depois da string de formato.

###Se��o 2.5 Outro aplicativo: somando inteiros
- Uma declara��o import ajuda o compilador a localizar uma classe utilizada em um programa.
- O rico conjunto do Java de classes predefinidas � agrupado em pacotes � chamados de grupos de classes.
- Coletivamente, os pacotes do Java s�o chamados de bibliotecas de classes Java ou Java Application Programming Interface (Java API).
- Uma vari�vel � uma posi��o na mem�ria do computador onde um valor pode ser armazenado para utiliza��o posterior em um programa. Todas as vari�veis devem ser declaradas com um nome � um tipo antes que elas possam ser utilizadas.
- O nome de uma vari�vel permite que o programa acesse o valor da vari�vel na mem�ria.
- Um Scanner (pacote java.util) permite a um programa ler os dados para uso em um programa. Antes de um Scanner poder utilizado, o programa deve cria-lo e especificar a origem dos dados.
- Vari�veis devem ser inicializadas para prepar�-las para uso em um programa.
- A express�o new Scanner (System.in) cria um Scanner que l� o objeto de entra padr�o (System.in) � normalmente o teclado.
- O tipo de dados int � utilizado para declarar vari�veis que conter�o valores de inteiro. O intervalo de valores para um int � -2.147.483.648 a +2.147.483.647.
- Os tipos float e double especificam n�mero reais com pontos decimais, como 3.4 e -11.19.
- Vari�veis do tipo char representam caracteres individuais, como uma letra mai�scula (por exemplo, A), um digito (por exemplo, 7), um caractere especial (por exemplo, * ou %) ou uma sequ�ncia de escape (por exemplo, nova linha \n).
- Tipos como int, float, double e char s�o tipos primitivos, Os nomes dos tipos primitivos s�o palavras-chaves, portanto, todos devem aparecer em letras min�sculas.
- Um prompt direciona o usu�rio a tomar uma a��o espec�fica.
- O m�todo Scanner nextInt obt�m um inteiro para uso em um programa.
- O Operador de atribui��o, =, permite ao programa atribuir um valor a uma vari�vel. O operador = � chamado operador bin�rio porque tem dois operandos.
- Partes das instru��es que cont�m valores s�o chamados express�es.
- O Especificador de formato %d � um marcador de lugar para um valor int.

###Se��o 2.6 Conceitos de mem�ria
- Os nomes de vari�vel correspondem a posi��es na mem�ria do computador. Cada vari�vel tem um nome, um tipo, um tamanho e um valor.
- Um valor que � colocado em uma posi��o de mem�ria substitui o valor anterior da posi��o, que � perdido.

###Se��o 2.7 Aritm�tica
- Os operadores aritm�ticos s�o + (adi��o), -(Subtra��o), \*(multiplica��o), /(divis�o) e % (resto).
- A divis�o de inteiros produz um quociente inteiro.
- O operador de m�dulo, % fornece o resto depois da divis�o.
- As express�es aritm�ticas devem ser escritas em sequ�ncia direta.
- Se uma express�o contiver par�nteses aninhados, o conjunto mais interno dentro dos par�nteses � avaliador primeiro.
- O Java aplica os operadores a express�es aritm�ticas em uma sequ�ncia precisa determinar pelas regras de preced�ncia de operadores.
- Quando dizemos que operadores s�o aplicados da esquerda para direita, estamos referindo a sua associatividade. Alguns operadores associam da direita para esquerda.
- Os par�nteses redundantes em uma express�o podem tornar uma express�o mais clara.

###Se��o 2.8 Tomada de decis�o: Operadores de igualdade e operadores relacionados
- A instru��o if toma uma decis�o baseada no valor de uma condi��o (verdadeiro ou falso).
- As condi��es em instru��es in podem ser formatadas utilizando-se os operadores de igualdade ( == e !=) relacionadas (>, <, >= e <=).
- Uma instru��o if come�a com a palavra-chave if, seguida por uma condi��o entre par�nteses e espera uma instru��o no seu corpo.
- A instru��o vazia � uma instru��o que n�o realiza nenhuma tarefa.
