package com.example.consumirserviciorestful.interfaces;

import com.example.consumirserviciorestful.model.Post;
import com.example.consumirserviciorestful.model.Rol;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface UsuarioService {
    String API_ROUTE = "/usuario";
    String API_ROUTE_ROL = "/rol";

    @GET(API_ROUTE)
    Call<String> getPost();

    @POST(API_ROUTE_ROL)
    @Headers({
            "Content-Type: application/json;charset=utf-8",
            "Accept: application/json;charset=utf-8",
            "Cache-Control: max-age=640000"
    })
    Call<Rol> savePost(@Body Rol rol);
}
