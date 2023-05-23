//Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
//componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
//	deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
//de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
//	resultados.

Algoritmo EjCoop_contadorDigitos
	
	Definir numUsuario, contadorDigitos Como entero
	
	Escribir  "Ingrese un numero entero"
	leer numUsuario
	
	contadorDigitos = 0
	
//	si numUsuario = 0 Entonces
//		contadorDigitos = 1
//	FinSi
	
	mientras numUsuario <> 0 Hacer
		contadorDigitos = contadorDigitos + 1
		numUsuario = trunc(numUsuario/10)
	FinMientras
	
	Escribir "El n�mero de digitos es: " contadorDigitos
	
FinAlgoritmo
