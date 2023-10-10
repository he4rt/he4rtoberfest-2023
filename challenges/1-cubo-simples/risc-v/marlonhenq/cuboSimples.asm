 .text
  
 addi  a7, zero, 5 ##Lê inteiro como entrada do usuário (manda o valor para o registrador a0)
 ecall
 
 mul t1, a0, a0 #Primeira multiplicação envia para o registrador t1 o valor de a0 vezes a0
 mul t1, t1, a0 #Segunda multiplicação salva em t1 o valor de t1 vezes a0 (totalizando a0 se multiplicando 3 vezes, ou seja a0 ao cubo)
 
 add a0, t1, zero #Copia o valor de t1 para a0 (preparando para o print)
 
 addi a7, zero, 1 ##Seta a7 para print de inteiros
 ecall