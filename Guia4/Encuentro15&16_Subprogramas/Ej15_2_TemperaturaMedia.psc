/// Guia 4 - Encuentro 15 - Ejercicio2
//2. Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya
//pidiendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//programa pedirá el número de días que se van a introducir.

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
		Escribir "Ingrese temperatura máxima del dia " i
		Leer  tempMax
		Escribir "Ingrese temperatura mínima del día " i 
		Leer  tempMin
		
		tempMedia = (tempMax+tempMin)/2
		Escribir "la temperatura media del dia " i " es de " tempMedia
		Escribir ""
	FinPara
FinSubProceso
	