package ir.shariaty.onlinetranslator.RequestHolder;

import java.util.ArrayList;
import java.util.List;

import ir.shariaty.onlinetranslator.Models.Model;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("v3/search")
    Call<Model> gettranslatedata(@Query("token") String token
                                 , @Query("q") String q
                                 , @Query("type") String type
                                 ,@Query("filter") String filter);
}
