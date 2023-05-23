/// Guia 5- encuentro 18 a 21 - Ejercicio 7
//Crear un subproceso que rellene dos arreglos de tamaño n, con números aleatorios. Después,
//hacer una función que reciba los dos arreglos y diga si todos sus valores son iguales o no. La
//función debe devolver el resultado de está validación, para mostrar el mensaje en el
//algoritmo. Nota: recordar el uso de las variables de tipo lógico.

Algoritmo sin_titulo
	
	Definir n, vectorA,vectorB Como Entero
		
	Escribir "Ingrese la dimensión del vector"
	leer n
	
	Dimension vectorA(n), vectorB(n)
	
	LlenarVector(n, vectorA)
	LlenarVector(n, vectorB)
	
	Escribir "Es " VectoresIguales(n, vectorA, vectorB) " que los vectores son iguales"
	
FinAlgoritmo

SubProceso LlenarVector(n, vectorA Por Referencia)
	
	Definir i Como Entero
	
	Para i = 0 hasta n-1 Hacer
		vectorA(i) = Aleatorio(-1,1)
	FinPara
	
FinSubProceso

Funcion validacion <- VectoresIguales(n , vectorA, vectorB) 
	
	Definir i Como Entero
	Definir validacion Como Logico
	
	validacion = Verdadero
	i=0
		
	Mientras validacion Y i < n
		Si vectorA(i) <> vectorB(i)
			validacion = Falso
		FinSi
		i = i+1
	FinMientras
	
FinFuncion
	