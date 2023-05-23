Algoritmo Actividad4_4
	
	Escribir "Ingresa un numero de tres cifras"
	Definir num, centena, resto, decena, unidad Como Real
	Leer num
	
	centena = Trunc(num / 100)
	
	resto = num % 100
	
	decena = Trunc(resto / 10)
	
	resto = num % 10
	
	unidad = resto
	
	Si  centena == unidad Entonces
		Escribir "El numero que ingresaste es Capicua"
	Fin Si
	Si centena <> unidad Entonces
		Escribir "El numero que ingresaste no es Capicua"
	Fin Si
	
FinAlgoritmo