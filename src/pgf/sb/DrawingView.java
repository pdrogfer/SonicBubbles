package pgf.sb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class DrawingView extends View{
	// native variables
	private int paintColor = 0xff60000;
	private Canvas drawCanvas;
	private Bitmap canvasBitmap;
	
	// constructors
	public DrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setupDrawing();
	}
	
	private void setupDrawing() {
		// TODO Auto-generated method stub
		
	}
	
	// methods
	


}
