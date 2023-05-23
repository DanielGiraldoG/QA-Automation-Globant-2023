Funcion retorno <-  CantidadLetras( param1, param2 )
	
	Definir retorno, longCadena, contador,i Como Entero
	Definir letraComparar Como Caracter
	
	longCadena = longitud(param1)
	contador = 0
	
	Para i = 0 hasta longCadena-1 Hacer
		letraComparar = subcadena(param1,i,i)
		Si param2 == letraComparar Entonces
			contador = contador + 1
			
		FinSi
		
	FinPara
	
	retorno = contador
Fin Funcion

//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso de la
//	función Subcadena().

Algoritmo Ejercicio4_BuscarLetra
	
	Definir frase, letra Como Caracter
	Escribir "Escribe una frase"
	Leer frase
	Escribir "Escribe la letra que deseas buscar"
	leer letra
	
	
	Escribir "La letra " letra " se repite " CantidadLetras(frase, letra) " en la frase" frase
	
FinAlgoritmo
