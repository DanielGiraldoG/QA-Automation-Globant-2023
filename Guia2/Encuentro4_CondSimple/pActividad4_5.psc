Algoritmo p
	
	Escribir "Ingresa un dia de la semana"
	Definir dia Como Caracter
	
	Leer  dia
	
	Si dia <> "Sabado" y dia <> "Domingo" Entonces
		Escribir dia, " es un dìa laboral"
	Fin Si
	Si dia == "Sabado" o dia == "Domingo" Entonces
		Escribir dia, " es un dìa no laboral"
	FinSi
FinAlgoritmo