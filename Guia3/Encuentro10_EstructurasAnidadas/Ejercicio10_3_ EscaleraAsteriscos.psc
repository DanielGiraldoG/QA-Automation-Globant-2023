//Escriba un programa que lea un n�mero entero (altura) y a partir de �l cree una escalera
//invertida de asteriscos con esa altura. Por ejemplo, si ingresamos una altura de 5 se
//deber� mostrar:
//	*****
//	****
//	***
//	**
//  *


Algoritmo Ejercicio10_3_EscaleraAsteriscos
	
	Definir altura, i,j Como Entero
	
	Escribir "Ingrese la altura"
	Leer  altura
	
	para i = altura hasta 1 Con Paso -1 Hacer
		para j=1 hasta i Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		escribir ""
		
	FinPara

FinAlgoritmo
