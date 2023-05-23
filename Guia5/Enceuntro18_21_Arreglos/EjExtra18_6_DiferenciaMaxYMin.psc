/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 6
//6. Crear una función que devuelva la diferencia que hay entre el valor más chico de un arreglo y
//su valor más grande.

Algoritmo EjExtra18_6_DiferenciaMaxYMin
	Definir vector, n, max, min Como Entero
	
	Escribir " Ingrese la dimensión del vector "
	leer n
	
	Dimension vector(n)
	LlenarVector(n, vector)
	
	MaxVector(n,vector, max)
	MinVector(n, vector,min)
	
	Escribir "La diferencia entre el máximo y minimo es: " max - min
	
FinAlgoritmo

SubProceso LlenarVector(n, vector Por Referencia)
	Definir i  Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Escribir "Ingrese un valor para almacena en el espacio " i " del vector"
		leer vector(i) 
	FinPara
	
FinSubProceso

SubProceso MaxVector(n, vector, max Por Referencia)
	Definir i Como Entero
	max = vector(0) 
	
	Para i = 1 hasta n-1 Hacer
		Si vector(i) >= max
			max = vector(i)
		FinSi
	FinPara
FinSubProceso

SubProceso MinVector(n, vector, min Por Referencia)
	Definir i Como Entero
	min = vector(0) 
	
	Para i = 1 hasta n-1 Hacer
		Si vector(i) <= min
			min = vector(i)
		FinSi
	FinPara
FinSubProceso

	