

//Desenvolver um programa em Dart que verifique se um número é positivo ou negativo.


void main () { 
  
  for(int i=0; i<5; i++){
    var result = i % 2;
    
    if(result == 0){
      print("$i - positivo");
    }else{
      print("$i - negativo");
    }
  }
  for(int i=0; i<2; i++ ){
    var result = i % 2 == 0 ? print("$i - positivo") : print("$i -negativo");
    
   
  }
  
}


//Desenvolver um programa em Dart que compare dois números e diga se o primeiro é maior, menor ou igual ao segundo número.



void main() {
  
  int num1 = 15;
  int num2 = 45;
  
   if(num1 > num2){
  print('Num 1 é menor');
}else{
  print("Núm 2 é maior");
}
  if(num1 == num2){
  print('Números iguais');
}else{
  print("Números diferentes");
}
   
}



//Desenvolver um programa que receba três variáveis: a, b e c. Sabe-se que a = 2; b = 4; c = 5. Calcule as seguintes fórmulas:
//a) calculo = a + b * c;
//b) calculo 2 = b / a * c;
//E mostre os resultados na tela e escreva se são iguais os resultados.



void main() {
  
  var a = 2;
  var b = 4;
  var c = 5;
  
  print(a + b * c);
  print(b /a * c);  
  
  print("Resultados diferentes");
}


//Desenvolver um programa em Dart que calcule a média de duas notas de
//um aluno e verifique se a média é maior ou igual a 6 escreva “Aprovado” e caso contrário “Reprovado”



void main() {
  
  int media = 6;
  int aluno1 = 15;
  int aluno2 = 3;
  
  print('media = 6 ');
  
   if(aluno1 < aluno2){
  print('aluno1 ');
}else{
  print('aluno2');
}
  if(aluno2 == aluno1){
  print('Aprovado');
}else{
  print("Reprovado");
}
}


//Desenvolver um programa em Dart que calcule a média de 3 notas de um aluno. Verifique se a média for maior ou igual a 7 o
//aluno está aprovado, caso a média esteja entre 7 a 6 informar Exame e caso contrário Reprovado.


void main(){

    ('n1, n2, n3, p1, p2, p3, media');
  
  
  print('n1, n2, n3, p1, p2, p3, media');


   print("Insira o valor da primeira nota:3 ");

 

   print("Insira o peso da primeira nota:20 ");

   

   print("Insira o valor da segunda nota:20 ");

  

   print("Insira o peso da segunda nota: 20");

   

   print("Insira o valor da terceira nota: 8 ");

   

   print("Insira o peso da terceira nota:10 ");

  
	print('aprovado');
	print('reprovado')
  

}




//Desenvolver um programa em Dart que calcule a média de 4 notas de um aluno. Verifique se a média for maior ou igual a 7 o
//aluno está aprovado e caso contrário Reprovado. Informe ainda o conceito de acordo com a tabela: A - 10 - 9, B - 8.9 - 8, C -
//7.9 a 7, F - menor que 7.

void main(){

    
  int media = 6;
  int aluno1 = 15;
  int aluno2 = 3;
  int aluno3 = 6;
  int aluno4 = 7;
  
  print(media);
  
   if(aluno1 < aluno2){
  print('aluno1 ');
}else{
  print('aluno2');
}
  if(aluno2 == aluno1){
  print('aprovado');
}else{
}
   if(aluno3 < aluno4){
  print('aluno3 ');
}else{
  print('aluno4');
}
if(aluno3 == aluno4){
  print('aprovado');
}else{
  
  
}}





//Desenvolver um programa em Dart que calcule o índice da massa corporal. IMC = peso (kg) / altura (m) x altura (m). Verifique
//a seguinte tabela e escreva a classificação:



void main() {
  
  
  print(65);//peso
  double peso = 65;
  
  print(1.76);//altura
  double altura = 1.76;
  

  double imc = peso / (altura * altura);
 
 
  print('Seu IMC é  ' + imc.toStringAsFixed(2)); // apareceu isto na soma:preciso ver para que serve//
 
  if (imc < 16) {
    print('Magreza grave');
  } else if (imc < 17) {
    print('Magreza moderada');
  } else if (imc < 18.5) {
    print('Magreza leve');
  } else if (imc < 25) {
    print('Saudável');
  } else if (imc < 30) {
    print('Sobrepeso');
  } else if (imc < 35) {
    print('Obesidade – GRAU I');
  } else if (imc < 40) {
    print('Obesidade – GRAU II | Severa');
  } else {
    print('Obesidade – GRAU III | Mórbida');
  }
}


//Desenvolver um programa em dart que valide se o saldo da conta corrente é maior ou igual ao valor que o cliente quer sacar.
//Caso tenha saldo calcule o novo saldo subtraindo o valor do saque e escreva “Saque efetuado com sucesso!”, caso contrário
//escreva “Saldo indisponível”. Mostre o saldo final

void main() {
  double saldo = 15000;
 print('Digite o valor de retirada: R\$: 1200 ');
 
 
  if (saldo <= 170000)
print('saldo insuficiente');
 
  else
    (saldo >= 1600);
  print('saldo sufuciente');
    
    //não consigui finalizar.
}


//Desenvolva um programa que calcule a idade e diga se qual a categoria de um curso de natação: Criança 0 a 12 anos, Jovem
//de 13 a 21 anos, Adulto 22 a 59 anos e Terceira Idade 60 anos ou mais.



void main(){

    // 0 a 12 anos criança
   //13 a 21 anos jovem
   //22 a 59 anos adultos
  //60 anos ou mais Terceira idade 



(int idade){
    if(idade >= 0 && idade <= 12){
        print("criança");
    }
    else if(idade >= 13 && idade <= 21){
        print("jovem");
    }
    else if(idade >= 22 && idade <= 59){
        print("adultos");
    }
    else if(idade >= 60 && idade <= 120){
        print("terceira idade");
    }


    print(15);
    print("%d &idade");
  
};
}


//Desenvolva um programa em Dart que informe qual o tamanho que
// a cliente deve usar baseado no seu peso:
//P - menor que 60 kg, M - 61 a 74 e G - 75 a 85 e GG acima de 86 kg.



void main(){

    //P menor que 60kg
  //M 61 a 74
  //G 75 A 85
  //GG acima de86g
  


(int tamanho){
    if(tamanho >= 60 && tamanho <= 60){
        print("Tamanho P");
    }
    else if(tamanho >= 61 && tamanho <= 74){
        print("Tamanho M");
    }
    else if(tamanho >= 75 && tamanho <= 85){
        print("Tamanho G");
    }
    else if(tamanho >= 86 && tamanho <= 110){
        print("Tamanho GG");
    }


    print(tamanho);
     print(85);
    print("%d &tamanho");
  
};
}


//Desenvolva um programa em Dart que informe qual o novo salário do funcionário. O valor do dissídio 4%. O funcionário
//somente vai receber caso tenha 1 ou mais anos de empresa. Calcule o novo salário e mostre na tela e caso não tenha direito
//informe “Funcionário com menos de 1 ano de empresa”.



void main() {
  
  double novoSalario = 0;
  print('Digite o salário atual: R\$:1.350  ');
  double salarioAtual =(1.350);
  
  if (salarioAtual <= 1.350)
    (novoSalario = 1.500 * salarioAtual);
  else
    (novoSalario = 1.500 * salarioAtual);
 
  print('Seu novo salário é: R\$:' + novoSalario.toStringAsFixed(2));
  
  print("só irá receber se tiver 1 ano ou mas de empresa");
  print('caso contrario,infelizmente ficará de fora');
}