//La función factorial se aplica a números enteros positivos. El factorial de un número
//entero positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
//n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
//Escriba un programa que calcule las factoriales de todos los números enteros desde el 1
//hasta el 5. El programa deberá mostrar la siguiente salida:
//	!1 = 1
//	!2 = 1*2 = 2
//	...
//	!5 = 1*2*3*4*5 = 120

Algoritmo Ejercicio10_4_funcionFactorial
	Definir factorial,i,j,N Como Real
	Definir cadenaFactorial Como Caracter
	
	Escribir "Ingrese el número  que desea calcular el factorial"
	leer N
	
	Para  i = 1 hasta N Con Paso 1 Hacer
		
		cadenaFactorial = ""
		factorial = 1
		
		para j=1 hasta i Hacer
		
			factorial = factorial * j
		
			si j<i Entonces
			cadenaFactorial = cadenaFactorial + ConvertirATexto(j) + "*"
			SiNo
			cadenaFactorial = cadenaFactorial + ConvertirATexto(j) 
			FinSi
	
		FinPara
		Escribir "!" i " = " cadenaFactorial " = " factorial
		//Escribir "!" i " = " factorial
		
	FinPara
	
	
FinAlgoritmo
