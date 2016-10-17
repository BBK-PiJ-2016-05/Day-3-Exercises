int count = 0
char test = "?"
char symbol = "?"
String firstNumberString = ""
String secondNumberString = ""
boolean firstNumberInput = true

print "Enter your equation: "
String str = System.console().readLine()

//check whether first number is negative
test = str.charAt(count)
if (test == "-"){
	firstNumberString = firstNumberString + test
	count = count + 1
}

//Loops through to find all the characters of the first number
while (firstNumberInput){
	test = str.charAt(count)
	if (test > "/" && test < ":"){
		firstNumberString = firstNumberString + test
	} else if (test == ".") {
		firstNumberString = firstNumberString + test
	} else if (test != " ") {
		firstNumberInput = false
	}
	count = count + 1
}

//inputs the next character as the symbol
symbol = str.charAt(count-1)

//assumes everything left is the second number
secondNumberString = str.substring(count)

//changes the strings to a double
double firstNumber = Double.parseDouble(firstNumberString)
double secondNumber = Double.parseDouble(secondNumberString)

//Carries out the calculation and outputs answer
switch (symbol) {
case "+":
println firstNumber + " plus " + secondNumber + " equals " + (firstNumber + secondNumber)
break
case "-":
println firstNumber + " minus " + secondNumber + " equals " + (firstNumber - secondNumber)
break
case "*":
println firstNumber + " times " + secondNumber + " equals " + (firstNumber * secondNumber)
break
case "/":
println firstNumber + " divided by " + secondNumber + " equals " + (firstNumber / secondNumber)
break
default:
println "We did not recognise your input"
break
}