//Hacer un algoritmo para calcular la media de los n�meros pares e impares, s�lo se
//ingresar� diez n�meros.

Algoritmo Ejercicio8_5_mediaParesImpares
	
	Definir numUsuario, mediaPares,mediaImpares, sumaPares, sumaImpares Como real
	Definir contador, contadorPares, contadorImpares Como Entero
	
	contador = 0
	contadorImpares = 0
	contadorPares = 0 
	sumaPares = 0
	sumaImpares = 0
	
	
	Repetir
		Escribir " Ingrese un numero: "
		leer numUsuario
		contador = contador + 1
		
		Si numUsuario MOD 2 == 0 Entonces
			sumaPares = sumaPares + numUsuario
			contadorPares = contadorPares + 1
		SiNo
			sumaImpares = sumaImpares + numUsuario 
			contadorImpares = contadorImpares + 1
		FinSi
		
		
	Mientras Que contador < 10
	
	mediaPares = sumaPares / contadorPares
	mediaImpares = sumaImpares / contadorImpares
	
	
	Escribir " La media de los n�meros pares es: ", mediaPares
	Escribir " La media de los n�meros impares es: ", mediaImpares

	
FinAlgoritmo
