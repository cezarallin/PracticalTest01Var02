package ro.pub.cs.systems.eim.practicaltest01var02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class PracticalTest01Var02MainActivity extends Activity {
	
	  private EditText editText1 = null;
	  private EditText editText2 = null;
	  private EditText editText3 = null;
	  private EditText editText4 = null;
	  private Button setButton = null;
	  

	  private ButtonClickListener buttonClickListener = new ButtonClickListener();
	  private class ButtonClickListener implements View.OnClickListener {
	    @Override
	    public void onClick(View view) {
	      switch(view.getId()) {
	        case R.id.button1:
	        	if(editText1.getText().toString().matches("[0-9]+") && editText2.getText().toString().matches("[0-9]+")
	        			&& editText3.getText().toString().matches("[0-9]+") && editText4.getText().toString().matches("[0-9]+")){
	        		
	        	}

	        	String result = editText2.getText().toString() + editText3.getText().toString()
	        			+editText1.getText().toString() +editText4.getText().toString();
	          break;
	      }
	    }
	  }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_var02_main);
        
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        editText4 = (EditText)findViewById(R.id.editText4);
     
        setButton = (Button)findViewById(R.id.button1);
        
        setButton.setOnClickListener(buttonClickListener); 
        
      /*  Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey("numberOfClicks")) {
            
          }*/

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
}
