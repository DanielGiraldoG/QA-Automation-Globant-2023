Funcion serie <- Fibonacci (num)
	Definir serie, aux2 como cadena
	Definir fibo1, fibo2, suma como entero
	fibo1 = 1
	fibo2 = 1
	serie = '1,1'
	Hacer
		suma = fibo1 + fibo2
		fibo1 = fibo2 
		fibo2 = suma
		aux2 = ConvertirATexto(suma)
		serie = serie + "," + aux2
	Mientras que (fibo2 < num y fibo1+fibo2 <= num)
FinFuncion

Algoritmo sin_titulo
	Definir num Como Entero
	Definir aux como cadena
	Escribir "Ingresa número"
	Leer num
	aux= Fibonacci (num)
	Imprimir aux
FinAlgoritmo