//Realizar un programa que lea 5 números (comprendidos entre 1 y 20) e imprima el número
//ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//	5 *****
//	3 ***
//	11 ***********
//	2 **
//	9 *********

Algoritmo EjCoop_numAstericos
	
	Definir num Como Real
	Definir i,j Como Entero
	Definir  cadenanum Como Caracter
	
//	Escribir "Ingrese 5 numeros"
//	Leer  num1
//	Leer  num2
//	Leer  num3
//	Leer  num4
//	Leer  num5
	
	para i = 1 hasta 5 Con Paso 1 Hacer
		
		Escribir "Ingrese numero"
		leer num
		
		Mientras num <0 O num>20 Hacer
			
			Escribir "Ingrese un número entre 0 y 20"
			leer num 
		FinMientras
		
		cadenanum = ""
		
		para j= 1 hasta num Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num , ":" , cadenanum
		
	FinPara
FinAlgoritmo
