package pgf.sb;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	public Button listenAgain, newGame;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnSetup();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	private void btnSetup() {
		listenAgain = (Button) findViewById(R.id.btnListenAgain);
		newGame = (Button) findViewById(R.id.btnNewGame);

		listenAgain.setOnClickListener(this);
		newGame.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnListenAgain:
			// play it again
			break;
		case R.id.btnNewGame:
			// clear and init a new game
			break;
		}
	}
}
