Algoritmo ejemploClave
	
	Definir clave Como Caracter
	Definir contador como entero
	
	contador = 0
	
	Hacer
		Escribir "Ingrese Clave: "
		Leer clave
		clave = Minusculas(clave)
		contador = contador +1
		
		si contador = 3
			Escribir "Haz fallado"
		FinSi
		
		si clave == "eureka"
			Escribir "Haz acertado"
		FinSi
		
	Mientras Que clave <> "eureka" Y contador < 3
	
FinAlgoritmo
