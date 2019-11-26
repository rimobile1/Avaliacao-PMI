package br.com.etechoracio.avaliacao.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CuboApiService {

    @POST("Cubo")
    Call<String> executar(@Body Request request);

}
