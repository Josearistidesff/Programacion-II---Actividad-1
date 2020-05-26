package com.example.loginaplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void Next (View view){
        Button Login = (Button)findViewById(R.id.bt_Login);
        String Username = ((EditText)findViewById(R.id.txt_Username)).getText().toString();
        String Password = ((EditText)findViewById(R.id.txt_Password)).getText().toString();
        if (Username.equals("jmartinez") && Password.equals("Jasmin0412")){

            Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
            Intent Next = new Intent(this,SecondActivity.class);
            startActivity(Next);


        } if (Username.equals("jmatos") && Password.equals("Jose0422")){

            Toast.makeText(MainActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
            Intent Next = new Intent(this,ThirdActivity.class);
            startActivity(Next);
        }
        else if  (Username.equals("") && Password.equals("")) {

            Toast.makeText(MainActivity.this,"Sorry, Username and Password Empty",Toast.LENGTH_SHORT).show();
        } else if (Username.equals("")){
            Toast.makeText(MainActivity.this,"Sorry, Username is empty",Toast.LENGTH_SHORT).show();
        } else if (Password.equals("")){
            Toast.makeText(MainActivity.this,"Sorry, Password is empty",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,"Sorry, User no registered",Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
