//Solicitar al usuario que ingrese un valor entre 1 y 7. EL programa debe mostrar por
//pantalla un mensaje que indique a qué día de la semana corresponde. Considere que el
//número 1 corresponde al día "Lunes", y así sucesivamente.

Algoritmo EjercicioExtra6_1_DiaSemana
	Definir diaSemana Como Caracter
	
	Escribir " Escribe numero entre 1 y 7 para saber que dia de la semana corresponde"
	leer diaSemana
	
	Segun diaSemana Hacer
		
		"1": 
			Escribir "Lunes"
		"2":
			Escribir "Martes"
		"3":
			Escribir "Miercoles"
		"4":
			Escribir "Jueves"
		"5":
			Escribir "Viernes"
		"6":
			Escribir "Sabado"
		"7":
			Escribir "Domingo"
		De Otro Modo:
			Escribir  " Ese dia de la semana no existe, favor ingrese un valor entre 1 y 7 "
			
		
	FinSegun
	
	
	
FinAlgoritmo


