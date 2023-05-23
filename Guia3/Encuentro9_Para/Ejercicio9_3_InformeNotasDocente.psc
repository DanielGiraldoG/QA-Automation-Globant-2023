Algoritmo Ejercicio9_3_InformeNotasDocente
	
	Definir notaIntegrador, notaExposicion, notaParcial Como Real
	Definir notaFinal, promedioReprobados, porcentajeIntegrador, mayorNotaExposicicion, notaMayor, sumaReprobados Como Real
	Definir pesoExposicion, pesoIntegrador, pesoParcial  Como Real
	Definir contadorParcialRegular, nEstudiantes,i, contadorReprobados, contadorIntegradorAprobados Como Entero
	
	pesoIntegrador = 0.35
	pesoExposicion = 0.25
	pesoParcial = 0.4
	sumaReprobados = 0
	contadorReprobados = 0
	notaMayor = 0
	contadorParcialRegular = 0
	
	Escribir " Favor ingrese el número de estudiantes "
	leer nEstudiantes
	
	Para i = 1 hasta nEstudiantes Hacer
		
		Escribir " Ingrese nota Integrador estudiante " i
		leer notaIntegrador
		
		Escribir "Ingrese nota Exposicion estudiante " i
		leer notaExposicion
		
		Escribir "Ingrese nota Exposicion estudiante " i 
		leer notaParcial
			
		notaFinal = (notaIntegrador*pesoIntegrador) + (notaExposicion*pesoExposicion) + (notaParcial*pesoParcial)
		
		si notaFinal < 6.5 Entonces
			sumaReprobados = sumaReprobados + notaFinal
			contadorReprobados = contadorReprobados + 1
		FinSi
		
		si notaIntegrador > 7.5 Entonces
			contadorIntegradorAprobados = contadorIntegradorAprobados + 1
		FinSi
		
		Si notaExposicion > notaMayor Entonces
			notaMayor = notaExposicion
		FinSi
		
		Si notaParcial > 4.0 Y notaParcial < 7.5 Entonces
			contadorParcialRegular = contadorParcialRegular + 1
		FinSi
		
		promedioReprobados = sumaReprobados / contadorReprobados
		
	FinPara
	
	Escribir "El promedio es: " , promedioReprobados 
	
	
	Escribir "La mayor nota de las exposiciones es: " , notaMayor
	Escribir "El numero de estudiantes que obtuvieron una nota de parcial entre 4.0 y 7.5 es de: " contadorParcialRegular
	
FinAlgoritmo
