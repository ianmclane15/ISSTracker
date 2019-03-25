package com.hfad.pokemonapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ISService {
    // we know the baseURL is http://recipepuppy.com
    // so the following generation
    // http://recipepuppy.com/api?i=ingredients&qq = recipeKeywords
    //@symbol refers to annotation
    @GET("iss-now.json/")
    Call<ISStatus> GetLocation();
}

