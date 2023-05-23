//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor
//m�s grande del vector.

Algoritmo Ej18_5_numMayor
	Definir n, vectorX Como Entero
	
	Escribir "Ingrese la dimension del vector"
	leer n
		
	Dimension vectorX(n)
	
	vector(vectorX,n)
	
FinAlgoritmo


SubProceso vector(vectorX Por Referencia,n)
	Definir i, numMayor Como Entero
	numMayor = 0
	
	Para i = 0 Hasta n-1 Hacer
		Escribir "Ingrese un numero para la posicion " i
		leer vectorX[i] 
				
		Si vectorX[i]  > numMayor Entonces
			numMayor = vectorX[i]
			escribir numMayor
		FinSi
		
	FinPara
	
	Escribir " El numero mayor es: " numMayor
FinSubProceso