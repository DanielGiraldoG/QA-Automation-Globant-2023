/// Guia 5 - Encuentro 22 - Ejercicio 6
// 4 9 2        2 7 6
// 3 5 7   o	9 5 1
// 8 1 6		4 3 8

Algoritmo Ej22_6_MatrizMagica
	Definir matrizA,n,m, vectorSumaFilas,i, vectorSumaColumnas, vectorSumaDiagonalPrin, vectorSumaDiagonalSec,sumaPrin, sumaSec Como Entero
	Definir validar Como Logico
	
	Hacer
		Escribir "Ingrese el número la dimensión de su matriz, teniendo en cuenta que el máximo orden es de 10"
		leer n
		m = n
	Mientras Que n >= 10 o n < 0
	
//	Escribir "ingrese el número de columnas de su matriz"
//	leer m
	
	Dimension matrizA[n,m]
	Dimension vectorSumaFilas[n] , vectorSumaColumnas[m], vectorSumaDiagonalPrin[m]
	
	LlenarMatriz(n,m,matrizA)
	MostrarMatriz(n,m, matrizA)
	
	SumaFilas(n,m,matrizA, vectorSumaFilas)
	SumaColumnas(n,m,matrizA, vectorSumaColumnas)
	SumaDiagonalPrincipal(n,m,matrizA, sumaPrin)
	SumaDiagonalPrincipal(n,m,matrizA, sumaSec)
	Validar = Validacion(n,m,vectorSumaFilas, vectorSumaColumnas, sumaPrin, sumaSec)
	
	PruebaDeEscritorio(n,m, vectorSumaFilas, vectorSumaColumnas, sumaPrin, sumaSec)
	
	
	Si validar Entonces
		Escribir ""
		Escribir " La matriz es mágica y la suma de todos sus lados es " sumaPrin
	SiNo
		Escribir ""
		Escribir " La matriz no es mágica "
	FinSi

	
	
FinAlgoritmo



SubProceso LlenarMatriz(n,m,matriz)
	Definir i,j, numUsuario Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Para j=0 hasta m-1 Hacer
			Hacer
				Escribir " Ingrese un número entre 1 y 9 para ubicar en la posición (" i , " , " , j , ")"
				leer numUsuario
			Mientras Que numUsuario < 1 O numUsuario > 9
				
				matriz[i,j] = numUsuario
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


SubProceso SumaFilas(n,m, matriz, vector)
	Definir suma,i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Suma = 0
		Para j=0 hasta m-1 Hacer
			suma = suma + matriz[i,j]
		FinPara
		vector[i] = suma 
	FinPara

FinSubProceso



SubProceso SumaColumnas(n,m, matriz, vector)
	Definir suma,i,j Como Entero
	
	Para j = 0 Hasta m-1 Hacer
		Suma = 0
		Para i=0 hasta n-1 Hacer
			suma = suma + matriz[i,j]
		FinPara
		vector[j] = suma 
	FinPara
	
FinSubProceso

Subproceso SumaDiagonalPrincipal(n, m, matriz,suma Por Referencia)
	Definir i,j Como Entero
	suma = 0
	j= 0
	
	Para i = 0 Hasta n-1 Hacer
		suma = suma + matriz[i,j]
		j = j + 1
	FinPara
	
FinSubProceso
//	Para i = 0 Hasta n-1 Hacer
//		Para j=0 hasta m-1 Hacer
//			Si i = j Entonces
//				suma = suma + matriz[i,j]
//			FinSi
//		FinPara
	//	FinPara

Subproceso SumaDiagonalSecundaria(n, m, matriz,suma Por Referencia)
	Definir i,j Como Entero
	suma = 0
	j = n-1
	
	Para i = 0 Hasta n-1 Hacer
		suma = suma + matriz[i,j]
		j = j - 1
	FinPara
	
FinSubProceso


Funcion  retorno <- Validacion(n,m,vectorSumaFilas, vectorSumaColumnas, sumaPrin, sumaSec)
	
	Definir retorno Como Logico
	Definir vectorMuestra,i Como Entero
	
	retorno = Verdadero
	i = 1
	vectorMuestra = vectorSumaFilas[0]
	vectorMuestra = vectorSumaColumnas(0)
	
	Mientras (retorno) Y  (i < n)
		Si (vectorSumaFilas[i] <> vectorMuestra) 
			retorno = Falso
		FinSi
		vectorMuestra = vectorSumaFilas[i]
		i = i+1
	FinMientras
	
	Para i = 1 hasta m -1 Hacer
		Si (vectorSumaColumnas[i] <> vectorMuestra) 
			retorno = Falso
			i = m
		FinSi
	FinPara
	
	Si (vectorSumaFilas[0] <> vectorSumaColumnas[0]) o (vectorSumaFilas[0] <> sumaPrin) o (vectorSumaFilas[0] <> sumaSec)  Entonces
		retorno = Falso
	FinSi
	
FinFuncion

SubProceso PruebaDeEscritorio (n,m, vectorSumaFilas, vectorSumaColumnas, sumaPrin, sumaSec)
	Definir i Como Entero
	
	Escribir sin saltar " Vector Filas: "
	Para i=0 hasta n-1
		Escribir sin saltar "[ " vectorSumaFilas[i] " ] "
	FinPara
	Escribir ""
	
	Escribir sin saltar " Vector Columnas: "
	Para i=0 hasta n-1
		Escribir sin saltar "[ " vectorSumaColumnas[i] " ] "
	FinPara
	Escribir ""
	
	Escribir sin saltar " Diagonal principal: "
	Escribir sin saltar "[ " sumaPrin " ] "
	Escribir ""
	
	Escribir sin saltar " Diagonal secundaria: "
	Escribir sin saltar "[ " sumaSec " ] "
	Escribir ""
	
FinSubProceso





