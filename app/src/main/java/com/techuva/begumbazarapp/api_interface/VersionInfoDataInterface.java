package com.techuva.begumbazarapp.api_interface;

import com.google.gson.JsonElement;
import com.techuva.begumbazarapp.model.VersionInfoMainObject;
import com.techuva.begumbazarapp.model.VersionInfoPostParameters;
import com.techuva.begumbazarapp.utils.Constants;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;


public interface VersionInfoDataInterface {
    @POST(Constants.VersionCheck)
    Call<JsonElement>  getStringScalar(@Body VersionInfoPostParameters postParameter);

    @POST(Constants.VersionCheck)
    Call<VersionInfoMainObject>  getStringScalarWithSession(@Header("authUser") int headerValue, @Header("authorization") String authorization, @Body VersionInfoPostParameters postParameter);
}
