///Guia 4 - Encuentro 15 - Ejercicio 8 

//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha
//representada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede
//asumir que dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para
//los valores dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo Ejercicio15_8_FechaAnterior
	
	Definir dia,mes, anio Como Entero
	
	Escribir "Por favor ingrese un día del año"
	leer dia
	
	Escribir "Por favor ingrese un mes del año"
	leer mes
	
	Escribir "Por favor ingrese un año de año"
	leer anio
	
	FechaAnterior(dia, mes, anio)
	Escribir "La fecha anterior a la fecha ingresada es: " dia "," mes "," anio
	
FinAlgoritmo

SubProceso FechaAnterior (dia Por Referencia, mes Por Referencia, anio Por Referencia)
	
	Si ((anio MOD 4 == 0) Y (anio MOD 100 <> 0) ) O ((anio MOD 100 == 0) Y (anio MOD 400 == 0) ) Entonces
		
		Si mes == 3 Y dia == 1 Entonces
			dia = 29 
			mes = mes - 1
			
		SiNo
			Si dia == 1 Entonces
				Segun mes Hacer
					2,4,6,8,9: 
						dia = 31
						mes = mes - 1
					3:
						dia=28
						mes = mes - 1
						
					7,10,11,12:
						dia = 30
						mes = mes - 1
				FinSegun
				
			SiNo 
				Si dia > 1  Entonces
					dia = dia - 1
				FinSi
			FinSi
			
			
		FinSi
		
	FinSi
			
	Si (anio MOD 4 <> 0) Entonces
		Si dia == 1 Entonces
				Segun mes Hacer
					2,4,6,8,9: 
						dia = 31
						mes = mes - 1
					3:
						dia=28
						mes = mes - 1
						
					7,10,11,12:
						dia = 30
						mes = mes - 1
				FinSegun
				
			SiNo 
				Si dia > 1  Entonces
				dia = dia - 1
			FinSi
		FinSi
	FinSi
	
	Si mes == 1 Y dia == 1 Entonces
		anio = anio - 1
		mes = 12
		dia = 31
	FinSi
	
	//Enero tiene 31 días, febrero 29 días, marzo 31, abril 30, mayo 31, junio 30, julio 31, agosto 31, septiembre 30, octubre 31, noviembre 30 y diciembre 31 días.
FinSubProceso

