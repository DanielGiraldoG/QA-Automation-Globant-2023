Algoritmo ActividadCooperativa1
	
	Definir num , unidad, decena, centena Como Entero
	
	Escribir  "Ingrese un n�mero de tres cifras: "
	Leer num
	
	centena = trunc (num / 100)
	decena = trunc ( (num%100) / 10 )
	unidad = trunc ( (num%100) %10)
	
	Escribir "CENTENA: " , centena
	Escribir "DECENA:  " , decena
	Escribir "UNIDAD:  " , unidad
	
FinAlgoritmo
