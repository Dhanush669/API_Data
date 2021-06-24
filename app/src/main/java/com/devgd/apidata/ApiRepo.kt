package com.devgd.apidata

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class ApiRepo(val application:Application) {
    var mutableList = MutableLiveData<List<ApiModelClass>>()
    val list = ArrayList<ApiModelClass>()
    var TAG="ERROR"

    fun getData(): MutableLiveData<List<ApiModelClass>> {
        val url = "https://www.cryptingup.com/api/markets"
        val queue = Volley.newRequestQueue(application)
        val stringRequest = StringRequest(
                Request.Method.GET, url,
                Response.Listener<String> { response ->
                    val jsonObj= JSONObject(response)
                    val jsonArray=jsonObj.getJSONArray("markets")
                    for (i in 0 until jsonArray.length()) {
                        val jobject = jsonArray.getJSONObject(i)
                        val exchange = jobject.getString("exchange_id")
                        val symbol = jobject.getString("symbol")
                        val status = jobject.getString("status")
                        val volume = jobject.getString("volume_24h")
                        val pricunc = jobject.getDouble("price_unconverted").toString()
                        val price = jobject.getDouble("price").toString()
                        val change = jobject.getDouble("change_24h").toString()
                        val spread = jobject.getDouble("spread").toString()
                        val time = jobject.getString("time")
                        list.add(ApiModelClass(exchange,symbol,pricunc,price,change,spread,volume,status,
                        time))
                    }
                    mutableList.value=list
                },
                Response.ErrorListener {
                    Log.i(TAG,"Unable to get Data!")
                })

        queue.add(stringRequest)

        return mutableList
    }
}