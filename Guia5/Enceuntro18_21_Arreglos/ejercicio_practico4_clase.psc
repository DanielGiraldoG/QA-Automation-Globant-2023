/// Guia 5 - Encuentro 19 - Ejercicio 4
//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
//que ingrese la opción Salir:
/// A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
/// usando la función Aleatorio(valorMin, valorMax) de PseInt.
/// B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
// C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
// D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
//elemento. Ejemplo: C = B - A
//E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
// A, B, o C.
// F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//  para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una
//vez.

Algoritmo sin_titulo
	Definir vectorA, vectorB, vectorC,n Como Entero
	
	Escribir "ingrese el numero de elementos del vector"
	Leer n
	
	Dimension vectorA[n], VectorB[n], vectorC[n]
	
	menu()
	
FinAlgoritmo

SubProceso menu()
	Definir opcionElegida Como Caracter
	//Definir vectorA,VectorB,vectorC, n Como Entero
	

	
	
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
			
			//menu(vectorA Por Referencia, VectorB Por Referencia, vectorC Por Referencia, n Por Referencia)
		"B":
			llenarVector(n, VectorB)
			//menu(vectorA Por Referencia, VectorB Por Referencia, vectorC Por Referencia, n Por Referencia)
		"C":
			vectorC = SumaVectores(n,vectorA, vectorB)
			//menu(vectorA Por Referencia, VectorB Por Referencia, vectorC Por Referencia, n Por Referencia)
			
		"D":
			
		"E":
			
		"F":
			
		De Otro Modo:
			menu()
			
	FinSegun
FinSubProceso 

SubProceso  llenarVector(n, vectorX Por Referencia)
	Definir i Como Entero
		
	Para i <- 0 hasta n-1 Hacer
		vectorX[i] = Aleatorio(-100,100)
	FinPara
	
FinSubProceso


SubProceso SumaVectores(n, VectorA Por Referencia, VectorB Por Referencia)
	
	Definir vectorSuma,i Como Entero
	Dimension vectorSuma[n]
	Para i = 0 Hasta n-1 Hacer
		
		vectorSuma(i) = VectorA[i] + VectorB[i]
		
	FinPara
	    escribir vectorSuma[0]
	    escribir vectorSuma[1]
	    escribir vectorSuma[2]
FinSubProceso

	