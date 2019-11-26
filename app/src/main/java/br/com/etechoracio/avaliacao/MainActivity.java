package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.com.etechoracio.avaliacao.service.CuboApiService;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class MainActivity extends AppCompatActivity {


     private EditText editNum1;
     private EditText editNum2;

    public MainActivity(EditText editNum1, EditText editNum2) {
        this.editNum1 = editNum1;
        this.editNum2 = editNum2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void  onProcessar(View v){

        CuboApiService service = new Retrofit.Builder().baseUrl("http://172.16.58.22:8001/api/funcoes/cubo")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(CuboApiService.class);

        Call<Void> call = service.executar();

    }

}
