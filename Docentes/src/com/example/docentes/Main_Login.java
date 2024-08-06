package com.example.docentes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Main_Login extends Activity {
	EditText Usuario,Password;
	Button Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__login);
        Usuario=(EditText)findViewById(R.id.txtUsuario);
        Password=(EditText)findViewById(R.id.txtPass);
        Ingresar=(Button)findViewById(R.id.btnIngresar);
        Ingresar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		if(Usuario.getText().toString().equals("admin")&&Password.getText().toString().equals("1234"))
        		{
        	startActivity(new Intent(Main_Login.this,MenuPrincipal.class));
        	Toast.makeText(Ingresar.getContext(),"Bienvenido "+Usuario.getText().toString(),Toast.LENGTH_SHORT).show();
        		}
        		else
        		{
        			Toast.makeText(Ingresar.getContext(),"Datos Incorrectos",Toast.LENGTH_SHORT).show();	
        		}
        		
        		
        	     }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main__login, menu);
        return true;
    }
    
}
