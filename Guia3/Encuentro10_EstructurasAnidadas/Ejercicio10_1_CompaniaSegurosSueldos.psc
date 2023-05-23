//Ejercicio 1. Una compa��a de seguros tiene contratados a n vendedores. Cada vendedor realiza
//m�ltiples ventas a la semana. La pol�tica de pagos de la compa��a es que cada vendedor
//recibe un sueldo base m�s un 10% extra por comisiones de sus ventas. El gerente de la
//compa��a desea saber, por un lado, cu�nto dinero deber� pagar en la semana a cada
//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cu�nto
//deber� pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
//vendedor ingresar cuanto es su sueldo base, cuantas ventas realiz� y cuanto cobr� por
//cada venta.

Algoritmo Ejercicio10_1_CompaniaSegurosSueldos
	
	Definir sueldoBase, valorVenta, ventaTotal, comision, salarioTotal Como Real
	Definir cantidadVentas, nVendedores,i,j Como entero
		
	Escribir "Ingrese el n�mero de vendedores"
	leer nVendedores
	
	mientras nVendedores <= 0 Hacer
		Escribir " Favor ingresa un numero de vendedores mayor a cero"
		leer nVendedores
	FinMientras
	
	para i = 1 hasta nVendedores Hacer
		
		ventaTotal = 0
		Escribir ""
		Escribir "Ingrese sueldo Base vendedor n�mero " i
		leer sueldoBase
		
		Escribir 	"Ingrese la cantidad de ventas de vendedor " i
		leer cantidadVentas
		
		si cantidadVentas > 0 Entonces
			
			para j=1 hasta cantidadVentas Hacer
				Escribir "Ingrese valor de la venta " j
				leer valorVenta
				
				ventaTotal = ventaTotal + valorVenta
			FinPara
			
		FinSi
		
		comision = ventaTotal * 0.1 
		salarioTotal = sueldoBase + comision
		
		Escribir "El salario por concepto de comisiones para vendedor " i " es de : $" comision  
		Escribir "El salario total para vendedor " i " es de: $" salarioTotal
		
	FinPara
	
	
	
	
	
FinAlgoritmo
