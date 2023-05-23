/// Guia 5 - Encuentro 18 a 21 - Ejercicio 4
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
/// A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
/// usando la función Aleatorio(valorMin, valorMax) de PseInt.
/// B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
/// C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
///a elemento. Ejemplo: C = A + B
/// D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
///elemento. Ejemplo: C = B - A
///E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
/// A, B, o C.
/// F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//  para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo Ej18_4_MenuVectores
	Definir n Como Entero
	Definir vectorA,VectorB,vectorC Como Entero
		
	Escribir "ingrese el numero de elementos del vector"
	Leer n
	
	Dimension vectorA[n], VectorB[n], vectorC[n]
	
	menu(n, vectorA, vectorB, vectorC)
	
FinAlgoritmo

SubProceso menu(n, vectorA, vectorB, vectorC)
	Definir opcionElegida Como Caracter
//	Definir vectorA,VectorB,vectorC Como Entero
//	Dimension vectorA[n], VectorB[n], vectorC[n]
	
	Escribir "Qué desea hacer?"
	Escribir "A. Llenar Vector A"
	Escribir "B. Llenar Vector B"
	Escribir "C. Llenar Vector C sumando A y B"
	Escribir "D. Llenar Vector C (B-A)"
	Escribir "E. Mostrar vector"
	Escribir "F. Salir"
	Leer opcionElegida
	opcionElegida = Mayusculas(opcionElegida)
	
	Segun opcionElegida Hacer
		"A":
			llenarVector(n, VectorA)
			menu(n, vectorA, vectorB, vectorC)
			
		"B":
			llenarVector(n, VectorB)
			menu(n, vectorA, vectorB, vectorC)
			
		"C":
			SumaVectores(n, vectorA, vectorB, vectorC)
			menu(n, vectorA, vectorB, vectorC)
			
		"D":
			RestaVectores(n, vectorA, vectorB, vectorC)
			menu(n, vectorA, vectorB, vectorC)
		"E":
			MostrarVector(n, vectorA,vectorB, vectorC)
			
		De Otro Modo:
			menu(n, vectorA, vectorB, vectorC)
			
	FinSegun
FinSubProceso 


SubProceso  llenarVector(n, VectorA Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		VectorA[i] = Aleatorio(-100,100)
	FinPara
FinSubProceso

SubProceso SumaVectores(n, vectorA, vectorB, vectorC Por Referencia)	
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorC(i) = vectorA[i] + vectorB[i]
	FinPara
FinSubProceso


SubProceso RestaVectores(n, vectorA, vectorB, vectorC Por Referencia)	
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorC(i) = vectorA[i] - vectorB[i]
	FinPara
FinSubProceso

SubProceso MostrarVector(n,vectorA, vectorB, vectorC)	
	Definir i Como Entero
	Definir eleccion Como Caracter
	
	Escribir "Ingrese que vector desea mostrar"
	Escribir " 1 -> Vector A"
	Escribir " 2 -> Vector B"
	Escribir " 3 -> Vector C"
	Leer eleccion
	
	Segun eleccion Hacer
		"1": 
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar " [ " vectorA(i) " ] "
			FinPara
			menu(n, vectorA, vectorB, vectorC)
		"2":
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar " [ " vectorB(i) " ] "
			FinPara
			menu(n, vectorA, vectorB, vectorC)
		"3":
			Para i = 0 Hasta n-1 Hacer
				Escribir sin saltar " [ " vectorC(i) " ] "
			FinPara
			menu(n, vectorA, vectorB, vectorC)
	FinSegun
	
	Para i = 0 Hasta n-1 Hacer
		vectorC(i) = vectorA[i] - vectorB[i]
	FinPara
FinSubProceso

	