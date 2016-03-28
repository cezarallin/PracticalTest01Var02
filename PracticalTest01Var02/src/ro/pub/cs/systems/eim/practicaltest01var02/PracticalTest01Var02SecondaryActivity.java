package ro.pub.cs.systems.eim.practicaltest01var02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PracticalTest01Var02SecondaryActivity extends Activity {
	
	private final static int SECONDARY_ACTIVITY_REQUEST_CODE = 1;
	
	  private EditText editText1 = null;
	  private EditText editText2 = null;
	  private EditText editText3 = null;
	  private EditText editText4 = null;
	  private Button sumButton = null;
	  private Button productButton = null;


	  private ButtonClickListener buttonClickListener = new ButtonClickListener();
	  private class ButtonClickListener implements View.OnClickListener {
	    @Override
	    public void onClick(View view) {
	      switch(view.getId()) {
	        case R.id.button1:
	        	int sum = Integer.parseInt(editText1.getText() + editText2.getText().toString()
	        			+ editText3.getText().toString() +editText4.getText().toString());
	          break;
	        case R.id.button2:
	        	int product = Integer.parseInt(editText1.getText() + editText2.getText().toString()
	        			+ editText3.getText().toString() + editText4.getText().toString());
	          break;
	      }
	      finish();
	    }
	  }
	  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_secondary_activity);
        
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
        
        editText1.setEnabled(false);
        editText2.setEnabled(false);
        editText3.setEnabled(false);
        editText4.setEnabled(false);
        
        
        sumButton = (Button)findViewById(R.id.button1);
        productButton = (Button)findViewById(R.id.button2);
        
        sumButton.setOnClickListener(buttonClickListener);
        productButton.setOnClickListener(buttonClickListener); 

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_var02_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
      if (requestCode == SECONDARY_ACTIVITY_REQUEST_CODE) {
        Toast.makeText(this, "The activity returned with result " + resultCode, Toast.LENGTH_LONG).show();
      }
    }
}
