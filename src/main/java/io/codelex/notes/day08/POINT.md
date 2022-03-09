#Points

Create a class Point that contains x and y coordinates.
Create a method in Point class named distanceTo, that receives another Point as a parameter and calculates distance between them.

See example:
```java
Point p1 = new Point(-2, -4);
Point p2 = new Point(10, 5);

BigDecimal distance = p1.distanceTo(p2);

System.out.println(distance); //should print out 15
```

Hint: the mathematical formula of distance between two points is:
`D=SQRT((𝑥2−𝑥1)^2+(𝑦2−𝑦1)^2)`