package com.raychengole.dukayangu.network;

import com.raychengole.dukayangu.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BestBuyRetrofitInstance {

    private static Retrofit retrofit = null;

    public static BestBuyApi getProducts(){
        if(retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BESTBUY_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(BestBuyApi.class);
    }

}
