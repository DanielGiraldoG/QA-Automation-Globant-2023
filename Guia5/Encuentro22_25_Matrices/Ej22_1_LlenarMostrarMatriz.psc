/// Guia 5 - Encuentro 22 - Ejercicio 1
//1. Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el usuario y
//los muestre por pantalla.

Algoritmo Ej22_1_LlenarMostrarMatriz
	Definir matriz,n,m Como Entero
	n = 3
	m = 3
	Dimension matriz[n,m]
	
	LlenarMatriz(n,m, matriz)
	MostrarMatriz(n,m,matriz)
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Escribir " Ingrese un número entero para ubicar en la posición [" i  " , "  j "]"
			leer matriz[i,j] 
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