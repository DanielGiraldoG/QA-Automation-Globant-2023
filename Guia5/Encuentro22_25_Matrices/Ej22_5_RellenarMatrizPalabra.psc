/// Guia 5 - Encuentro 22 - Ejercicio 5
//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
//encontrando la manera de que la frase se muestre de manera continua en la matriz.

Algoritmo Ej22_5_RellenarMatrizPalabra
	Definir n,m Como Entero
	Definir matrizA como cadena
	n=3
	m=3
	Dimension matrizA[n,m]
	
	
	LlenarMatriz(n,m,matrizA)
	MostrarMatriz(n,m, matrizA)
	
FinAlgoritmo

SubProceso LlenarMatriz(n,m,matriz Por Referencia)
	Definir i,j,k Como Entero
	Definir frase como cadena
	
	Leer frase
	k = 0
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			matriz[i,j] = subcadena(frase, k, k)
			k = k +1
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