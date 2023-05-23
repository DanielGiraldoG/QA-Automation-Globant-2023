/// Guia 4 - Encuentro 12 a 14 - Ejercicio 12 
//	Realizar una función que permita obtener el término n de la sucesión de Fibonacci. La
//  sucesión de Fibonacci es la sucesión de los siguientes números:
//	1, 1, 2, 3, 5, 8, 13, 21, 34, ...
//  Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
//	La sucesión del número 2 se calcula sumando (1+1)
//	Análogamente, la sucesión del número 3 es (1+2),
//	Y la del 5 es (2+3),
//	Y así sucesivamente...
//  La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
//	Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
//	Fibonacci (n) = 1 para todo n <= 1
//	Por lo tanto, si queremos calcular el término "n" debemos escribir una función que reciba
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
