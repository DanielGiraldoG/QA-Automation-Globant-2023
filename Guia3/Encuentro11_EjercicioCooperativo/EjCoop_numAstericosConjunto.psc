Algoritmo EjCoop_numAstericosConjunto
	
	Definir num1,num2,num3,num4,num5 Como Real
	Definir i,j Como Entero
	Definir  cadenanum Como Caracter
	

	Escribir "Ingrese 5 numeros"
	Leer  num1
	
	Mientras num1 <0 O num1>20 Hacer
		
		Escribir num1 " no es valido, Ingrese un número entre 0 y 20"
		leer num1
	FinMientras
	
	
	Leer  num2
	
	Mientras num2 <0 O num2>20 Hacer
		Escribir num2 " no es valido, Ingrese un número entre 0 y 20"
		leer num2
	FinMientras
	
	Leer  num3
	
	Mientras num3<0 O num3>20 Hacer
		
		Escribir num3 " no es valido, Ingrese un número entre 0 y 20"
		leer num3
	FinMientras
	
	
	Leer  num4
	
	Mientras num4 <0 O num4>20 Hacer
		
		Escribir num4 " no es valido, Ingrese un número entre 0 y 20"
		leer num4
	FinMientras
	
	Leer  num5
	
	Mientras num1 <0 O num1>20 Hacer
		
		Escribir num5 " no es valido, Ingrese un número entre 0 y 20"
		leer num1
	FinMientras
	
	// Fin entrada datos
	
		cadenanum = ""
		
		para j= 1 hasta num1 Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num1 , ":" , cadenanum
		
		cadenanum = ""
		
		para j= 1 hasta num2 Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num2 , ":" , cadenanum
		
		cadenanum = ""
		
		para j= 1 hasta num3 Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num3 , ":" , cadenanum
		
		cadenanum = ""
		
		para j= 1 hasta num4 Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num4 , ":" , cadenanum
		
		cadenanum = ""
		
		para j= 1 hasta num5 Hacer
			cadenanum = cadenanum + " *"
			
		FinPara
		Escribir num5 , ":" , cadenanum
		
FinAlgoritmo
