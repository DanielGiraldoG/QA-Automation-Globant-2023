Algoritmo p
	
	Escribir "Ingresa un dia de la semana"
	Definir dia Como Caracter
	
	Leer  dia
	
	Si dia <> "Sabado" y dia <> "Domingo" Entonces
		Escribir dia, " es un d�a laboral"
	Fin Si
	Si dia == "Sabado" o dia == "Domingo" Entonces
		Escribir dia, " es un d�a no laboral"
	FinSi
FinAlgoritmo