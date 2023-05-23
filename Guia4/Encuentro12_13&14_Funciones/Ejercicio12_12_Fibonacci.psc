/// Guia 4 - Encuentro 12 a 14 - Ejercicio 12 
//	Realizar una funci�n que permita obtener el t�rmino n de la sucesi�n de Fibonacci. La
//  sucesi�n de Fibonacci es la sucesi�n de los siguientes n�meros:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//  Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
//	La sucesi�n del n�mero 2 se calcula sumando (1+1)
//	An�logamente, la sucesi�n del n�mero 3 es (1+2),
//	Y la del 5 es (2+3),
//	Y as� sucesivamente...
//  La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//	Fibonacci (n) = 1 para todo n <= 1
//	Por lo tanto, si queremos calcular el t�rmino "n" debemos escribir una funci�n que reciba
//	como argumento el valor de "n" y que calcule la serie hasta llegar a ese valor.


Funcion retorno <- Fibonacci ( pn )
	
	Definir suma,i,j Como entero
	Definir retorno,sucession, cadenaFibonacci Como cadena
	
	suma = 1
	i = 2
	j = 0
	cadenaFibonacci = " 1 , 1 ,  "
	
	Hacer
		suma = suma + i
		
		j = i
		i = i + suma
		
		Escribir "suma: " suma
		Escribir "i: " i
		Escribir "j: " j
		
		Si suma < pn
			cadenaFibonacci = cadenaFibonacci + ConvertirATexto(suma)
			cadenaFibonacci = cadenaFibonacci + " , " +  ConvertirATexto(i) + " , "
		SiNo
			cadenaFibonacci = cadenaFibonacci +  " = "
		FinSi
		
	Mientras Que i < pn Y suma <= pn
	

	retorno = cadenaFibonacci 
	
Fin Funcion

///Algoritmo principal

Algoritmo Ejercicio13_12_Fibonacci
	
	Definir n Como Entero
	
	Escribir "Ingrese el numero hasta donde desea calcular la serie fibonacci"
	leer n
	
	Escribir  "la serie de fibonacci hasta el numero " n " es: " Fibonacci(n)
	
FinAlgoritmo
