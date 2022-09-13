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
        break;
   case "+": 
        result = numberA+numberB 
        break;
   case "-": 
        result = numberA-numberB
        break;
   case "/":
	result = numberA/numberB
        break;
    default:
        println("No hay un operador válido")
        break;
} 
