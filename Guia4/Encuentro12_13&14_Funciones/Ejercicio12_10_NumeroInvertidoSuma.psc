/// Guia 4 - Encuentro 12 a 14 - Ejercicio 10 
//Realizar una funci�n que calcule la suma de los d�gitos de un n�mero.
//Ejemplo: 25 = 2 + 5 = 7
//Nota: Para obtener el �ltimo n�mero de un digito de 2 cifras o m�s debemos pensar en el
//resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.

Funcion numInvertido <- SumaInvertida ( num )
	
	Definir numInvertido Como Real
	Definir cadenaDigitos Como Caracter
		
	numInvertido = 0
	cadenaDigitos = ""
	//numOriginal = num
	
	Escribir sin saltar num , " = " 
	
	Mientras num <> 0 Hacer
		
		numInvertido = (num mod 10) + numInvertido
		
		si num > 10 Entonces
			//cadenaDigitos =  ConvertirATexto(num mod 10) + "+" +  cadenaDigitos
			Escribir Sin Saltar ConvertirATexto(num mod 10) + "+"
			num = trunc (num/10)
			
		Sino 
			//cadenaDigitos = cadenaDigitos + "+" + ConvertirATexto(num mod 10) + "="
			Escribir Sin Saltar ConvertirATexto(num mod 10) + " = "
			num = trunc (num/10)
		FinSi
		
	FinMientras	
Fin Funcion

Algoritmo Ejercicio12_10_NumeroInvertidoSuma
	Definir num Como Real
	
	leer num
	
	Escribir Sin Saltar SumaInvertida(num)
	
	
FinAlgoritmo
