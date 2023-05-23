Funcion retorno <- Jornal ( paramTurno, paramEsFestivo, paraHorasTrabajadas )
	
	Definir retorno Como Real
	
	Si paramTurno == "1" Y paramEsFestivo == Falso Entonces
		retorno = paraHorasTrabajadas * 90
	Sino 
		si paramTurno == "2" Y paramEsFestivo == Falso Entonces
			retorno = paraHorasTrabajadas * 125
		SiNo
			si paramTurno == "1" Y paramEsFestivo == Verdadero Entonces
				retorno = paraHorasTrabajadas * (90*1.1)
			SiNo
				retorno = paraHorasTrabajadas * (125*1.15)
			FinSi
			
		FinSi
		
	FinSi
	
Fin Funcion

Algoritmo Ejercicio13_9_JornalDiario
	
	Definir nombre,dia, turno, respuestaFestivo Como Caracter
	Definir esFestivo Como Logico
	Definir totalJornal, horasTrabajadas Como Real
	
	Escribir " Favor ingrese su nombre "
	Leer nombre
	
	Escribir "Favor ingrese el dia de la semana que desea calcular"
	leer dia
	
	Escribir " Este día es feriado? :"
	Escribir "1. Si " 
	Escribir "2. No " 
	leer respuestaFestivo
	
	Si respuestaFestivo == "1" Entonces
		esFestivo = Verdadero
	sino 
		esFestivo = Falso
	FinSi
	

	Escribir "Favor indique su turno: "
	Escribir "1: Diurno"
	Escribir "2: Nocturno"
	leer turno
	
	Escribir "Ingrese la cantidad de horas trabajadas"
	leer horasTrabajadas
		
	
	totalJornal = Jornal(turno, esFestivo, horasTrabajadas)
	
	Escribir nombre ", El total del Jornal  para el dia " dia " es: $" totalJornal
	
	
FinAlgoritmo
