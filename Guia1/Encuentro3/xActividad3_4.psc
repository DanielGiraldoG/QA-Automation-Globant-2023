Algoritmo xActividad3_4
	
	Definir totalSegundos , horas, minutos Como Real
	
	Escribir "Ingrese el número total de segundos: "
	leer totalSegundos
	
	horas = totalSegundos * (1/60 ) * (1/60)
	minutos = totalSegundos / 60
	
	
	Escribir " El número total de horas es: " , horas , " h"
	Escribir " El número total de minutos es: " , minutos, " min"
	Escribir " El número total de segundos es: " , totalSegundos " seg"

	
FinAlgoritmo
