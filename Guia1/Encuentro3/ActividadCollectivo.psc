Algoritmo sin_titulo
	Definir num, centenas, decenas, unidad Como Entero
	
	Escribir "Ingrese un numero de tres cifras: "
	leer num
	
	centenas = trunc (num/100)
	decenas = trunc((num %100)/10)
	unidad = (num %10)
	
	Imprimir  "Centena = " , centenas
	Imprimir  "Decena =  ", decenas
	Imprimir  "Unidad =  " , unidad
	
FinAlgoritmo
