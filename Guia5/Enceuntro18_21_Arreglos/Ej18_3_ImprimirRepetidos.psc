///Gu�a 5 - Encuentro 18 - Ejercicio 3
//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se
//encuentra el valor. En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo Ej18_3_ImprimirRepetidos
	
	Definir vectorUsuario,dimensionVector,i, valorBuscar, valorPosicion, contador Como Entero
	
	Escribir "Ingrese la dimensi�n del vector"
	leer dimensionVector
	
	Dimension vectorUsuario(dimensionVector)
	
	
	para i=0 Hasta dimensionVector-1 Hacer
		Escribir "Ingrese el dato n�mero a guardar en posici�n " i 
		leer vectorUsuario(i)
	FinPara
	
	Escribir "Ingrese  el valor que desea buscar"
	leer valorBuscar 
	
	contador = 0
	
	para i = 0 Hasta dimensionVector-1 Hacer
		
		Si vectorUsuario(i) == valorBuscar Entonces
			contador = contador + 1
			Si contador = 1 Entonces
				Escribir sin saltar "El n�mero " valorBuscar " se encuentra en la posici�n: " i  " "
			SiNo
				Escribir sin saltar " , " i " "
			FinSi
		FinSi
	FinPara
	
	Si contador == 0 Entonces
		Escribir "El valor guardado no est� dentro del arreglo "
	FinSi
	
FinAlgoritmo
