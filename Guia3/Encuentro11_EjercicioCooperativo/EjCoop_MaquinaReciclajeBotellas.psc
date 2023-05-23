//
///  Ejercicio cooperativo 3 Guia 2y3 
//  Necesitamos crear un sistema para una máquina de reciclaje de botellas automática. Dicha
//	máquina nos pagará dinero por la cantidad de plástico reciclado. Tenemos que ingresar
//	nuestro usuario y contraseña para que se nos cargue el saldo por sistema a nuestra
//	cuenta.
//	 		- Condición simple anidada: validaremos que el usuario sea "Albus_D", luego si esto es
//			verdadero, validaremos si la contraseña es "caramelosDeLimon". Si la contraseña es
//			correcta haremos que una variable llamada Login sea verdadera.

//			- Bucle Mientras: Este bloque de validación de la contraseña lo encerraremos en un
//			bucle Mientras para darle al usuario sólo 3 intentos para poner la contraseña.

//			- Bucle Hacer Mientras(Repetir): Una vez que el login sea verdadero, accederemos al
//			menú de opciones:
//				o Ingresar botellas
//				o Consultar saldo
//				o Salir
//	
//	-! Ingresar Botellas:   Primero preguntaremos cuántas botellas se va a ingresar al sistema.
//	                        Una vez que tenemos el número vamos a usar un bucle para, a fin de ir ingresando
//							cada botella. En cada ciclo del bucle se debe generar un número aleatorio entre 100 y
//							3000 gr, que va a ser el peso de las botellas a reciclar (simulando que el usuario está
//							ingresando botellas en la máquina). Una vez generado, según el peso del material,
//							usaremos un condicional múltiple para asignarle un valor monetario:
//												o! Si es menos de 500 gr, corresponden $50
//												o! Si es entre 501 gr y 1500 gr, corresponden $125
//												o! Si es más de 1501 gr, corresponden $200
//							Hecho esto, el programa debe informar al usuario por pantalla el valor que se le
//							ofrece. Si el usuario acepta, lo acreditamos a su saldo, sino se debe devolver el
//							material (sólo mostrar en pantalla "Devolviendo material"). Para esto usaremos un
//							condicional doble.

// -! Consultar saldo:      Revisaremos el valor monetario que tiene asignada la variable "saldo".

/// Tanto al terminar "Ingresar Botellas" como "Consultar Saldo" debe volver al menú principal



Algoritmo EjCoop_MaquinaReciclajeBotellas
	
	Definir usuario, contrasenia, respuestaUsuario como caracter
	Definir intentosContra, intentosUsuario, opcionMenu, numBotellas,i como entero
	Definir login Como Logico
	Definir peso, valorBotella,totalBotellas, saldo Como Real
	
	
	Escribir "Favor ingrese su usuario"
	Leer  usuario
		
	intentosUsuario = 1	
	Mientras  usuario <> "Albus_D" Y intentosUsuario <3 Hacer
		
		Escribir "Usuario incorrecto, Favor ingrese nuevamente su usuario"
		Leer  usuario
		intentosUsuario = intentosUsuario + 1

	FinMientras
	
	
	si usuario = "Albus_D" Entonces
		
		Escribir "Favor ingrese su contraseña"
		Leer  contrasenia
		
		intentosContra = 1	
		Mientras  contrasenia <> "caramelosDeLimon" Y intentosContra <3 Hacer
			
			Escribir "Contraseña incorrecta, Favor ingrese nuevamente su contraseña"
			
			Leer  contrasenia
			intentosContra = intentosContra + 1
			login = Falso
		FinMientras
			
		Si contrasenia == "caramelosDeLimon" Entonces
			Escribir "Has ingresado correctamente"
			login = verdadero
		FinSi
		
	SiNo
		login = Falso
	FinSi
	
	
	
	Si login = Verdadero Entonces
		
		saldo = 0
		totalBotellas = 0
		
		Hacer 
			Escribir ""	
			Escribir "Menú de opciones, favor selecciones una opción (1|2|3)"
			Escribir "1. Ingresar botellas"
			Escribir "2. Consultar Saldo"
			Escribir "3. Salir"
			
			leer opcionMenu
			
			segun opcionMenu Hacer
				1: 
					Escribir "Cuantas botellas va a ingresar al sistema"
					leer numBotellas
					
						
					Para i = 1 hasta numBotellas Con Paso 1 Hacer
						peso = Aleatorio(100,3000)
							
						si peso <= 500 Entonces
							valorBotella = 50
						FinSi
						
						si peso >= 501 Y peso <= 1500 Entonces
							valorBotella = 125
						FinSi
						
						si peso >= 1501 Entonces
							valorBotella = 200
						FinSi
						
						Escribir "El peso de la botella " i  " es: " peso "gr y su valor es $" valorBotella
						totalBotellas = totalBotellas + valorBotella
						
					FinPara
					
					Escribir ""
					Escribir "El valor total de botellas ingresados es: $" totalBotellas
					
					Escribir "Acepta el valor (s: Si /n: No)"
					leer respuestaUsuario
					respuestaUsuario = Minusculas(respuestaUsuario)
					
					si respuestaUsuario == "s" Entonces
						saldo = saldo + totalBotellas
					SiNo
						Escribir "Devolviendo material"
						Escribir ""
					FinSi
					
				2: 
					Escribir " Saldo: " saldo
					
			FinSegun
				
		Mientras Que opcionMenu == 1 o opcionMenu == 2
			
		Escribir " Has salido del menu"
		
	SiNo
		Escribir "Lo siento, no has podido ingresar sesión"
	FinSi
	
FinAlgoritmo
