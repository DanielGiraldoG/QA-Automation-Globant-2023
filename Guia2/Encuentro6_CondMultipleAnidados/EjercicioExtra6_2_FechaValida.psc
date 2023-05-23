//2. Leer tres números que denoten una fecha (día, mes, año) y comprobar que sea una
//fecha válida. Si la fecha no es válida escribir un mensaje de error por pantalla. Si la fecha
//es válida se debe imprimir la fecha cambiando el número que representa el mes por su
//nombre. Por ejemplo: si se introduce 1 2 2006, se deberá imprimir "1 de febrero de
//2006".

Algoritmo EjercicioExtra6_2_FechaValida
	
	Definir diaUsuario, mesUsuario, yearUsuario Como entero
	Definir mes Como Caracter
	
	Escribir "Ingrese un dia del año: (DD) "
	leer diaUsuario
	

	Si diaUsuario < 31 Y diaUsuario > 0 Entonces
		
		Escribir "Ingrese un mes del año: (MM) "
		leer mesUsuario
		
		Si mesUsuario > 0 Y mesUsuario <12 Entonces
			Segun mesUsuario Hacer
				01,1: 
					mes = "Enero"
				02, 2: 
					mes = "Febrero"
				03,3: 
					mes = "Marzo"
				04,4: 
					mes = "Abril"
				05,5: 
					mes = "Mayo"
				06,6: 
					mes = "Junio"
				07,7: 
					mes = "Julio"
				08,8: 
					mes = "Agosto"
				09,9: 
					mes = "Septiembre"
				10: 
					mes = "Octubre"
				11: 
					mes = "Noviembre"
				12: 
					mes = "Diciembre"
			FinSegun
		
			Escribir "Ingrese un año: (YYYY) "
			leer yearUsuario
		
			Si yearUsuario > 0 Y yearUsuario < 2999 Entonces
				Escribir diaUsuario " de " mes " de " yearUsuario
			SiNo
				Escribir "No es un año vàlido"
				
			FinSi
		Sino 
			Escribir  " No es un mes valido"
		FinSi
	Sino 
		Escribir " No es un dia valido"
	FinSi
	
	
FinAlgoritmo
