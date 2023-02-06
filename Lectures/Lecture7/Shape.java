

class Shape {

  record Point(double x, double y) { }
	
  private Point p;

  public Shape(Point p) {
    this.p = p;
  }

  public Point getPoint() {
    return p;
  }
  
  public static void main(String[] args){
  	  Point p = new Point(10, 20);
  	  Shape s = new Shape(p);
  	  Point point = s.getPoint();
  	  System.out.println(point.x());
  	  System.out.println(point.y());

  }
}


