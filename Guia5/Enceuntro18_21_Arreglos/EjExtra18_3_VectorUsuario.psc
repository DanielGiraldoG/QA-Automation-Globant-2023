////// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 3
//3. Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y

//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector se
//debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la función
//	Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su longitud.

Algoritmo EjExtra18_3_VectorUsuario
	
	Definir n, vectorB como entero
	Definir vectorA como cadena
	
	Escribir "ingrese el numero de elementos del vector"
	Leer n
	
	Dimension vectorA[n], VectorB[n]
	llenarVector(n, vectorA, vectorB)
	MostrarVector(n, vectorA, vectorB)
	
FinAlgoritmo

SubProceso  LlenarVector(n, vector Por Referencia, vectorlongitud Por Referencia)
	Definir i Como Entero
	Definir nombre como cadena
	
	Para i <- 0 hasta n-1 Hacer
		Escribir "Ingrese un nombre para almacenar en la posición " i " del arreglo"
		leer nombre
		
		vector(i) = nombre 
		vectorlongitud[i] = longitud(nombre) 
	FinPara
FinSubProceso

SubProceso MostrarVector(n, vector Por Referencia, vectorlongitud Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		Escribir vector(i) " = Tiene " vectorlongitud(i) " caracteres"
	FinPara
FinSubProceso
	