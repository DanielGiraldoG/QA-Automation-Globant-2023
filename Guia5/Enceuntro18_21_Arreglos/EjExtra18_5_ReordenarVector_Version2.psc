/// Guía 5 - Encuentro 18 a 21 - Ejercicio Extra 5
//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserción del carácter, facilitando
//un potencial reordenamiento del vector. Digamos que se pide ingresar el carácter en la
//posición X y la misma está ocupada, entonces de existir un espacio en cualquier posición X-n
//o X+n, desplazar los caracteres hacia la izq o hacia la derecha para poder ingresar el carácter
//	en cuestión en el lugar deseado. El procedimiento de reordenamiento debe ubicar el espacio
//	más cercano.
//Por ejemplo, suponiendo la siguiente frase y los subíndices del vector:
//	H o l a   m u n d o     c  r  u  e  l  !
//	0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//	
//Si se desea ingresar el carácter "%" en la posición 8, entonces el resultado con desplaza-
//miento sería:
//		
//		h o l a    m u n % d o     c  r  u  e  l  !
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
//		
//Notar que el desplazamiento se hizo hacia la izquierda porque el espacio de la posición 10 es-
//taba más cerca de la posición 8 que el espacio de la posición 4. Nota: en caso del que el des-
//plazamiento sea a la izquierda y se requiera que se remueva la letra, se hará. Por ejemplo,
//		
//para poner un "%" en la posición 6, haríamos un desplazamiento a la izquierda y borraríamos
//la letra h



Algoritmo EjExtra18_5_ReordenarVector
	Definir n,  posicion,posicionOriginal, espaciosDer, espaciosIzq Como Entero
	Definir frase, letra, vectorX, vectorOriginal como cadena
	n=20
	Dimension vectorX(n), VectorOriginal(n)
	
	Hacer
		Escribir " Ingrese una frase de 20 caracteres o menos"
		leer frase
	Mientras Que Longitud(frase) > n
	
	
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
	Fin Mientras
	
	posicion = posicionOriginal
	
	mientras (vectorX(posicion) <> " ") Y (vectorX(posicion) <> "") Y posicion < n-1 Hacer
		espaciosDer = espaciosDer + 1
		posicion = posicion + 1
		Escribir "espacios derecha " espaciosDer
	FinMientras
	
FinSubProceso

Subproceso VectorReorganizado(n,vectorX Por Referencia, VectorOriginal, posicionOriginal,espaciosDer, espaciosIzq, letra)
	Definir i Como Entero
	
	si espaciosDer = 0 o espaciosIzq = 0 Entonces
		vectorX(posicionOriginal) = letra
		Para i = posicionOriginal+1 hasta n-2  Hacer
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
				Para i = posicionOriginal+1 hasta n-2 Hacer
					vectorX(i) = VectorOriginal(i-1) 
				FinPara
			FinSi
		FinSi		
	FinSi
	
FinSubProceso

SubProceso MostrarVector(n, vector Por Referencia)
	Definir i Como Entero
	
	Para i <- 0 hasta n-1 Hacer
		Escribir sin saltar " [ " vector(i) " ] "
	FinPara
	
FinSubProceso



	
