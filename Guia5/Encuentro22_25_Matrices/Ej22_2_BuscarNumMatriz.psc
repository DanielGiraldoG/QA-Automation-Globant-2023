/// Guia 5 - Encuentro 22 - Ejercicio 2
//2. Escribir un programa que realice la búsqueda lineal de un número entero ingresado por el
//usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra. En
//caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.

Algoritmo Ej22_2_BuscarNumMatriz
	Definir matriz,n,m, numUsuario Como Entero
	n = 5
	m = 5
	Dimension matriz[n,m]
	
	LlenarMatriz(n,m, matriz)
	MostrarMatriz(n,m,matriz)
	
	Escribir " Ingrese el valor que desea buscar en la matriz "
	Leer numUsuario
	
	BuscarValor(n,m, matriz, numUsuario)
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j, numUsuario Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j] = azar(50) 
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

SubProceso BuscarValor(n,m, matriz, numUsuario)
	Definir i,j Como Entero
	Definir validacion Como Logico
	validacion = Falso
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Si 	matriz[i,j] == numUsuario Entonces
				Escribir " El numero " numUsuario " esta en la posición [" i " , " j "]"
				validacion = verdadero
			FinSi
		FinPara
	FinPara
	
	Si !validacion Entonces
		Escribir  " No se han encontrado el valor " numUsuario " dentro de la matriz"
	FinSi
		
FinSubProceso
