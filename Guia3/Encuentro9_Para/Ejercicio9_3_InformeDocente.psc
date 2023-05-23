//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de sus
//N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
//de sus estudiantes:
//	? Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante
//	reprueba el curso si tiene una nota final inferior a 6.5 - listo
//	? Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5. -listo
//	? La mayor nota obtenida en las exposiciones. - listo
//	? Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
//El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno pedirá
//las 3 notas y calculará todos informes claves que requiere el docente.

Algoritmo Ejercicio9_3_InformeDocente
	
	Definir i, nEstudiantes, contadorReprobados, contadorIntegrador, contadorParcial Como Entero
	Definir notaFinal, notaIntegrador, notaExposicion, notaParcial, notaMayor Como Real
	Definir promedioReprobados, porcentajeIntegrador, sumaReprobados  Como Real
	Escribir "Ingrese el número de estudiantes"
	leer nEstudiantes
	
	
	sumaReprobados =0
	contadorReprobados = 0
	contadorIntegrador = 0
	notaMayor = 0
	contadorParcial = 0
	
	para i=1 Hasta nEstudiantes Hacer
		
		Escribir "Ingrese nota Integrador de estudiante " i
		leer notaIntegrador
		Escribir "Ingrese nota Exposicion de estudiante " i
		leer notaExposicion
		Escribir "Ingrese nota parcial de estudiante " i
		leer notaParcial
		
		notaFInal = (notaIntegrador * 0.35) + (notaExposicion*0.25) + (notaParcial * 0.4)
		
		//	Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5
		
		Si notaFInal < 6.5 Entonces
			sumaReprobados = sumaReprobados + notaFInal
			contadorReprobados = contadorReprobados + 1
		FinSi
		
		//Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
		
		Si notaIntegrador > 7.5 Entonces
			contadorIntegrador = contadorIntegrador + 1
		FinSi
		
		//La mayor nota obtenida en las exposiciones.
		
		Si notaExposicion > notaMayor Entonces
			notaMayor = notaExposicion
		FinSi
		
		//Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
		
		Si notaParcial >= 4.0 Y notaParcial <= 7.5 Entonces
			contadorParcial = contadorParcial + 1
		FinSi
		
	FinPara
	
	promedioReprobados = sumaReprobados / contadorReprobados
	porcentajeIntegrador = (contadorIntegrador/ nEstudiantes) * 100
	
	Escribir "1. Nota promedio final de los estudiantes que reprobaron el curso es de: " promedioReprobados
	Escribir "2. Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es de: " porcentajeIntegrador , "%"
	Escribir "3. La mayor nota obtenida en las exposiciones es: " notaMayor
	Escribir "4. Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 son: " contadorParcial
	

FinAlgoritmo
