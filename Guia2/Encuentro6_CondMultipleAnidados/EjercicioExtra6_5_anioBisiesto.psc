//Realice un programa que, dado un año, nos diga si es bisiesto o no. Un año es bisiesto
//bajo las siguientes condiciones: Un año divisible por 4 es bisiesto y no debe ser divisible
//por 100. Si un año es divisible por 100 y además es divisible por 400, también resulta
//bisiesto. Nota: recuerde la función mod de PseInt

Algoritmo EjercicioExtra6_5_anioBisiesto
	
	Definir anioUsuario Como Entero
	
	Escribir "Ingrese un año (YYYY): "
	leer anioUsuario
	
	Si (anioUsuario MOD 4 == 0) Y (anioUsuario MOD 100 <> 0) Entonces
		Escribir anioUsuario " Es un año bisiesto"
	SiNo
		Si (anioUsuario MOD 100 == 0) Y (anioUsuario MOD 400 == 0) Entonces
			Escribir anioUsuario " Es un año bisiesto"
			
		SiNo
			Escribir "No es un año bisiesto"
		FinSi
			
	FinSi
	
FinAlgoritmo
