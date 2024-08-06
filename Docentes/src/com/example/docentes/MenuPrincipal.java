package com.example.docentes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;;

public class MenuPrincipal extends Activity {
	Button Registrar,Mostrar,Buscar,Editar,Eliminar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_principal);
		Registrar=(Button)findViewById(R.id.btnRegistrar);
		Mostrar=(Button)findViewById(R.id.btnMostrar);
		Buscar=(Button)findViewById(R.id.btnBuscar);
		Editar=(Button)findViewById(R.id.btnEditar);
		Eliminar=(Button)findViewById(R.id.btnEliminar);
		
		//CLICK BOTONES
		Registrar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(MenuPrincipal.this,Registrar.class));  		
        	     }
        });
		Mostrar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(MenuPrincipal.this,ListarDocentes.class));  		
        	     }
        });
		Buscar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(MenuPrincipal.this,Buscar.class));  		
        	     }
        });
		Editar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(MenuPrincipal.this,Editar.class));  		
        	     }
        });
		Eliminar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(MenuPrincipal.this,Eliminar.class));  		
        	     }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_principal, menu);
		return true;
	}

}
