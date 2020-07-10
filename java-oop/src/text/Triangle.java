package text;

public class Triangle extends Diagram{
	@Override
	double getArea() {
		return height * width / 2;
	}

}
