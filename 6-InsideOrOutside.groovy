
class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft = new Point()
	Point downRight = new Point()
}	

Rectangle myRectangle = new Rectangle()
Point thirdPoint = new Point()
boolean inside = true

//Ask user to input the rectangle
print "Please enter the X coordinate of the upper left corner: "
myRectangle.upLeft.x = Double.parseDouble(System.console().readLine())
print "Please enter the Y coordinate of the upper left corner: "
myRectangle.upLeft.y = Double.parseDouble(System.console().readLine())
print "Please enter the X coordinate of the lower right corner: "
myRectangle.downRight.x = Double.parseDouble(System.console().readLine())
print "Please enter the Y coordinate of the lower right corner: "
myRectangle.downRight.y = Double.parseDouble(System.console().readLine())

//Ask user to input a third point
print "Please enter the X coordinate of a third point: "
thirdPoint.x = Double.parseDouble(System.console().readLine())
print "Please enter the Y coordinate of a third point: "
thirdPoint.y = Double.parseDouble(System.console().readLine())

//Checks if the third point is inside the rectangle
if (Math.abs(myRectangle.upLeft.x - thirdPoint.x) > Math.abs(myRectangle.upLeft.x - myRectangle.downRight.x)) {
	inside = false	
}
if (Math.abs(myRectangle.upLeft.y - thirdPoint.y) > Math.abs(myRectangle.upLeft.y - myRectangle.downRight.y)) {
	inside = false	
}

//Outputs outcome
if (inside) {
	print "Your point is inside the rectangle"
} else {
	print "Your point is outside the rectangle"
}




