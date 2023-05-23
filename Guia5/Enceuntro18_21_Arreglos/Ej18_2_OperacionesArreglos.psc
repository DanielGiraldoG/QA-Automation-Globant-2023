////// Guía 5 - Encuentro 18 - Ejercicio 1
//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al
//arreglo.
Algoritmo Ej18_2_OperacionesArreglos
	
	Definir vectorUsuario,i, suma, resta, multiplicacion Como real
	

	Dimension vectorUsuario(10)
	
	suma = 0
	multiplicacion = 1
	
	
	para i=0 Hasta 9 Hacer
		Escribir "Ingrese el dato número " i+1 
		leer vectorUsuario(i)
		
		suma = suma + vectorUsuario(i)
		multiplicacion = multiplicacion * vectorUsuario(i)
		
		si i = 0 Entonces
			resta = vectorUsuario(0)
		SiNo
			resta = resta - vectorUsuario(i) 
		FinSi
		
	FinPara
	
	
	
	Escribir " La suma de todos los numeros ingresados es de: " suma
	Escribir " La resta de todos los numeros ingresados es de: " resta
	Escribir " La multiplicacion de todos los numeros ingresados es de: " multiplicacion
FinAlgoritmo
