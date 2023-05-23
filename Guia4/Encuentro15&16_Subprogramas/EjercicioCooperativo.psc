Algoritmo sin_titulo
	CalcularViga()
	CalcularPintura()
FinAlgoritmo

////subprograma calcularViga
//Nos debe pedir el largo de la viga. Por metro lineal de viga se necesitarán: 9 kg de cemento, 0.02
//m3 de arena, 0.02 m2 de piedra, 4 m de hierro del 8 y 3 m de hierro del 4.
//Debemos mostrar al usuario la cantidad de materiales necesaria.

SubProceso CalcularViga ()
	
	Definir largoViga, cemento, arena, piedra, hierro8, hierro4 Como Real
	
	Escribir "Favor Ingrese el largo de la viga en metros lineales (m)"
	leer largoViga
	
	
	Mientras  largoViga<0 Hacer
		Escribir "Ingrese un número real positivo"
		leer largoViga
	FinMientras
	
	cemento = 9 * largoViga
	arena = 0.02 * largoViga
	piedra = 0.02 * largoViga
	hierro8 = 4 * largoViga
	hierro4 = 3 * largoViga
	
	Escribir " La cantidad a utilizar de los siguientes materiales será de : "
	Escribir " Cemento 		 : " cemento " (kg) "
	Escribir " Arena   		 : " arena  "  (m3) "
	Escribir " Piedra       : " piedra " (m2) "
	Escribir " Hierro del 8 : " hierro8 " (m) "
	Escribir " Hierro del 4 : " hierro4 " (m) "
	
FinSubProceso

///subprograma calcularPintura
//Nos debe pedir la superficie del muro y mostrar cuánta pintura necesitamos teniendo en cuenta
//que rinde 6 m2 por litro de pintura.

SubProceso CalcularPintura()
	
	Definir areaMuro, rendimiento Como Real
	
	Escribir " Por favor ingrese la superficie del muro en metros cuadrados "
	Leer  areaMuro
	
	Mientras  areaMuro<0 Hacer
		Escribir "Ingrese un número real positivo"
		leer areaMuro
	FinMientras
		
	rendimiento = 6 // m2 por litro de pintura
	
	Escribir " La cantidad de litros de pintura que se necesitará es de: " areaMuro / rendimiento " Litros (L) " 
	
FinSubProceso

	