/// Guia 5 - Encuentro 22 - Ejercicio Extra 7

//7. Una empresa de venta de productos por correo desea realizar una estadística de las ventas
//realizadas de cada uno de sus productos a lo largo de una semana. Distribuya luego 5
//productos en los 5 días hábiles de la semana. Se desea conocer:
///	a) Total de ventas por cada día de la semana.
///	b) Total de ventas de cada producto a lo largo de la semana.
///	c) El producto más vendido en cada semana.
///	d) El nombre, el día de la semana y la cantidad del producto más vendido.

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
	
	Definir matrizReporte,n,m, producto, diaSemana Como Entero
	Definir semana Como Caracter
	
	Escribir " Ingrese el número de productos con el que cuenta: "
	leer n
	m = 6
	n= n+2
	
	Dimension matrizReporte[n,m], semana[5]
	
	llenarMatriz(n,m, matrizReporte, producto, diaSemana)
	MostrarMatriz(n,m, matrizReporte)
	
	semana[0] = "Lunes"
	semana[1] = "Martes"
	semana[2] = "Miercoles"
	semana[3] = "Jueves"
	semana[4] = "Viernes"
	Escribir ""
	Escribir " El producto más vendido de la semana es el producto " producto+1 " en el día " semana[diaSemana] " con " matrizReporte[producto, diaSemana] " unidades vendidas"
	
FinAlgoritmo


SubProceso  llenarMatriz(n,m,matriz, producto Por Referencia, diaSemana Por Referencia)
	Definir i,j,totalProducto, totalSemana, productoMasVendido, productoMasVendidoSemana Como Entero
	
	Para i = 0 Hasta n-3 Hacer
		totalProducto = 0
		productoMasVendidoSemana = 0
		
		Para j=0 hasta m-2 Hacer
//			Escribir " Ingrese el número de la posición (" i " , " j ")" 
			//			leer matriz[i,j] 
			matriz[i,j] = Aleatorio(0,9)
			totalProducto = totalProducto + matriz[i,j]
			
			Si matriz[i,j] > productoMasVendidoSemana
				productoMasVendidoSemana = matriz[i,j]
				producto = i
				diaSemana = j
			FinSi
				
		FinPara
		matriz[i,m-1] = totalProducto
	FinPara
	
	Para j = 0 hasta m-1 Hacer
		totalSemana = 0
		productoMasVendido = 0
		para i= 0 hasta n-3 Hacer
			totalSemana = totalSemana + matriz[i,j]	
			Si matriz[i,j] > productoMasVendido
				productoMasVendido = matriz[i,j]
			FinSi
			
		FinPara
		Matriz[n-2, j] = totalSemana
		Matriz[n-1, j] = productoMasVendido
		
		
	FinPara
	
FinSubProceso

Subproceso MostrarMatriz(n,m,matriz)
	Definir i,j Como Entero
	Escribir "                        L  M  M  J  V  Total"
	Para i = 0 Hasta n-1 Hacer
		segun i Hacer
			n-1: 
				Escribir sin saltar "Producto más vendido " " [ "
			n-2:
				Escribir sin saltar "Total Semana " "         [ "
			De Otro Modo:
				Escribir sin saltar "Producto " i+1 "            [ "
				
		FinSegun
		
		Para j=0 hasta m-1 Hacer
			Si i = n-2 Entonces
				Escribir sin saltar matriz[i,j] " "
			SiNo
				Escribir sin saltar matriz[i,j] "  "
			FinSi
			
		FinPara
		Escribir "]"
	FinPara
FinSubProceso


