package ir.shariaty.onlinetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import ir.shariaty.onlinetranslator.Models.Model;
import ir.shariaty.onlinetranslator.RequestHolder.ApiClient;
import ir.shariaty.onlinetranslator.RequestHolder.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class HomeActivity extends AppCompatActivity {

    TextView tvfromlang,tvtolang;
    ImageButton changelanBtn , translate_btn;
    String langinducter;
    EditText inputtext;


    //response variabels container
    String title,title_en,source,text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //change language btn
        tvfromlang=(TextView)findViewById(R.id.tvfromlang);
        tvtolang=(TextView)findViewById(R.id.tvtolang);
        changelanBtn=(ImageButton)findViewById(R.id.changelangBtn);
        translate_btn=(ImageButton)findViewById(R.id.translate_btn);
        inputtext=(EditText)findViewById(R.id.inputtext);
        langDB();


        changelanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputtext.getText().clear();
                langinducter=tvfromlang.getText().toString();
                tvfromlang.setText(tvtolang.getText().toString());
                tvtolang.setText(langinducter);

                //hint text
                if(inputtext.getHint().equals("Enter Text")){
                    inputtext.setHint("متن را وارد كنيد");
                    inputtext.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
                }

                else {
                    inputtext.setHint("Enter Text");
                    inputtext.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
                }
                langDB();

            }
        });


        //api request and show translate to next page
        translate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(HomeActivity.this, "Loading data..", Toast.LENGTH_SHORT).show();
                //langDB();

                //next page intent
                Intent result=new Intent(HomeActivity.this,Translate_activity.class);


                getApiResponse().enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {

                        if(!response.isSuccessful() )
                            Toast.makeText(HomeActivity.this, "error response", Toast.LENGTH_SHORT).show();
                        try {

                            title=response.body().getData().getResults().get(0).getTitle();
                            title_en=response.body().getData().getResults().get(0).getTitle_en();
                            source=response.body().getData().getResults().get(0).getSource();
                            text=response.body().getData().getResults().get(0).getText();

                            //send data to next page by result Intent
                            result.putExtra("title",title);
                            result.putExtra("title_en",title_en);
                            result.putExtra("source",source);
                            result.putExtra("text",text);
                            startActivity(result);
                        }
                        catch (Exception e){
                            Toast.makeText(HomeActivity.this, "error occured. try again", Toast.LENGTH_SHORT).show();
                            e.printStackTrace();
                        }




                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        Toast.makeText(HomeActivity.this, "error response", Toast.LENGTH_SHORT).show();
                        call.cancel();

                    }
                });




            }
        });

    }


    //sending request data to api method (token,q,type,filter)
    private Call<Model> getApiResponse(){


        return  ApiClient.getApiInterface().getTranslateData("68404.IWDkRdkfz9SzV5i9vFfUhFiajuU1bwKeJN0LobIK"
                ,inputtext.getText().toString().trim()
                ,"exact"
                ,langDB());
        //(inputtext.getText().toString().trim()
    }


    // selected translator
    private String langDB(){
        if(tvfromlang.getText().toString().equals("English")) {
            return "en2fa";
        }
        else {
            inputtext.setHint("متن را وارد كنيد");
            return "dehkhoda";
        }
    }
}