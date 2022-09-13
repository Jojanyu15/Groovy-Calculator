Scanner scan = new Scanner(System.in);
def result
print("Ingrese el primer numero: ")
def numberA =  System.in.newReader().readLine() as BigInteger
print("Ingrese el segundo numero: ")
def numberB =  System.in.newReader().readLine() as BigInteger
print("Ingrese la expresión ( [ * ][ / ][ - ][ + ] ) : ")
expression = System.in.newReader().readLine()

switch(expression) { 
   case "*": 
        result = numberA*numberB
	print("El resultado de la multiplicacion entre " + numberA " y " + numberB + " es: "+ result)
        break;
   case "+": 
        result = numberA+numberB 
        print("El resultado de la suma entre " + numberA " y " + numberB + " es: "+ result)
        break;
   case "-": 
        result = numberA-numberB
        print("El resultado de la resta entre " + numberA " y " + numberB + " es: "+ result)
        break;
   case "/":
	result = numberA/numberB
        print("El resultado de la division entre " + numberA " y " + numberB + " es: "+ result)
        break;
    default:
        println("No hay un operador válido")
        break;
} 
