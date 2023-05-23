//Se pide escribir un programa que calcule la suma de los N primeros números pares. Es
//decir, si ingresamos el número 5 como valor de N, el algoritmo nos debe realizar la suma
//	de los siguientes valores: 2+4+6+8+10.

Algoritmo Ejercicio8_6_sumaNnumerospares
	
	Definir numUsuario , suma, contador,numPar Como Entero
	Definir numerosTexto Como Caracter
	
	
	Escribir  "Ingrese un número "
	leer numUsuario
	numPar = 1
	contador = 0
	suma = 0 
	numerosTexto = ""
	Hacer
		
		si  numPar MOD 2 = 0
			
			suma = suma + numPar
			contador = contador + 1
			
			numerosTexto = numerosTexto + ConvertirATexto(numPar) + "+"
//			
		FinSi
		
		numPar = numPar + 1
		
	Mientras Que numUsuario > contador
	Escribir numerosTexto + "="
	Escribir "La suma es: " suma
	
FinAlgoritmo
