.data 
	hello:  .asciz "Hello World!"
	
.text
	la a0, hello
	addi a7, zero, 4
	
	ecall