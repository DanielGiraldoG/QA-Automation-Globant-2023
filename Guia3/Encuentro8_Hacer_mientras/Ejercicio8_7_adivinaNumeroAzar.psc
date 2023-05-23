Algoritmo Ejercicio8_7_adivinaNumeroAzar
	
	Definir numUsuario, numAzar Como Entero
	
	numAzar <- aleatorio(1,10)
	
	Repetir
		Escribir "Por favor ingrese un número entre 1 y 10"
		leer numUsuario
		
		si numUsuario < numAzar Entonces
			Escribir "Ingresa un número más grande"
		Sino 
			si numUsuario > numAzar entonces
				Escribir "Ingresa un numero más pequeño"
			FinSi
		FinSi
		
		
	Mientras Que numUsuario <>  numAzar
	
	Escribir "Haz adivinado el número"
	
	
	
FinAlgoritmo
