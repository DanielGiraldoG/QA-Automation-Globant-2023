Algoritmo ValidarFecha
	Definir dia, mes, anio Como Entero
	Escribir "Introduce el día: "
	Leer dia
	Escribir "Introduce el mes: "
	Leer mes
	Escribir "Introduce el año: "
	Leer anio
	Segun mes Hacer
		Caso 1, 3, 5, 7, 8, 10, 12:
			Si dia > 31 Entonces
				Escribir "La fecha introducida no es válida"
			SiNo
				Segun mes Hacer
					1:
						Escribir dia, " de Enero de ", anio
					3:
						Escribir dia, " de Marzo de ", anio
					5:
						Escribir dia, " de Mayo de ", anio
					7:
						Escribir dia, " de Julio de ", anio
					8:
						Escribir dia, " de Agosto de ", anio
					10:
						Escribir dia, " de Octrubre de ", anio
					12:
						Escribir dia, " de Diciembre de ", anio
					FinSegun
			FinSi
		Caso 4, 6, 9, 11:
			Si dia > 30 Entonces
				Escribir "La fecha introducida no es válida"
			SiNo
				Segun mes Hacer
					4:
						Escribir dia, " de Abril de ", anio
					6:
						Escribir dia, " de Junio de ", anio
					9:
						Escribir dia, " de Septiembre de ", anio
					11:
						Escribir dia, " de Noviembre de ", anio
				FinSegun
			FinSi
		Caso 2:
			Si anio % 4 = 0 Entonces
				Si dia > 29 Entonces
					Escribir "La fecha introducida no es válida"
				SiNo
					Escribir dia, " de Febrero de ", anio
				FinSi
			Sino
				Si dia > 28 Entonces
					Escribir "La fecha introducida no es válida"
				SiNo
					Escribir dia, " de Febrero de ", anio
				FinSi
			FinSi
		De Otro Modo:
			Escribir "La fecha introducida no es válida"
	FinSegun
FinAlgoritmo