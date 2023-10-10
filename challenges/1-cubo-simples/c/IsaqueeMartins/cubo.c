#include <stdio.h> 

int main () {
    int cubo;
    printf("Digite o numero: ");
    scanf("%d", &cubo);

    int resultado = cubo*cubo*cubo;
    printf("Resultado: %d \n", resultado);

    return 0;
};