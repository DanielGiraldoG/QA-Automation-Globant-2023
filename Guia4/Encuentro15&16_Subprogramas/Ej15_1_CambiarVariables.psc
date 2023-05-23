/// Guia 4 - Encuentro 15 - Ejercicio1
//1. Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.

Algoritmo Ej15_1_CambiarVariables
	
	Definir var1 , var2 Como Entero
	
	Escribir "Ingrese las dos variables que desea intercambiar"
	Leer var1, var2
	
	CambiarVariables(var1,var2)
	Escribir " El valor de la variable 1 es: " var1 " y el valor de la variable 2 es: " var2
	
FinAlgoritmo

SubProceso CambiarVariables(var1 Por Referencia ,var2 Por Referencia )
	
	Definir varAux Como Entero
	varAux = var1
	var1 = var2
	var2 = varAux
	
FinSubProceso
	