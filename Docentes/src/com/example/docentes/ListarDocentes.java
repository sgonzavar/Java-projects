package com.example.docentes;

import java.util.ArrayList;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class ListarDocentes extends Activity {
	Button Editar,Eliminar,Buscar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar_docentes);
		Buscar=(Button)findViewById(R.id.btnBuscar);
		Editar=(Button)findViewById(R.id.btnEditar);
		Eliminar=(Button)findViewById(R.id.btnEliminar);
		
		Thread tr = new Thread(){
			@Override
			public void run(){
				final String Resultado = leer();
				runOnUiThread(
						new Runnable() {
				
							@Override
							public void run() {
									cargaListado(obtDatosJSON(Resultado));
							}
						});
			}			
		};
		tr.start();
		Buscar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(ListarDocentes.this,Buscar.class));  		
        	     }
        });
		Editar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(ListarDocentes.this,Editar.class));  		
        	     }
        });
		Eliminar.setOnClickListener(new OnClickListener(){
        	public void onClick(View arg0){
        		
        	startActivity(new Intent(ListarDocentes.this,Eliminar.class));  		
        	     }
        });
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.listar_docentes, menu);
		return true;
	}
	
	public void cargaListado(ArrayList<String> datos){
		ArrayAdapter<String> adaptador =
			new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);
		ListView listado = (ListView) findViewById(R.id.listView1);
		listado.setAdapter(adaptador);
	}
	
	public String leer(){
		HttpClient cliente =new DefaultHttpClient();
		HttpContext contexto = new BasicHttpContext();
		HttpGet httpget = new HttpGet("http://tuipaqui/PutData/GetData.php");
		String resultado=null;
		try {
			HttpResponse response = cliente.execute(httpget,contexto);
			HttpEntity entity = response.getEntity();
			resultado = EntityUtils.toString(entity, "UTF-8");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return resultado;
	}
	
	public ArrayList<String> obtDatosJSON(String response){
		ArrayList<String> listado= new ArrayList<String>();
		try {
			JSONArray json= new JSONArray(response);
			String texto="";
			for (int i=0; i<json.length();i++){
				texto ="=============================="+"\n"+" CODIGO: "+json.getJSONObject(i).getString("id_prof")+"\n"+
				" APELLIDOS: "+json.getJSONObject(i).getString("ape_prof")+"\n"+
				" NOMBRES: "+json.getJSONObject(i).getString("nom_prof")+"\n"+
				" TELEFONO: "+json.getJSONObject(i).getString("telefono")+"\n"+
				" EMAIL: "+json.getJSONObject(i).getString("email")+"\n"+
				" CIUDAD: "+json.getJSONObject(i).getString("ciudad")+"\n"+
				" CURSO: "+json.getJSONObject(i).getString("cod_curso");
				listado.add(texto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listado;
	}

}