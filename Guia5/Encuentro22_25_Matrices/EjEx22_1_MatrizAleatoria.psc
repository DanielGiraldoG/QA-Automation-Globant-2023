/// Guia 5 - Encuentro 22 - Ejercicio Extra1

//1. Realizar un programa que rellene de números aleatorios una matriz a través de un
//subprograma y generar otro subprograma que muestre por pantalla la matriz final.
//

Algoritmo EjEx22_1_MatrizAleatoria
	Definir matrizA,n,m Como Entero
	
	Escribir "Ingrese el número de filas de su matriz"
	leer n
	Escribir "Ingrese el número de columnas de su matriz"
	leer m
		
	Dimension matrizA[n,m]
	
	LlenarMatriz(n,m,matrizA)
	MostrarMatriz(n,m,matrizA)
	
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j] = Azar(9)
		FinPara
	FinPara
	
FinSubProceso


Subproceso MostrarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Escribir sin saltar " [ "
		Para j=0 hasta m-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir "]"
	FinPara
	
FinSubProceso