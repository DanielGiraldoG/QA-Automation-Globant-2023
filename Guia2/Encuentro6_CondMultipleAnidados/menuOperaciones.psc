Algoritmo menuOperaciones
	Definir num1, num2 Como Entero
	Definir operacionLetra Como Caracter
	
	Escribir "Ingrese  dos n�meros enteros: "
	Leer num1
	Leer num2
	
	Escribir "Escriba que operaci�n deseas realizar: (S:suma/R: Resta/M: Multiplicaci�n /D: Divisi�n)"
	leer operacionLetra
	
	operacionLetra = Mayusculas(operacionLetra)
	
	Segun operacionLetra Hacer
		"S":
			Escribir "La suma es: " num1 + num2
		"R":
			Escribir "La Resta es: " num1 - num2
		"M":
			Escribir "La Multiplicaci�n es: " num1 * num2
		"D":
			Escribir "La Divisi�n es: " num1 / num2
			
		De Otro Modo:
			Escribir  "Esa operaci�n no est� definida"
	Fin Segun
	
	
	
FinAlgoritmo

//Construir un programa que simule un men� de opciones para realizar las cuatro
//	operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
//	num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
//car�cter de la operaci�n que desea realizar: ?S' o ?s? para la suma, ?R? o ?r? para la resta,
//	?M? o ?m? para la multiplicaci�n y ?D? o ?d? para la divisi�n.