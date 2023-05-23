//6. Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
//desarrollar un programa que:
///	a) Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por letra.
///Ayuda: utilizar la funci�n Subcadena de PSeInt.
//	b) Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
//	posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter en la
//	posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o es un espacio
//	en blanco). De ser posible debe mostrar el vector con la frase y el car�cter ingresado,
//	de lo contrario debe darle un mensaje al usuario de que esa posici�n estaba ocupada.

Algoritmo Ej18_6_IngresarLetraEnArreglo
	Definir n,  posicion,i Como Entero
	Definir frase, letra, vectorX como cadena
	
	Dimension vectorX(20)
	
	Escribir " Ingrese una frase"
	leer frase
	
	
	vector(vectorX,frase)
	
	Escribir "Por favor ingrese una letra"
	leer letra
	
	Escribir"Ingrese una posicion"
	leer posicion
	
	
	si vectorX(posicion) == " "
		vectorX(posicion) = letra
	SiNo
		Escribir "Este espacio ya esta ocupado"
	FinSi

	Para i = 0 Hasta 19 Hacer
		escribir sin saltar "[ " vectorX(i) " ]"
	FinPara
	
FinAlgoritmo


SubProceso vector(vectorX Por Referencia,frase)
	Definir i  Como Entero
	
	Para i = 0 Hasta 19 Hacer
		
		vectorX[i] = subcadena(frase,i,i)
		
	FinPara
FinSubProceso
