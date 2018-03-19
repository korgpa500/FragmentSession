package com.example.yousryelwrdany.fragmentsession;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    Button btnOpenSecond;
    FragHome fragHome;
    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButton);
        btnOpenSecond = findViewById(R.id.btnOpenSecond);


        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this,"open Screen",Toast.LENGTH_SHORT).show();
                    manager = getFragmentManager();
                    transaction = manager.beginTransaction();
                    fragHome = new FragHome();
                    transaction.add(R.id.linearFrag,fragHome,"frag_home");
                    transaction.commit();
                }else{
                    Toast.makeText(MainActivity.this,"Close Screen",Toast.LENGTH_SHORT).show();
                    manager = getFragmentManager();
                    fragHome = (FragHome) manager.findFragmentByTag("frag_home");
                    transaction = manager.beginTransaction();
                    if(fragHome != null){
                        transaction.remove(fragHome);
                        transaction.commit();
                    }else{
                        Toast.makeText(MainActivity.this,"Screen Not Found",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,tabActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
