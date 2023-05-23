//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//	deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
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
	
	Escribir "El número de digitos es: " contadorDigitos
	
FinAlgoritmo
