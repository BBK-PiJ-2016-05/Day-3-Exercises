
class Point {
	double x
	double y
}

class Rectangle {
	Point upLeft = new Point()
	Point downRight = new Point()
}	

Rectangle myRectangle = new Rectangle()

print "Please enter the X coordinate of the upper left corner: "
myRectangle.upLeft.x = Double.parseDouble(System.console().readLine())
print "Please enter the Y coordinate of the upper left corner: "
myRectangle.upLeft.y = Double.parseDouble(System.console().readLine())
print "Please enter the X coordinate of the lower right corner: "
myRectangle.downRight.x = Double.parseDouble(System.console().readLine())
print "Please enter the Y coordinate of the lower right corner: "
myRectangle.downRight.y = Double.parseDouble(System.console().readLine())

double length = Math.abs(myRectangle.upLeft.x - myRectangle.downRight.x)
double width = Math.abs(myRectangle.upLeft.y - myRectangle.downRight.y)

println "The area of your rectangle is " + (length * width)
println "The perimeter of your rectangle is " + (2 * (length + width))

