//Hacer un algoritmo que lea un n�mero por el teclado y determine si tiene tres d�gitos.

Algoritmo EjercicioExtra_6_3_tresDigitos
	
	Definir numUsuario como cadena
	Definir longNum como numero
	
	Escribir  "Ingrese un n�mero de tres d�gitos: " 
	Leer	numUsuario
	
	longNum = longitud(numUsuario)
	
	Segun longNum Hacer
		
		3: 
			Escribir "Tiene tres digitos"
		De Otro Modo:
			Escribir "No tiene 3 numeros, favor ingrese otro numero"
			
	FinSegun
	
FinAlgoritmo
