/* this is the class for the bubbles, or dots. Implement
 * set and get position (posX, posY), on click, etc
 */

package pgf.sb;

public class Dot {
	
	// native variables
	int posX, posY;
	int radius;
	
	// constructors
	public Dot(int x, int y) {
		posX = x;
		posY = y;
	}
	// methods
	
	public void onDraw() {
		
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}
