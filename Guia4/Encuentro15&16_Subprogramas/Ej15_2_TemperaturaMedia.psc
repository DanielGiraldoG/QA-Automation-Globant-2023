/// Guia 4 - Encuentro 15 - Ejercicio2
//2. Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//programa pedir� el n�mero de d�as que se van a introducir.

Algoritmo Ej15_2_TemperaturaMedia
	
	Definir numDias Como Entero
	
	Escribir "Escribe el numero de dias "
	leer numDias
	
	TemperaturaMedia(numDias)
	
FinAlgoritmo

SubProceso TemperaturaMedia(numDias)
	
	Definir tempMax, tempMin, tempMedia Como Real
	Definir i Como Entero

	para i = 1 hasta numDias con Paso 1 entonces
		Escribir "Ingrese temperatura m�xima del dia " i
		Leer  tempMax
		Escribir "Ingrese temperatura m�nima del d�a " i 
		Leer  tempMin
		
		tempMedia = (tempMax+tempMin)/2
		Escribir "la temperatura media del dia " i " es de " tempMedia
		Escribir ""
	FinPara
FinSubProceso
	