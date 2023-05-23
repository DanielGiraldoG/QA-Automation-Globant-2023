Algoritmo Ej18_7_VectoresIguales
	
	Definir vectorA, VectorB, n Como Entero
	
	
	Escribir  "Ingrese la dimensión del vector"
	leer n
	
	Dimension vectorA(n), vectorB(n)
	
	llenarVector(n, vectorA)
	llenarVector(n, vectorB)
	
	Escribir "Es " VectoresIguales(n, vectorA, vectorB) " que los vectores son iguales"
	
	
FinAlgoritmo


SubProceso  llenarVector(n, vector Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		vector[i] = Aleatorio(-100,100)
		//vector[i] = 5
	FinPara
FinSubProceso

Funcion validacion <- VectoresIguales(n,vectorA, VectorB)
	Definir i Como Entero
	Definir validacion Como Logico
	
	Validacion = Verdadero
	
	Para i = 0 hasta n-1 Hacer
		Si vectorA(i) <> vectorB(i) Entonces
			validacion = Falso
		FinSi
	FinPara
	
FinFuncion
	