package ir.shariaty.onlinetranslator.RequestHolder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_URL="https://www.vajehyab.com/";
    private static Retrofit retrofit=null;

    public static  Retrofit getClient(){
        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    private static ApiInterface apiInterface =retrofit.create(ApiInterface.class);

    public static ApiInterface getApiInterface(){
        return apiInterface;
    }

}
