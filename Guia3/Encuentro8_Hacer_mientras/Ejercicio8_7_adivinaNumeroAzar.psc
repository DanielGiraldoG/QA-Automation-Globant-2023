Algoritmo Ejercicio8_7_adivinaNumeroAzar
	
	Definir numUsuario, numAzar Como Entero
	
	numAzar <- aleatorio(1,10)
	
	Repetir
		Escribir "Por favor ingrese un n�mero entre 1 y 10"
		leer numUsuario
		
		si numUsuario < numAzar Entonces
			Escribir "Ingresa un n�mero m�s grande"
		Sino 
			si numUsuario > numAzar entonces
				Escribir "Ingresa un numero m�s peque�o"
			FinSi
		FinSi
		
		
	Mientras Que numUsuario <>  numAzar
	
	Escribir "Haz adivinado el n�mero"
	
	
	
FinAlgoritmo
