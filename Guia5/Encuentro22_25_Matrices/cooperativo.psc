//subprograma acomodarPalabra:
//	Se le debe indicar sólo la matriz en donde se acomodarán las palabras.
//	Ahora debemos crear una lógica que nos permita mover las palabras de las filas. Recordar que
//	podemos llamar a buscarR para saber cuántos espacios hay que mover las palabras.
//	Una vez que las palabras se muevan hay que llenar los espacios con asteriscos nuevamente: es
//		decir, si la palabra se mueve dos posiciones a la derecha hay que agregar dos asteriscos a la
//			izquierda de la fila.

Algoritmo sin_titulo
	Definir Matriz, palabra Como Caracter
	Definir n,m,i  Como Entero
	
	n = 9 
	m = 12
	Dimension matriz[n,m]
	
	
	AgregarPalabra(0,n,m,matriz,"VECTOR")
	AgregarPalabra(1,n,m,matriz,"MATRIX")
	AgregarPalabra(2,n,m,matriz,"PROGRAMA")
	AgregarPalabra(3,n,m,matriz,"SUBPROGRAMA")
	AgregarPalabra(4,n,m,matriz,"SUBPROCESO")
	AgregarPalabra(5,n,m,matriz,"VARIABLE")
	AgregarPalabra(6,n,m,matriz,"ENTERO")
	AgregarPalabra(7,n,m,matriz,"PARA")
	AgregarPalabra(8,n,m,matriz,"MIENTRAS")
		
	MostrarMatriz(n,m,matriz)
FinAlgoritmo

SubProceso AgregarPalabra(i,n,m,matriz, frase )
	Definir j,k Como Entero
	k = 0
	
	Para j = 0 Hasta m-1 Hacer
		matriz[i,j] = subcadena(frase, k, k)
		k = k +1
	FinPara
	
FinSubProceso

Subproceso MostrarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		
		Para j=0 hasta m-1 Hacer
			Escribir sin saltar "|" matriz[i,j] "|"
		FinPara
		Escribir "]"
	FinPara
	
FinSubProceso

Subproceso  buscarR(n,m , matriz,r)
	Definir k, posicionFila, posicionColumna Como Entero
	
	k = 0
	letra = subcadena(frase, k, k)
	
	Para i = 0 hasta n-1
		Para j=0 hasta m-1
			si letra == "R"
				posicionFila[i] = i
				posicionColumna[j] = j
				j = m
			FinSi
		FinPara
	FinPara
	
FinSubProceso

	