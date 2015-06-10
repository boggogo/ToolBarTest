package koemdzhiev.com.toolbartest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_search){
            Toast.makeText(this,"SEARCH",Toast.LENGTH_LONG).show();
        }else if(id == R.id.action_user){
            Toast.makeText(this,"User",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Overflow",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
