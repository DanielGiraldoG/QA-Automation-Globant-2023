Algoritmo menuOperaciones
	Definir num1, num2 Como Entero
	Definir operacionLetra Como Caracter
	
	Escribir "Ingrese  dos números enteros: "
	Leer num1
	Leer num2
	
	Escribir "Escriba que operación deseas realizar: (S:suma/R: Resta/M: Multiplicación /D: División)"
	leer operacionLetra
	
	operacionLetra = Mayusculas(operacionLetra)
	
	Segun operacionLetra Hacer
		"S":
			Escribir "La suma es: " num1 + num2
		"R":
			Escribir "La Resta es: " num1 - num2
		"M":
			Escribir "La Multiplicación es: " num1 * num2
		"D":
			Escribir "La División es: " num1 / num2
			
		De Otro Modo:
			Escribir  "Esa operación no está definida"
	Fin Segun
	
	
	
FinAlgoritmo

//Construir un programa que simule un menú de opciones para realizar las cuatro
//	operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
//	numéricos enteros. El usuario, además, debe especificar la operación con el primer
//carácter de la operación que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//	?M? o ?m? para la multiplicación y ?D? o ?d? para la división.