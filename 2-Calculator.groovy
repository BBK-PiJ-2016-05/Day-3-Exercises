print "Enter your first number: "
String str = System.console().readLine()
double firstNumber = Double.parseDouble(str)
print "Enter your second number: "
str = System.console().readLine()
double secondNumber = Double.parseDouble(str)
println "Please choose from the following options"
println "For ’Addition’, please enter 1"
println "For ’Subtraction’, please enter 2"
println "For ’Mulitplication’, please enter 3"
println "For ’Division’, please enter 4"
str = System.console().readLine()
Integer choice = Integer.parseInt(str)
switch (choice) {
case 1:
println firstNumber + " plus " + secondNumber + " equals " + (firstNumber + secondNumber)
break
case 2:
println firstNumber + " minus " + secondNumber + " equals " + (firstNumber - secondNumber)
break
case 3:
println firstNumber + " times " + secondNumber + " equals " + (firstNumber * secondNumber)
break
case 4:
println firstNumber + " divided " + secondNumber + " equals " + (firstNumber / secondNumber)
break
default:
println "We did not recognise your input"
break
}