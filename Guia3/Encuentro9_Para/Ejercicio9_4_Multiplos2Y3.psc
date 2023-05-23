//Realizar un programa que muestre la cantidad de números que son múltiplos de 2 o de 3
//comprendidos entre 1 y 100.

Algoritmo Ejercicio9_4_Multiplos2Y3
	
	Definir cantidadNumeros, contador1, contador2, i Como Entero
	
	
	contador1 = 0
	contador2 = 0
	
	para i = 0 Hasta 100 Hacer
		
		Si i mod 2 == 0 Entonces
			contador1= contador1 + 1
		FinSi
		Si i mod 3 == 0 Entonces
			contador2 = contador2 + 1
		FinSi
		
		
	FinPara
	
	Escribir "La cantidad de numeros que son múltiplos de 2 son: " contador1
	Escribir "La cantidad de numeros que son múltiplos de 3 son: " contador2
	
FinAlgoritmo
