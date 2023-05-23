/// Guia 5 - Encuentro 22 - Ejercicio 3
//3. Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario) realizar
//un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos otro
//subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar la matriz y
//los resultados por pantalla.


Algoritmo Ej22_3_SumaMatriz
	Definir matriz,n,m, numUsuario Como Entero
	
	Escribir " Ingrese el numero de filas de la matriz"
	leer n 
	Escribir " Ingrese el número de columnas de la matriz"
	leer m 
	Dimension matriz[n,m]
	
	LlenarMatriz(n,m, matriz)
	MostrarMatriz(n,m,matriz)
	SumaMatriz(n,m, matriz)
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j, numUsuario Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j] = azar(50) 
		FinPara
	FinPara
FinSubProceso

SubProceso SumaMatriz(n,m,matriz)
	Definir i,j, suma Como Entero
	suma = 0
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			suma = suma + matriz[i,j]
		FinPara
	FinPara
	Escribir " La suma de todos los números dentro de la matriz es de: " suma
	
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
