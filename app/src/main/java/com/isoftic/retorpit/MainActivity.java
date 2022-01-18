package com.isoftic.retorpit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.isoftic.retorpit.models.BaseModel;
import com.isoftic.retorpit.network.JsonPlaceHolderApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private JsonPlaceHolderApi jsonPlaceHolderApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textResult);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coindesk.com/v1/bpi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        getCurrency();
    }


    private void getCurrency() {
        Call<BaseModel> call = jsonPlaceHolderApi.getAll();
        call.enqueue(new Callback<BaseModel>() {
            @Override
            public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                if (!response.isSuccessful()){
                    textView.setText("code: " + response.code());
                    return;
                }
               BaseModel BaseModels = response.body();

                String content = "";
                content += "time: \n";
                content += "updated: " + BaseModels.getTime().getUpdated() + "\n";
                content += "updatedISO: " + BaseModels.getTime().getUpdatedISO() + "\n";
                content += "updateduk: " + BaseModels.getTime().getUpdateduk()+ "\n";

                content += "\n";
                content += "disclaimer: \n" + BaseModels.getDisclaimer() + "\n";

                content += "\n";
                content += "chartName: \n" + BaseModels.getChartName() + "\n";

                content += "\n";
                content += "BPI: \n";

                content += "\n";
                content += "USD: \n";
                content += "code: " + BaseModels.getBpi().getUsd().getCode() + "\n";
                content += "symbol: " + BaseModels.getBpi().getUsd().getSymbol()+ "\n";
                content += "rate: " + BaseModels.getBpi().getUsd().getRate() + "\n";
                content += "description: " + BaseModels.getBpi().getUsd().getDescription() + "\n";
                content += "rate_float: " + BaseModels.getBpi().getUsd().getRateFloat() + "\n";

                content += "\n";
                content += "EUR: \n";
                content += "code: " + BaseModels.getBpi().getEur().getCode() + "\n";
                content += "symbol: " + BaseModels.getBpi().getEur().getSymbol()+ "\n";
                content += "rate: " + BaseModels.getBpi().getEur().getRate() + "\n";
                content += "description: " + BaseModels.getBpi().getEur().getDescription() + "\n";
                content += "rate_float: " + BaseModels.getBpi().getEur().getRateFloat() + "\n";

                content += "\n";
                content += "GBP: \n";
                content += "code: " + BaseModels.getBpi().getGbp().getCode() + "\n";
                content += "symbol: " + BaseModels.getBpi().getGbp().getSymbol()+ "\n";
                content += "rate: " + BaseModels.getBpi().getGbp().getRate() + "\n";
                content += "description: " + BaseModels.getBpi().getGbp().getDescription() + "\n";
                content += "rate_float: " + BaseModels.getBpi().getGbp().getRateFloat() + "\n";

                textView.append(content);

            }
            @Override
            public void onFailure(Call<BaseModel> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
    }
}