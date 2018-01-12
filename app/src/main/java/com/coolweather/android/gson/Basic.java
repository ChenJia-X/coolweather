package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by man on 2018/1/12.
 */

public class Basic {
    @SerializedName("city")//使用该注解的原因：https://www.cnblogs.com/newcaoguo/p/6104884.html
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
