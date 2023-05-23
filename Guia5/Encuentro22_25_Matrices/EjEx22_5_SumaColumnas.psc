/// Guia 5 - Encuentro 22 - Ejercicio Extra 5

//Crear una matriz que contenga 3 columnas y la cantidad filas que decida el usuario. Las dos
//primeras columnas contendrán valores enteros ingresados por el usuario y en la 3 columna se
//deberá almacenar el resultado de sumar el número de la primera y segunda columna. Mostrar
//la matriz de la siguiente forma:
//	3 + 5 = 8
//	4 + 3 = 7
//	1 + 4 = 5

Algoritmo EjEx22_5_SumaColumnas
	
	Definir matriz,n,m Como Entero
	
	Escribir "Ingrese el número de filas de su matriz A"
	leer n
	m = 3
	
	Dimension matriz[n,m]
	
	MatrizSuma(n,m,matriz)
	MostrarMatriz(n,m,matriz)

FinAlgoritmo

SubProceso MatrizSuma(n,m,matriz)
	Definir i,j,suma Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		suma = 0
		Para j=0 hasta m-2 Hacer
			Escribir " Ingrese el número de la posición (" i " , " j ")" 
			leer matriz[i,j] 
			suma = suma + matriz[i,j]
			matriz[i,m-1] = suma
		FinPara
	FinPara
FinSubProceso


Subproceso MostrarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Escribir sin saltar " [ "
		Para j=0 hasta m-1 Hacer
			Si j=m-1 Entonces
				Escribir sin saltar matriz[i,j] 
			SiNo
				Si j=m-2 Entonces
					Escribir sin saltar  matriz[i,j] " = "
				Sino 
					Escribir sin saltar  matriz[i,j] " + "
				FinSi
			FinSi
		FinPara
		Escribir " ]"
	FinPara
	
	Escribir ""
FinSubProceso