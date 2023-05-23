Algoritmo sin_titulo
	Definir matrizA, vector, matrizC, filaA, columnaA Como Entero
	
	//Se asume matriz B tiene las mismas filas que el numero de columnas matriz A
	
	Escribir "Ingrese el número de filas de su matriz A"
	leer filaA
	Escribir "Ingrese el número de columnas de su matriz A"
	leer columnaA
	

	Dimension matrizA[filaA,columnaA]
	Dimension vector[columnaA]
	Dimension matrizC[filaA,1]
	
	LlenarMatriz(filaA,columnaA,matrizA, vector)
	MostrarMatriz(filaA,columnaA,matrizA)

	MultiplicarMatrizVector(filaA,columnaA, matrizA, vector, matrizC)	
	
	Escribir " Matriz A"
	MostrarMatriz(filaA,columnaA,matrizA)
	Escribir " Matriz B"
	MostrarMatriz(filaB,columnaB,matrizB)
	Escribir " Matriz A x Matriz B es igual a: "
	MostrarMatriz(filaA,columnaB,matrizC)
	
FinAlgoritmo

SubProceso LlenarMatriz(fila,columna,matriz, vector)
	Definir i,j Como Entero
	
	Para i = 0 Hasta fila-1 Hacer
		Para j=0 hasta columna-1 Hacer
			matriz[i,j] = aleatorio(1,9)
			vector[j] = azar(9)
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


SubProceso MultiplicarMatrizVector(filaA,columnaA, matrizA, vector, matrizC)	
	
	Definir i,j,suma Como Entero
	suma = 0 
	
	Para i=0 hasta filaA-1 Hacer
		suma = 0
		Para j=0 hasta columnaA-1 Hacer
			suma = suma + matrizA[i,j] * vector[j]
			
		FinPara
		matrizC[i,j] = suma
	FinPara
	
FinSubProceso
