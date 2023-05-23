//El promedio de los trabajos prácticos de un curso se calcula en base a cuatro notas de las
//cuales se elimina la nota menor y se promedian las tres notas más altas. Escriba un
//programa que determine cuál es la nota eliminada y el promedio de los trabajos prácticos
//de un estudiante.


Algoritmo EjercicioExtra6_7_PromedioNotas
	
	Definir nota1, nota2, nota3, nota4, promedio, menor Como Real
	
	Escribir "Ingrese 4 notas: "
	leer nota1
	leer nota2
	leer nota3
	leer nota4
	
		
	Si (nota1 < nota2) Y (nota1 < nota3) Y (nota1 < nota4)  Entonces
		menor = nota1
	Sino 
		Si (nota2 < nota1) Y (nota2 < nota3) Y (nota2 < nota4) Entonces
			menor = nota2
	SiNo
		Si (nota3 < nota1) Y (nota3 < nota2) Y (nota3 < nota4) Entonces
			menor = nota3
		SiNo
			menor = nota4
		FinSi
	FinSi
		
	FinSi
	
	Escribir "la menor nota es: " menor
	promedio = (nota1+nota2+nota3+nota4-menor)/3
	Escribir "El promedio de las tres mejores notas es: " , promedio
	
FinAlgoritmo
