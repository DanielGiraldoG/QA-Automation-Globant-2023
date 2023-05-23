Algoritmo ejercicio_practico4

	Definir n Como entero
	
	Escribir "Ingrese cantidad de datos por vector"
	Leer n
	
	menu(n)
FinAlgoritmo

SubProceso menu(n Por Referencia)
	Definir seleccion Como Caracter
	Definir vectorA, vectorB, vectorC, option Como Entero
	Dimension vectorA[n], vectorB[n], vectorC[n]
	
	Hacer
		Escribir "SELECCIONE UNA OPCIÓN"
		escribir "A. Llenar Vector A"
		escribir "B. Llenar Vector B"
		escribir "C. Llenar Vector C con la suma de los vectores A y B"
		escribir "D. Llenar Vector C con la resta de los vectores B y A"
		escribir "E. Mostrar Vector"
		escribir "F. Salir"
		Leer seleccion
		
		Segun seleccion Hacer
			"A","a":
				vectorAleatorio(vectorA, n)
			"B","b":
				vectorAleatorio(vectorB, n)
			"C","c":
				vectorSuma(vectorA,vectorB,vectorC,n)
			"D","d":
				vectorResta(vectorA,vectorB,vectorC,n)
			"E","e":
				Escribir "SELECCIONE UNA OPCIÓN"
				escribir "1. mostrar Vector A"
				escribir "2. mostrar Vector B"
				escribir "3. mostrar Vector C"
				escribir "4. mostrar Vector A, B y C"
				Leer option
				Segun option Hacer
					1:
						Escribir "----------------VECTOR A------------------"
						mostrarVector(vectorA,n)
					2:
						Escribir "----------------VECTOR B------------------"
						mostrarVector(vectorB,n)
					3:
						Escribir "----------------VECTOR C------------------"
						mostrarVector(vectorC,n)
					4:
						Escribir "----------------VECTOR A------------------"
						mostrarVector(vectorA,n)
						Escribir "----------------VECTOR B------------------"
						mostrarVector(vectorB,n)
						Escribir "----------------VECTOR C------------------"
						mostrarVector(vectorC,n)
				FinSegun
		FinSegun
		Escribir ""
	Mientras Que seleccion <> "f" y seleccion <> "F"
FinSubProceso

SubProceso vectorAleatorio(vector Por Referencia,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vector[i] = Aleatorio(-100,100)
	FinPara
FinSubProceso

SubProceso vectorSuma(vectorA,vectorB, vectorC Por Referencia,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorC[i] = vectorA[i] + vectorB[i]
	FinPara
FinSubProceso

SubProceso vectorResta(vectorA,vectorB, vectorC Por Referencia,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorC[i] = vectorA[i] - vectorB[i]
	FinPara
FinSubProceso

SubProceso mostrarVector(vector,n)
	Definir i Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		Escribir Sin Saltar "[" vector[i] "]"
	FinPara
	Escribir ""
	Escribir "------------------------------------------"
	Escribir "      presione ENTER para continuar"
	Esperar Tecla
	Escribir ""
FinSubProceso
