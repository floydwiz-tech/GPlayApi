/*
 *     GPlayApi
 *     Copyright (C) 2020  Aurora OSS
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 */

package com.aurora.gplayapi.network

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface RetroService {
    @POST
    fun post(
            @Url url: String,
            @HeaderMap headers: Map<String, String>,
            @Body body: RequestBody
    ): Call<ResponseBody>

    @POST
    fun post(
            @Url url: String,
            @HeaderMap headers: Map<String, String>,
            @QueryMap params: Map<String, String>
    ): Call<ResponseBody>

    @GET
    operator fun get(
            @Url url: String,
            @HeaderMap headers: Map<String, String>,
            @QueryMap params: Map<String, String>
    ): Call<ResponseBody>

    @GET
    operator fun get(
            @Url url: String,
            @HeaderMap headers: Map<String, String>,
            @Body requestBody: RequestBody
    ): Call<ResponseBody>
}