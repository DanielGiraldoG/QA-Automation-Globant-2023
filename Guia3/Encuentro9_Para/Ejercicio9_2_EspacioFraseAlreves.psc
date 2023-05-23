Algoritmo Ejercicio9_2_EspacioFraseAlreves
	
	Definir frase como cadena
	Definir i Como Entero
	
	Escribir "Ingrese una frase"
	leer frase
	
	
	Para i = Longitud(frase)-1 hasta 0 Con Paso -1 Hacer
		
		Escribir sin saltar subcadena(frase,i,i) + " "
		
	FinPara
	
	
FinAlgoritmo