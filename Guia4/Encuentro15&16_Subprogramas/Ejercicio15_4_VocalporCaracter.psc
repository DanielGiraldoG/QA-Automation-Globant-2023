/// Guia 4 - Encuentro 15 - Ejercicio4
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
//	terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
//	cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
//	(incluyendo a las vocales acentuadas) se mantienen sin cambios.
//	
//	a e i o u
//	@ # $ % *
//	
//	Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
//	correspondiente. Utilice la estructura "según" para la transformación.
//	Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
//	La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.


Algoritmo Ejercicio15_4_VocalporCaracter
	
	Definir frase como Cadena
	leer frase
	VocalporCaracter(frase)
	
FinAlgoritmo

SubProceso VocalporCaracter(pfrase)
	
	Definir letra Como Caracter
	Definir i Como Entero
	letra = subcadena (pfrase, 0,0)
	
	mientras letra <> "." Hacer
		para i = 0 Hasta (Longitud(pfrase)-1) con Paso 1 entonces
			letra = subcadena (pfrase,i,i)
			letra = Minusculas(letra)
			
			Segun letra hacer
				"a" : 
					letra = "@"
				"e" : 
					letra = "#"
				"i" : 
					letra = "$"
				"o" : 
					letra = "%"
				"u" : 
					letra = "*"
			FinSegun
			Escribir Sin Saltar letra
			
		FinPara
	FinMientras
FinSubProceso



	