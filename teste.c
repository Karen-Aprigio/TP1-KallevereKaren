#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
int i = 0;
int tam = 9;
int vetor[tam];
int soma = 0;
printf("digite 9 digitos:\n");

while(i < tam){
scanf("%d", &vetor[i]);
i++;
}
i = 0;
while(i < tam){
if(vetor[i]%2==0){
printf("numero pares:%d\n", vetor[i]);
soma = vetor[i]+ soma;
}
else{
printf("numero impares:%d\n", vetor[i]);    
    
}
i++;
}
printf("soma: %d\n", soma);
return 0;

