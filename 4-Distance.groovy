
class Point {
	double x;
	double y;
}

Point point1 = new Point()
Point point2 = new Point()
Point point3 = new Point()



print "Please enter the X coordinate of the first point: "
String str = System.console().readLine()
double input = Double.parseDouble(str)
point1.x = input
print "Please enter the Y coordinate of the first point: "
str = System.console().readLine()
input = Double.parseDouble(str)
point1.y = input
print "Please enter the X coordinate of the second point: "
str = System.console().readLine()
input = Double.parseDouble(str)
point2.x = input
print "Please enter the Y coordinate of the second point: "
str = System.console().readLine()
input = Double.parseDouble(str)
point2.y = input
print "Please enter the X coordinate of the third point: "
str = System.console().readLine()
input = Double.parseDouble(str)
point3.x = input
print "Please enter the Y coordinate of the third point: "
str = System.console().readLine()
input = Double.parseDouble(str)
point3.y = input

double distance1to2 = Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y))
double distance2to3 = Math.sqrt((point3.x - point2.x) * (point3.x - point2.x) + (point3.y - point2.y) * (point3.y - point2.y))
double distance1to3 = Math.sqrt((point1.x - point3.x) * (point1.x - point3.x) + (point1.y - point3.y) * (point1.y - point3.y))

if (distance1to2 < distance2to3 && distance1to2 < distance1to3) {
	println "The closest are points 1 and 2"
} else if (distance1to3 < distance2to3 && distance1to3 < distance1to2) {
	println "The closest are points 1 and 3"
} else {
	println "The closest are points 2 and 3"
}