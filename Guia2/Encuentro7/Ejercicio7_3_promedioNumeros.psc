//Dada una secuencia de números ingresados por teclado que finaliza con un -1, por
//ejemplo: 5,3,0,2,4,4,0,0,2,3,6,0,......,-1; realizar un programa que calcule el promedio de
//los números ingresados. Suponemos que el usuario no insertará número negativos.

Algoritmo Ejercicio7_3_promedioNumeros
	
	Definir numUsuario, promedio , contador, sum Como Real
	
	Escribir " Ingrese un numero: "
	leer numUsuario
	
	sum = 0 
	contador = 0
	
	Mientras numUsuario <> -1 Hacer
		sum = sum + numUsuario
		contador = contador + 1
		
		Escribir "Ingrese un nuevo numero"
		leer numUsuario
		
	Fin Mientras
	
	promedio = sum / contador
	
	Escribir " El promedio de los numeros ingresados es: " promedio

FinAlgoritmo
