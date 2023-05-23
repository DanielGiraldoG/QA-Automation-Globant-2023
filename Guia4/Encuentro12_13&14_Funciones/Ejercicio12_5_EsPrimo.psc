Algoritmo Ejercicio12_5_EsPrimo
	Definir num Como Entero
	
	leer num
	
	Escribir Primo(num)
FinAlgoritmo

Funcion esPrimo <- Primo(num1)
	Definir esPrimo Como Logico
	Definir contador Como Entero
	contador = 2
	
	Hacer
		Esprimo = num1 MOD contador <>0
		contador = contador +1
	Mientras Que esPrimo == Verdadero y contador <> num1
	
FinFuncion
	