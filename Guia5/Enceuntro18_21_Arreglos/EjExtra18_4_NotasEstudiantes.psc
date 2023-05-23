/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 4
//4. Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre 0 y
//20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de PseInt.
//Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos estudiantes son:
//	a) Deficientes 0-5
//	b) Regulares 6-10
//	c) Buenos 11-15
//	d) Excelentes 16-20

Algoritmo EjExtra18_4_NotasEstudiantes
	
	Definir vectorA,n Como Entero
	
	Dimension vectorA(100)
	
	LlenarVector(100, vectorA)
	ContarEstudiantes(100, vectorA)
	
FinAlgoritmo

SubProceso  LlenarVector(n, vector Por Referencia)
	Definir i Como Entero
		
	Para i <- 0 hasta n-1 Hacer
		vector(i) = azar(20)
	FinPara
FinSubProceso

Subproceso ContarEstudiantes(n,vector)
	Definir contDef, contReg, contBuenos, contExc,i Como Entero
	
	contDef = 0
	contReg = 0
	contBuenos = 0
	contExc = 0
	
	Para i=0 Hasta n-1 Hacer
		Si vector(i) <=5 Entonces
			contDef = contDef + 1
			
		SiNo
			Si vector(i) <=10 Entonces
				contReg = contReg + 1
				
			Sino 
				si vector(i) <= 15 Entonces
					contBuenos = contBuenos + 1
				SiNo
					Si vector(i) <= 20 Entonces
						contExc = contExc + 1
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	
	Escribir "Deficientes " contDef
	Escribir "Regulares " contReg
	Escribir "Buenos " contBuenos
	Escribir "Excelentes " contExc
	
	
FinSubProceso
	