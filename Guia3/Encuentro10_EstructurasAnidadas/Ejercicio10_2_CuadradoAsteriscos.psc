//Ejericicio 2. Realizar un programa que lea un número entero (tamaño del lado) y a partir de él cree
//un cuadrado de asteriscos de ese tamaño. Los asteriscos sólo se verán en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el número 4 se debe mostrar:
//* * * *
//*     *
//*     *
//* * * *

Algoritmo Ejercicio10_2_CuadradoAsteriscos
	
	Definir ladoCuadrado,i,j Como Entero
	
	Escribir "Ingrese el tamaño del ladoCuadrado del cuadrado"
	leer ladoCuadrado
	
	//si ladoCuadrado = 0 Entonces
		//Escribir ""
		
	
	//SiNo
		
		para i = 1 hasta ladoCuadrado con Paso 1 Hacer
			para j = 1 hasta ladoCuadrado con Paso 1 Hacer
				
				si i = 1 o i = ladoCuadrado  o j = 1 o j = ladoCuadrado Entonces
					Escribir Sin Saltar "* "
				SiNo
					escribir Sin Saltar"  "
				FinSi
				
			FinPara
			
			Escribir ""
		FinPara
		
	//FinSi
	
FinAlgoritmo
