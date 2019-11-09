package com.example.consumirserviciorestful;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.consumirserviciorestful.interfaces.UsuarioService;
import com.example.consumirserviciorestful.model.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    ListView list;
    Usuario usuario;
    ArrayList<Usuario> listUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        fetchJSON();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "" + listUsuarios.get(position).getUsuId(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void fetchJSON() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.75.199.25:88")
                //.baseUrl("http://192.168.0.4:88")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        UsuarioService usuarioService = retrofit.create(UsuarioService.class);

        Call<String> call = usuarioService.getPost();

        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.i("Responsestring", response.body());
                //Toast.makeText()
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Log.i("onSuccess", response.body().toString());

                        String jsonresponse = response.body().toString();
                        spinJSON(jsonresponse);

                    } else {
                        Log.i("onEmptyResponse", "Returned empty response");//Toast.makeText(getContext(),"Nothing returned",Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.i("onFailure", "Returned Error conexion");
                Toast.makeText(MainActivity.this, "Error conexion", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void spinJSON(String response) {
        try {
            JSONObject obj = new JSONObject(response);
            if (obj.optString("status").equals("200")) {

                listUsuarios = new ArrayList<>();
                JSONArray dataArray = obj.getJSONArray("data");
                Log.i("onSuccessArray", dataArray.toString());

                for (int i = 0; i < dataArray.length(); i++) {
                    JSONObject dataobj = dataArray.getJSONObject(i);
                    usuario = new Usuario();
                    Log.i("onSuccessObject", dataobj.toString());

                    usuario.setUsuId(dataobj.getInt("usuId"));
                    usuario.setUsuIdentificacion(dataobj.getString("usuIdentificacion"));
                    usuario.setUsuNombres(dataobj.getString("usuNombres"));
                    usuario.setUsuGenero(dataobj.getString("usuGenero"));
                    usuario.setUsuCorreo(dataobj.getString("usuCorreo"));
                    usuario.setUsuTelefono(dataobj.getString("usuTelefono"));
                    usuario.setUsuAvatar(dataobj.getString("usuAvatar"));
                    usuario.setUsuAvatar(dataobj.getJSONObject("fkTipoIdentificacion").getString("tidId"));

                    listUsuarios.add(usuario);
                }
                ArrayList listNombres = new ArrayList<>();
                for (int i = 0; i < listUsuarios.size(); i++) {
                    listNombres.add(listUsuarios.get(i).getUsuNombres());
                }

                ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listNombres);
                spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
                list.setAdapter(spinnerArrayAdapter);

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

}

