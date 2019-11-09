package com.example.consumirserviciorestful.interfaces;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UsuarioService {
    String API_ROUTE = "/usuario";

    @GET(API_ROUTE)
    Call<String> getPost();
}
