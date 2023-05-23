/// Guia 4 - Encuentro 12 a 14 - Ejercicio 11
//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//realizar el ejercicio.

Funcion retorno <- DigitosImpares ( pnum )
	
	Definir digito Como Entero
	Definir retorno Como logico
	
	retorno = Falso
	
	
	Si pnum >= 10 Entonces
		digito = pnum mod 10
	SiNo
		digito = pnum
	FinSi
	
	Mientras  digito mod 2 <> 0 Hacer
		retorno = Verdadero
		pnum = trunc(pnum/10)
		digito = pnum mod 10
		
//		Escribir "El nuevo num es: " pnum
//		Escribir "El digito es : " digito
	FinMientras
	
	Si digito mod 2 == 0 Y digito <> 0 Entonces
		retorno = Falso
	FinSi

Fin Funcion

Algoritmo Ejercicio12_11_DigitosImpares
	
	Definir num Como Entero
	
	Escribir "Por favor ingrese un número "
	leer num
	
	Escribir "El " num " tiene todos sus digitos impares: " DigitosImpares(num)
	
FinAlgoritmo
