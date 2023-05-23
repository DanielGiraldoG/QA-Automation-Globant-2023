//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.

Algoritmo EjercicioExtra_6_3_tresDigitos
	
	Definir numUsuario como cadena
	Definir longNum como numero
	
	Escribir  "Ingrese un nùmero de tres dìgitos: " 
	Leer	numUsuario
	
	longNum = longitud(numUsuario)
	
	Segun longNum Hacer
		
		3: 
			Escribir "Tiene tres digitos"
		De Otro Modo:
			Escribir "No tiene 3 numeros, favor ingrese otro numero"
			
	FinSegun
	
FinAlgoritmo
