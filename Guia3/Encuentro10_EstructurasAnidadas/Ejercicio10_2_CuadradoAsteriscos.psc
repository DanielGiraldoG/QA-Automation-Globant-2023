//Ejericicio 2. Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
//* * * *
//*     *
//*     *
//* * * *

Algoritmo Ejercicio10_2_CuadradoAsteriscos
	
	Definir ladoCuadrado,i,j Como Entero
	
	Escribir "Ingrese el tama�o del ladoCuadrado del cuadrado"
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
