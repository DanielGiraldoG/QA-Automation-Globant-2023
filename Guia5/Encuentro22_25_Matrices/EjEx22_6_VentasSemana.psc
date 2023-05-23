/// Guia 5 - Encuentro 22 - Ejercicio Extra 7

//7. Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
//	a) Total de ventas por cada día de la semana.
//	b) Total de ventas de cada producto a lo largo de la semana.
//	c) El producto más vendido en cada semana.
//	d) El nombre, el día de la semana y la cantidad del producto más vendido.

//El informe final tendrá un formato como el que se muestra a continuación:
//	
//	               Lunes     		Martes      Miércoles   	 Jueves     Viernes      Total producto
//	
//	Producto 1 
//	Producto 2
//	Producto 3
//	Producto 4
//	Producto 5

//	Total semana
//	
//	Producto 
//	más vendido

Algoritmo EjEx22_7_VentasSemana
	
	Definir matrizReporte,n,m Como Entero
	
	Escribir " Ingrese el número de productos con el que cuenta: "
	leer n
	
	m = 6
	Dimension matrizReporte[n,m]
	
	llenarMatriz(n,m, matrizReporte)
	MostrarMatriz(n,m, matrizReporte)
	
FinAlgoritmo


SubProceso  llenarMatriz(n,m,matriz)
	Definir i,j,suma Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		suma = 0
		Para j=0 hasta m-2 Hacer
			Escribir " Ingrese el número de la posición (" i " , " j ")" 
			leer matriz[i,j] 
			suma = suma + matriz[i,j]
			matriz[i,m-1] = suma
		FinPara
	FinPara
FinSubProceso

Subproceso MostrarMatriz(n,m,matriz)
	Definir i,j Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Escribir sin saltar " [ "
		Para j=0 hasta m-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir "]"
	FinPara
FinSubProceso
