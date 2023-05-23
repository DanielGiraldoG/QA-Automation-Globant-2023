//Una empresa tiene personal de distintas áreas con distintas condiciones de contratación y
//formas de pago. El departamento de contabilidad necesita calcular los sueldos semanales
//(lunes a viernes) en base a las 3 modalidades de sueldo:
//	a) comisión
//	b) salario fijo + comisión, y
//	c) salario fijo

//a) Para la modalidad salario por comisión se debe ingresar el monto total de las ventas
//realizadas en la semana, y el 40% de ese monto total corresponde al salario del
//empleado.

//b) Para la condición de salario fijo + comisión, se debe ingresar el valor que se paga por
//hora, la cantidad de horas trabajadas semanalmente y el monto total de las ventas en
//esa semana. En este tipo de contrato las horas extras no están contempladas y se fija
//como máximo 40 horas por semana. La comisión por las ventas se calcula como 25%
//del valor de venta total.

//c) Finalmente, para la modalidad de salario fijo se debe ingresar el valor que se paga
//por hora y la cantidad de horas trabajadas en la semana. En el caso de exceder las
//40 horas semanales, las horas extras se deben pagar con un extra del 50% del valor
//de la hora. Realizar un menú de opciones para poder elegir el tipo de contrato que
//tiene un empleado.

Algoritmo EjercicioExtra6_8_ModalidadesSueldo
	
	Definir modalidadSueldo como caracter
	Definir  ventas, salario, salarioHora, horasTrabajadas Como real
	
	Escribir  "Ingrese su modalidad de sueldo (a: comisiòn / b: Salario fijo + comision / c: salario fijo )"
	leer modalidadSueldo
	
	Segun modalidadSueldo Hacer
		
		"a": 
			Escribir " Favor ingrese el numero total de ventas en USD: "
			leer ventas
			
			salario = ventas * 0.4
			Escribir " Su salario es de $" salario
		"b": 
			
			Escribir " Favor ingrese el numero total de ventas en USD: "
			leer ventas
			
			Escribir "Ingrese su salario por hora: "
			leer salarioHora
			
			Escribir "Ingrese el nùmero de horas trabajadas en la semana"
			leer horasTrabajadas
			
			Si (horasTrabajadas <= 40) Y (horasTrabajadas > 0) Entonces
				
				salario = (salarioHora * horasTrabajadas) + (ventas * 0.25)
				
				Escribir "Su salario es de $" salario
			SiNo
				Si horasTrabajadas < 0 Entonces
					Escribir  "las horas ingresadas no son validas"
				Sino 
					Si horasTrabajadas > 40 Entonces
						salario = (salarioHora * 40) + (ventas * 0.25)
						
						Escribir "Su salario es de $" salario
					FinSi
				FinSi
			FinSi
			
		"c":
			
			Escribir "Ingrese su salario por hora: "
			leer salarioHora
			
			Escribir "Ingrese el nùmero de horas trabajadas en la semana"
			leer horasTrabajadas
			
			
			Si (horasTrabajadas > 0) Entonces
				
				salario = (salarioHora * 40) + ((horasTrabajadas * 0.5)*(horasTrabajadas-40))
				
				Escribir "Su salario es de $" salario
			SiNo
				Si horasTrabajadas < 0 Entonces
					Escribir  "las horas ingresadas no son validas"
			
				FinSi
			FinSi
			
			
	FinSegun
	
	
	
	
	
FinAlgoritmo
