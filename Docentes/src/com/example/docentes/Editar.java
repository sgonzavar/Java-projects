package com.example.docentes;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Editar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_editar);
	}
	
	public void listadoOnClick(View view){
		startActivity(new Intent(this, ListarDocentes.class));
		
		
	}

	public void EnviarOnClik(View view) {
		Thread nt = new Thread() {
			@Override
			public void run() {
				EditText apellidos = (EditText) findViewById(R.id.txtApe);
				EditText nombres = (EditText) findViewById(R.id.txtNom);
				EditText telefono = (EditText) findViewById(R.id.txtTelf);
				EditText email = (EditText) findViewById(R.id.txtEmail);
				EditText ciudad = (EditText) findViewById(R.id.txtCiudad);
				EditText curso = (EditText) findViewById(R.id.txtCurso);
				EditText codigo= (EditText) findViewById(R.id.txtCod);

				try {
					final String res;
					final EditText nom = (EditText) findViewById(R.id.txtNom);
					
						res = enviarGet(apellidos.getText().toString(), nombres.getText().toString(), telefono.getText().toString(), email.getText().toString(), ciudad.getText().toString(), curso.getText().toString(), codigo.getText().toString());
					

					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							Toast.makeText(Editar.this, "USUARIO : "+nom.getText().toString()+" ACTUALIZADO... CORRECTAMENTE",
									Toast.LENGTH_LONG).show();
						}
					});
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		};
		nt.start();
	}
/*
	public String enviarPost(String apellidos, String nombres, String telefono, String email, String ciudad, String curso, String codigo) {

		HttpClient httpClient = new DefaultHttpClient();
		HttpContext localContext = new BasicHttpContext();
		HttpPost httpPost = new HttpPost(
				"http://tuipaqui/PutData/ModData.php");
		HttpResponse response = null;
		try {
			List<NameValuePair> params = new ArrayList<NameValuePair>(3);
			params.add(new BasicNameValuePair("apellidos", apellidos));
			params.add(new BasicNameValuePair("nombres", nombres));
			params.add(new BasicNameValuePair("telefono", telefono));
			params.add(new BasicNameValuePair("email", email));
			params.add(new BasicNameValuePair("ciudad", ciudad));
			params.add(new BasicNameValuePair("curso", curso));
			params.add(new BasicNameValuePair("codigo", codigo));
			httpPost.setEntity(new UrlEncodedFormEntity(params));
			response = httpClient.execute(httpPost, localContext);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return response.toString();

	}*/

	public String enviarGet(String apellidos, String nombres, String telefono, String email, String ciudad, String curso, String codigo) {
		HttpClient httpClient = new DefaultHttpClient();
		HttpContext localContext = new BasicHttpContext();
		HttpResponse response = null;
		String parametros = "?apellidos=" + apellidos + "&nombres=" + nombres
				+ "&telefono=" + telefono + "&email=" + email + "&ciudad=" + ciudad + "&curso=" + curso + "&codigo=" + codigo;

		HttpGet httpget = new HttpGet(
				"http://tuipaqui/PutData/ModData.php" + parametros);
		try {
			response = httpClient.execute(httpget, localContext);

		} catch (Exception e) {
		
		}
		return response.toString();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.editar, menu);
		return true;
	}

}