/* Hello World in Groovy */
Scanner scan = new Scanner(System.in);
print("Ingrese el primer numero: ")
def numberA =  System.in.newReader().readLine() as Integer
print("Ingrese el segundo numero: ")
def numberB =  System.in.newReader().readLine() as Integer
print("Ingrese la expresión ( [ * ][ / ][ - ][ + ] ) : ")
expression = System.in.newReader().readLine()
switch(expression) { 
   case "*": 
        println(numberA*numberB)
        break;
   case "+": 
        println(numberA+numberB) 
        break;
   case "-": 
        println(numberA-numberB)
        break;
   case "/":
        println(numberA/numberB)
        break;
    default:
        println("No hay un operador válido")
        break;
} 
