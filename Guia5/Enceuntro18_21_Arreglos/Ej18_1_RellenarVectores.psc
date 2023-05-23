/// Guía 5 - Encuentro 18 - Ejercicio 1
//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los
//muestre por pantalla.

Algoritmo 	Ej18_1_RellenarVectores
	
	Dimension vector1(5), vector2(5)
	Definir i , vector1 , vector2 Como Entero
	
	Para i = 0 Hasta  4 Hacer
		vector1[i] = azar(20)
		vector2[i] = azar(20)
	FinPara
	
	Para i = 0 Hasta  4 Hacer
		Escribir sin saltar " [ " vector1[i] " ] "
	FinPara
	
	Escribir ""
	
	Para i = 0 Hasta  4 Hacer
		Escribir sin saltar " [ " vector2[i] " ] "
	FinPara
	
	
FinAlgoritmo
