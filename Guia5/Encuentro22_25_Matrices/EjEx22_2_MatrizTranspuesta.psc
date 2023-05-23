/// Guia 5 - Encuentro 22 - Ejercicio Extra 2

// 1  0  4 		1  0  6
// 0  5  0	->	0  5  0
// 6  0 -9		4  0 -9

//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario), llenarla
//con números aleatorios entre 1 y 100 y mostrar su traspuesta.

Algoritmo EjEx22_2_MatrizTranspuesta
	Definir matrizA,matrizT, n,m Como Entero
	
	Escribir "Ingrese el número de filas de su matriz"
	leer n
	Escribir "Ingrese el número de columnas de su matriz"
	leer m
	
	Dimension matrizA[n,m] , matrizT[m,n]
	
	LlenarMatriz(n,m,matrizA)
	MatrizTraspuesta(n,m,matrizA,matrizT)
	MostrarMatriz(n,m,matrizA)
	MostrarMatriz(m,n,matrizT)
	
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j] = Azar(9)
		FinPara
	FinPara
	
FinSubProceso

SubProceso MatrizTraspuesta(n,m,matriz, matrizT)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matrizT[j,i] = matriz[i,j]
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
	
	Escribir ""
FinSubProceso