Algoritmo EjercicioDesafio
	Definir fila, columna, i, j, r Como Entero 
	Definir matriz, palabra Como Caracter
	fila= 9
	columna = 12
	j=0
	i=0
	palabra= "*"
	Dimension matriz[fila,columna]
	inicializarMatriz(fila,columna,i,j,matriz)
	agregarPalabra(matriz,fila,columna,0,j,"vector")
	agregarPalabra(matriz,fila,columna,1,j,"matrix")
	agregarPalabra(matriz,fila,columna,2,j,"programa")
	agregarPalabra(matriz,fila,columna,3,j,"subprograma")
	agregarPalabra(matriz,fila,columna,4,j,"subproceso")
	agregarPalabra(matriz,fila,columna,5,j,"variable")
	agregarPalabra(matriz,fila,columna,6,j,"entero")
	agregarPalabra(matriz,fila,columna,7,j,"para")
	agregarPalabra(matriz,fila,columna,8,j,"mientras")
	acomodarPalabra(matriz,i,j,fila,columna)
	imprimirMatriz(fila,matriz,columna,i,j)

	
	
FinAlgoritmo

SubProceso inicializarMatriz(fila,columna,i,j,matriz)
	para i = 0 hasta fila -1 Hacer
		para j = 0 hasta columna - 1 Hacer
			
			matriz[i,j] = "*"
			
		FinPara
	FinPara
	
FinSubProceso


SubProceso  agregarPalabra(matriz,fila,columna,i,j,palabra)
	
	Definir contador Como Entero
	contador = 0 
			para j=0 hasta longitud(palabra)-1 Hacer
				
				matriz(i,j)=Subcadena(palabra,j,j)
				
			FinPara
	
		
FinSubProceso

SubProceso acomodarPalabra(matriz,i,j,fila,columna)
	Definir mover Como Entero
	Para i=0 hasta 8
		mover=5-buscarR(matriz,i)
		si mover <> 0 Entonces
		Para j=11 hasta 0
			Si j>=mover Entonces
				matriz[i,j]=matriz[i,j-mover]
				sino matriz[i,j] = "*"
			FinSi
		FinPara
	FinSi
	
	FinPara
	
Fin Subproceso

Funcion retorno=buscarR(matriz,i)
	definir retorno, j Como Entero
	j= -1
	hacer 
		j = j + 1
	Mientras Que matriz[i,j] <> "r" y j < 12
	retorno = j 
FinFuncion

SubProceso imprimirMatriz(fila,matriz,columna,i,j)
	para i = 0 hasta fila -1 Hacer
		para j = 0 hasta columna - 1 Hacer
			
			escribir sin saltar " " "[" matriz[i,j] "]" " " 
			
		FinPara
		escribir "" 
	FinPara
	
FinSubProceso