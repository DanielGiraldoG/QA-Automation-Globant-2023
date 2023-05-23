///Guia 4 - Encuentro 15 - Ejercicio 7 
//7. Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario
//al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123


Algoritmo Ejercicio15_7_EscaleraNumeros
	
	Definir altura Como real
	Escribir " Favor ingrese la altura del numero "
	leer altura
	
	EscaleraNumeros(altura)
	
FinAlgoritmo

SubProceso EscaleraNumeros ( paltura)
	
	Definir i,j Como real
	
	para i = 1 hasta paltura Con Paso  1 entonces
		
		para j = 1 hasta i Con Paso  1 entonces
			escribir sin saltar j
		FinPara
		escribir ""
	FinPara
	
FinSubProceso


//SubProceso EscaleraNumeros ( paltura)
//	
//	Definir i, escalera Como real
//	escalera = 0
//	
//	para i = 1 hasta paltura Con Paso  1 entonces
//		
//		escalera = i +  escalera * 10
//		escribir i
//		Escribir escalera
//		
//	FinPara
//FinSubProceso
	