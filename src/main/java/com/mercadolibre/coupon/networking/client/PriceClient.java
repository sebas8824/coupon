package com.mercadolibre.coupon.networking.client;

import com.google.gson.Gson;
import com.mercadolibre.coupon.model.response.ItemResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PriceClient {

    @Value(value = "${networking.item.baseUrl}")
    private String itemsUrl;

    public ItemResponse fetchPriceByItemId(String itemId) throws Exception {
        Request request = new Request.Builder()
                .url(itemsUrl + itemId)
                .build();
        try {
            return new Gson().fromJson(
                    new OkHttpClient().newCall(request).execute().body().string()
                    ,ItemResponse.class);
        }
        catch (Exception e) {
            throw new Exception("The service is not returning any response");
        }
    }
}
