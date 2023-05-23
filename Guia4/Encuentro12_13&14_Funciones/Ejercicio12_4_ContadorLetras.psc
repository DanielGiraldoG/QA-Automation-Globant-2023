Funcion contadorLetra <- HallarLetra ( frase , letra )
	
	Definir i, contadorLetra Como Entero
	Definir letraComparar Como Caracter
	
	contadorLetra=0
	
	Para i=0 hasta Longitud(frase) Hacer
		letraComparar = subcadena(frase,i,i)  
		si letraComparar == letra Entonces
			contadorLetra = contadorLetra + 1
		FinSi
	FinPara
			
Fin Funcion

Algoritmo Ejercicio12_4_ContadorLetras
	Definir frase, letra Como Caracter
	Definir x Como entero
	
	Escribir "Ingrese Frase"
	leer frase
	
	Escribir "Ingrese letra a buscar"
	leer letra
	
	x = HallarLetra(frase, letra)
	
	Escribir x
FinAlgoritmo
