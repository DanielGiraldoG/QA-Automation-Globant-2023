Algoritmo Ejercicio15_5_ConvertirEspaciado
	Definir frase Como Caracter
	
	Leer frase
	
	ConvertirEspaciado(frase)
	
FinAlgoritmo

SubProceso ConvertirEspaciado(pfrase)
	Definir  letra Como Caracter
	Definir i,long Como Entero
	long = Longitud(pfrase)
	
	para i = 0 hasta Long-1 Hacer
		letra = subcadena (pfrase,i,i)
		Escribir Sin Saltar letra " "
	FinPara
FinSubProceso
	