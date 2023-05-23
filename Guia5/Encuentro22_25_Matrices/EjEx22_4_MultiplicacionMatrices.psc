/// Guia 5 - Encuentro 22 - Ejercicio Extra 4
//4. Realizar un programa que calcule la multiplicación de dos matrices de enteros de 3x3.
//Inicialice las matrices para evitar el ingreso de datos por teclado.

Algoritmo EjEx22_4_MultiplicacionMatrices
	Definir matrizA, matrizB, matrizC, filaA, filaB, columnaA, columnaB Como Entero
	
	//Se asume matriz B tiene las mismas filas que el numero de columnas matriz A
	
	Escribir "Ingrese el número de filas de su matriz A"
	leer filaA
	Escribir "Ingrese el número de columnas de su matriz A"
	leer columnaA
	
	Hacer
		Escribir "Ingrese el número de filas de su matriz B, recuerde que debe ser igual al numero de columnas de su matriz A"
		leer filaB
	Mientras que filaB <> columnaA
	
	Escribir "Ingrese el número de columnas de su matriz B"
	leer columnaB
	
	Dimension matrizA[filaA,columnaA]
	Dimension matrizB[filaB,columnaB]
	Dimension matrizC[filaA,columnaB]
	
	LlenarMatriz(filaA,columnaA,matrizA)
	LlenarMatriz(filaB,columnaB,matrizB)
	Multiplicacion(filaA,columnaA, columnaB, matrizA, matrizB, matrizC)	
	
	Escribir " Matriz A"
	MostrarMatriz(filaA,columnaA,matrizA)
	Escribir " Matriz B"
	MostrarMatriz(filaB,columnaB,matrizB)
	Escribir " Matriz A x Matriz B es igual a: "
	MostrarMatriz(filaA,columnaB,matrizC)
	
FinAlgoritmo

SubProceso LlenarMatriz(fila,columna,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta fila-1 Hacer
		Para j=0 hasta columna-1 Hacer
			matriz[i,j] = aleatorio(1,9)
		FinPara
	FinPara
	
FinSubProceso

Subproceso MostrarMatriz(fila,columna,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta fila-1 Hacer
		Escribir sin saltar " [ "
		Para j=0 hasta columna-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir "]"
	FinPara
	Escribir ""
FinSubProceso

SubProceso Multiplicacion(filaA,columnaA,columnaB, matrizA, matrizB, matrizC)	
	
	Definir i,j,k, suma Como Entero
	
	Para i = 0 Hasta filaA-1 Hacer
		Para j = 0 hasta columnaB-1 Hacer
			suma = 0
			para k= 0 hasta columnaA-1 hacer
				suma = suma + (matrizA[i,k] * matrizB[k,j])
			FinPara	
			matrizC[i,j]  = suma
		FinPara
	FinPara
FinSubProceso

//Paso a paso
//escribir "----"
//Escribir "i: " i , " j: " j , " k: " k , " [j,k]: " matrizA[j,k] ,  " [k,j]" matrizB[k,j], " [i,k]: " matrizA[j,k]   " suma = " matrizC[i,j]
