///Guia 4 - Encuentro 15 - Ejercicio 6 

//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//letras "M" y "T". Recordar que Pseint le da un valor num�rico a cada letra a trav�s del C�digo
//Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo Ejercicio15_6_LetraEntreMYT
	
	Definir letra Como Caracter
	leer letra
	
	LetraEntreMYT(letra)
	
FinAlgoritmo

SubProceso LetraEntreMYT(pletra)
		
	si pletra >= "M" Y pletra <= "T" Entonces
		Escribir " La letra esta entre M y T"
	sino 
		Escribir " la letra no est� entre M y T"
	FinSi
	
FinSubProceso
	