/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 5

Algoritmo EjExtra18_5_ReordenarVector
	Definir n,  posicion,posicionOriginal, espaciosDer, espaciosIzq Como Entero
	Definir frase, letra, vectorX, vectorOriginal como cadena
	n=20
	Dimension vectorX(n), VectorOriginal(n)
	
	Hacer
		Escribir " Ingrese una frase de 20 caracteres o menos"
		leer frase
	Mientras Que Longitud(frase) > 20
	
	
	Escribir "Por favor ingrese una letra"
	leer letra
	Escribir"Ingrese una posicion"
	leer posicion
	
	LlenarVector(n,vectorX, vectorOriginal, frase)
	
	posicionOriginal = posicion
	espaciosDer = 0
	espaciosIzq = 0
	
	hallarVacio(n, vectorX, posicion, posicionOriginal, espaciosIzq, espaciosDer)
	VectorReorganizado(n,vectorX, VectorOriginal, posicionOriginal,espaciosDer, espaciosIzq, letra)
	MostrarVector(n, vectorOriginal)
	
	Escribir ""
	MostrarVector(n, vectorX)
FinAlgoritmo



SubProceso LlenarVector(n, vectorX Por Referencia,VectorOriginal Por Referencia frase)
	Definir i  Como Entero
	
	Para i = 0 Hasta n-1 Hacer
		vectorX(i) = subcadena(frase,i,i)
		VectorOriginal(i) = vectorX(i)
	FinPara
FinSubProceso

Subproceso hallarVacio (n, vectorX, posicion, posicionOriginal, espaciosIzq Por Referencia, espaciosDer Por Referencia )
	
	Mientras (vectorX(posicion) <> " ") Y posicion > 0 Hacer
		espaciosIzq = espaciosIzq + 1
		posicion = posicion - 1
		Escribir "espacios izquierda " espaciosIzq , " letra: " vectorX(posicion)
//		Si posicion == -1 Entonces
//			posicion = 0
//		FinSi
	Fin Mientras
	
	posicion = posicionOriginal
	
	mientras (vectorX(posicion) <> " ") Y (vectorX(posicion) <> "") Y posicion < n-1 Hacer
		espaciosDer = espaciosDer + 1
		posicion = posicion + 1
		Escribir "espacios derecha " espaciosDer
	FinMientras
	
FinSubProceso

///-----------------------------------------------
SubProceso MostrarVector(n, vector Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		Escribir sin saltar " [ " vector(i) " ] "
	FinPara
FinSubProceso

Subproceso VectorReorganizado(n,vectorX Por Referencia, VectorOriginal, posicionOriginal,espaciosDer, espaciosIzq, letra)
	
	Definir i Como Entero
	
	si espaciosDer = 0 o espaciosIzq = 0 Entonces
		vectorX(posicionOriginal) = letra
		Para i = posicionOriginal+1 hasta 18  Hacer
			vectorX(i) = VectorOriginal(i) 
		Fin para
		
	SiNo
		Si espaciosIzq < espaciosDer Entonces
			vectorX(posicionOriginal) = letra
			Para i = posicionOriginal-1 hasta 0 con paso -1 Hacer
				vectorX(i) = VectorOriginal(i+1) 
			FinPara
			
		SiNo
			Si espaciosIzq >= espaciosDer Entonces
				vectorX(posicionOriginal) = letra
				Para i = posicionOriginal+1 hasta 18  Hacer
					vectorX(i) = VectorOriginal(i-1) 
				FinPara
			FinSi
		FinSi		
	FinSi
	
FinSubProceso



	
