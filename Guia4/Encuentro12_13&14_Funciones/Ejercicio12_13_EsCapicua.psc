Funcion validacion <- EsCapicua ( pnum )
	
	Definir numInvertido,numOriginal Como Real
	Definir validacion Como logico
	
	numOriginal= pnum
	numInvertido = 0
	
	Mientras pnum <> 0 Hacer
		
		numInvertido = (pnum mod 10) + numInvertido * 10
		Escribir "numinvertido: " numInvertido
		pnum = trunc (pnum/10)
		Escribir "pnum: " pnum
		
	FinMientras	
	
	validacion = numOriginal == numInvertido 

Fin Funcion

Algoritmo Ejercicio12_13_EsCapicua
	Definir num Como Real
	
	leer num
	
	Si  EsCapicua(num) == Verdadero entonces
		Escribir "El num " num " es capicua " 
		
	Sino 
		Escribir "El num " num " no es capicua " 
	FinSi
	
FinAlgoritmo