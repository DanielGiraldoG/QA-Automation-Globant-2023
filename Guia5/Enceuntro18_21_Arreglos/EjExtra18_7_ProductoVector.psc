/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 7
//Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//igual a (V[1]*V[2]*V[3]*V[4])


Algoritmo EjExtra18_7_ProductoVector
	Definir vector, n, producto Como Entero
	
	Escribir " Ingrese la dimensión del vector "
	leer n
	
	Dimension vector(n)
	LlenarVector(n, vector)
	
	ProductoVector(n, vector, producto)
	MostrarVector(n, vector)
	Escribir sin saltar producto
FinAlgoritmo


SubProceso LlenarVector(n, vector Por Referencia)
		Definir i  Como Entero
		
		Para i = 0 Hasta n-1 Hacer
			Escribir "Ingrese un valor para almacena en el espacio " i " del vector"
			leer vector(i) 
		FinPara
		
FinSubProceso

SubProceso  ProductoVector(n, vector, producto Por Referencia)
	Definir i Como Entero
	producto = 1
	
	Para i = 0 Hasta n-1
		producto = producto * vector(i)
	FinPara
	
FinSubProceso

SubProceso MostrarVector(n, vector Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		Si i <> n-1
			Escribir sin saltar " [ " vector(i) " ] " "x"
		SiNo
			Escribir sin saltar " [ " vector(i) " ] " " = "
		FinSi
	FinPara
	
FinSubProceso
	