//Escribir un programa que calcule cu�ntos d�gitos tiene un n�mero entero positivo sin
//convertirlo a cadena (pista: se puede hacer dividiendo varias veces entre 10). Nota:
//investigar la funci�n trunc().

Algoritmo ejercicio7_8_contadorDigitos
	
	Definir numUsuario, contadorDigitos Como Entero
	
	Escribir  "Ingrese un numero entero positivo"
	leer numUsuario
	
	contadorDigitos = 0
	
	mientras numUsuario >= 1 Hacer
		contadorDigitos = contadorDigitos + 1
		numUsuario = trunc(numUsuario/10)
	FinMientras
	
	Escribir "El n�mero de digitos es: " contadorDigitos
	
FinAlgoritmo
