/// Guia 5 - Encuentro 22 - Ejercicio Extra 3

//Realizar un programa que cree una matriz de 5x15 y deberemos llenar la matriz de unos y
//ceros. Llenando el marco o la delimitación externa de la matriz de unos y la parte interna de
//ceros.
//Por ejemplo, nuestro matriz final debería verse así:


Algoritmo EjEx22_3_MatrizUnosYCeros
	
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
			Si i = 0 o i=n-1 o j = 0 o j = m-1
				matriz[i,j] = 1
			Sino 
				matriz[i,j] = 0
			FinSi
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