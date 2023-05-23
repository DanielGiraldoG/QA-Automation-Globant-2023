/// Guia 4 - Encuentro 15 - Ejercicio3
//Realizar un procedimiento que permita realizar la división entre dos números y muestre el
//cociente y el resto utilizando el método de restas sucesivas.
//cociente y el resto utilizando el método de restas sucesivas.
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 - 13 = 37 una resta realizada
//		37 - 13 = 24 dos restas realizadas
//		24 - 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo Ejercicio15_3_CocienteYResto
	
	Definir num1,num2 Como Entero
	
	Escribir "Ingrese dos numeros"
	Leer num1,num2
	
	HallarResiduoCociente(num1,num2)

FinAlgoritmo

SubProceso HallarResiduoCociente(pnum1,pnum2)
	Definir resta, residuo, cociente Como Entero
	
	resta = pnum1
	cociente = 0
		
	Hacer 
		resta = resta - pnum2
		cociente = cociente + 1
	Mientras Que resta >= pnum2 
	
	residuo = resta
	Escribir "El residuo entre " pnum1 " / " pnum2 " es: " residuo " y el cociente es: " cociente
FinSubProceso
	