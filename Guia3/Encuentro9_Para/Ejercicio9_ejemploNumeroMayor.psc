Algoritmo Ejercicio9_ejemploNumeroMayor
	
	Definir numUsuario, numMayor,cantidadNumeros, i Como Entero
	
	Escribir "Cuantos numeros desea ingresar:"
	leer cantidadNumeros
	
	
	numMayor = 0
	
	
	Para i=1 Hasta cantidadNumeros Hacer
		
		Escribir "Ingrese un número"
		leer numUsuario
		
		Si numUsuario > numMayor Entonces
			numMayor = numUsuario
		FinSi
		
	Fin Para
	
	Escribir  "El numero mayor es: ", numMayor
	
FinAlgoritmo
