/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 2
//2. Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.

Algoritmo EjExtra18_2_VectorUsuario
	
	Definir vectorUsuario,n,i, suma Como Entero
	
	Escribir "Ingrese la dimensión del vector"
	leer n
	
	Dimension vectorUsuario(n)
	
	suma = 0
	
	
	para i=0 Hasta n-1 Hacer
		
		Escribir "Ingrese el valor para la posicion " i
		leer vectorUsuario(i)
		
		suma = suma + vectorUsuario(i)
		
		
	FinPara
	
	Escribir " El promedio de los valores ingresados es: " suma / n

FinAlgoritmo
