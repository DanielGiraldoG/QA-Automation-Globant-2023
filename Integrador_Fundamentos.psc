Algoritmo Integrador_Fundamentos
	
	Definir muestra, matriz como caracter
	Definir valido, valGenZ Como Logico
	Definir dim Como real
	
	// Muestra valida: "ACDDCADBCDABDBBE"
	muestra = "CDDACCACCACAAABC"
	
	ValidarMuestra(muestra, valido)
	
	Si valido
		dim = raiz(longitud(muestra))
		
		Dimension matriz[dim,dim]
		
		llenarMatriz(dim,matriz,muestra)
		MostrarMatriz(dim,matriz)
		ValidarGenZ(valGenZ, matriz, dim)
		
		Escribir ""
		Escribir " Es " valGenZ " que la muestra contiene el gen Z "
	SiNo
		Escribir "Muestra no valida"
	FinSi
	
	
FinAlgoritmo


SubProceso LlenarMatriz(dim,matriz,muestra)
	Definir i,j,k Como Entero
	k = 0
	
	Para i = 0 Hasta dim-1 Hacer
		Para j=0 hasta dim-1 Hacer
			matriz[i,j] = subcadena(muestra, k, k)
			k = k +1
		FinPara
	FinPara
FinSubProceso


Subproceso MostrarMatriz(dim,matriz)
	Definir i,j Como Entero
	
	Escribir ""
	Para i = 0 Hasta dim-1 Hacer
		Escribir sin saltar " [ "
		Para j=0 hasta dim-1 Hacer
			Escribir sin saltar matriz[i,j] " "
		FinPara
		Escribir "]"
	FinPara
FinSubProceso


SubProceso ValidarMuestra(muestra Por Referencia, valido Por Referencia)
	Definir i, longMuestra Como Entero
	
	
//	Hacer
//		Escribir "Ingrese una muestra que solo contenga cuatro posibles bases (A,B,C,D) y tiene que tener alguna de las siguientes longitudes: 9, 16 O 1369"
//		leer muestra
		
		valido = Verdadero
		muestra = Minusculas(muestra)
		longMuestra = Longitud(muestra)
			
		si (raiz(longMuestra) <> 3 Y raiz(longMuestra) <> 4  Y raiz(longMuestra) <> 37 )
			valido = Falso
		FinSi
		
		Para i = 0 hasta longMuestra-1 Hacer
			
			Si subcadena(muestra,i,i) <> "a" Y subcadena(muestra,i,i) <>"b" Y subcadena(muestra,i,i) <>"c" Y subcadena(muestra,i,i) <>"d" Entonces
				valido = Falso
			FinSi
			
		FinPara
		//Escribir " es valido? " valido
//	Mientras Que !valido 
	
FinSubProceso


SubProceso  ValidarGenZ(valGenZ Por Referencia, matriz, dim)
	
	Definir i, j Como Entero
	Definir valorMatriz como cadena
	j = 1
	valorMatriz = matriz[0,0]
	valGenZ = Verdadero
	
	Para i = 1 Hasta dim-1 Hacer
		
		Si  matriz[i,j] <> valorMatriz Entonces
			valGenZ = Falso
			i = dim
		FinSi
		j = j+1
			
	FinPara
	
	j = dim-2
	valorMatriz = matriz[0,dim-1]
	Para i = 1 Hasta dim-1 Hacer
		Si  matriz[i,j] <> valorMatriz Entonces
			valGenZ = Falso
			i = dim
		FinSi
		j = j-1
	FinPara
	
FinSubProceso
	