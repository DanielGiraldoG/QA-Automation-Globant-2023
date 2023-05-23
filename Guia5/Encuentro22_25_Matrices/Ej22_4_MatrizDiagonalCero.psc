/// Guia 5 - Encuentro 22 - Ejercicio 4
//4. Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la diagonal
//	principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe generar otro
//	subproceso para imprimir la matriz.

Algoritmo Ej22_4_MatrizDiagonalCero
	Definir matrizA,n,m Como Entero
	
	Escribir "Ingrese la dimensión de la matriz n x n "
	leer n
	m = n 
	Dimension matrizA[n,m]

	LlenarMatriz(n,m,matrizA)
	MostrarMatriz(n,m, matrizA)
	
FinAlgoritmo


SubProceso LlenarMatriz(n,m,matriz Por Referencia)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Si i = j Entonces
				matriz[i,j] = 0
			SiNo
				matriz[i,j] = aleatorio(1,9)
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
	