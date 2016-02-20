package ahaaland.testapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActHome extends AppCompatActivity {
    EditText id1;
    EditText lat;
    EditText lon;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setupInput();
        setupButton();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_act_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupInput()
    {
        id1 = (EditText)findViewById(R.id.editID);
        lat = (EditText)findViewById(R.id.editLat);
        lon = (EditText)findViewById(R.id.editLongi);
        name = (EditText)findViewById(R.id.editType);

    }

    private void setupButton()
    {
        Button inBtn = (Button)findViewById(R.id.btnIn);
        inBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
                toast.makeText(ActHome.this, id1.getText(), toast.LENGTH_SHORT).show();
                toast.makeText(ActHome.this, lat.getText(), toast.LENGTH_SHORT).show();
                toast.makeText(ActHome.this, lon.getText(), toast.LENGTH_SHORT).show();
                toast.makeText(ActHome.this, name.getText(), toast.LENGTH_SHORT).show();
            }
        });
    }
}
