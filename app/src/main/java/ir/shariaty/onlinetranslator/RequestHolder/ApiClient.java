package ir.shariaty.onlinetranslator.RequestHolder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_URL="http://api.vajehyab.com/v3/";
    private static Retrofit retrofit;

    public static  Retrofit getClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static ApiInterface apiInterface =getClient().create(ApiInterface.class);

    public static ApiInterface getApiInterface(){
        return apiInterface;
    }

}
