package com.example.gupta.retrofitexample.Model;

/**
 * Created by Gupta on 6/2/2017.
 */

import com.example.gupta.retrofitexample.Model.SOAnswersResponse;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers();

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse> getAnswers(@Query("tagged") String tags);
}