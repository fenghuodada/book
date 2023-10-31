package com.android.tool.apps;

import com.android.tool.bean.CountryBean;
import com.android.tool.bean.ListServerBean;
import com.android.tool.bean.LocalBean;
import com.android.tool.bean.TitleBean;
import io.reactivex.rxjava3.core.AbstractC10151d;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;

/* renamed from: com.android.tool.apps.a */
/* loaded from: classes.dex */
public interface InterfaceC2547a {
    @POST
    /* renamed from: a */
    AbstractC10151d<TitleBean> m9379a(@Url String str, @Query("local") String str2, @Query("version") String str3);

    @GET
    /* renamed from: b */
    AbstractC10151d<CountryBean> m9378b(@Url String str);

    @GET
    /* renamed from: c */
    AbstractC10151d<LocalBean> m9377c(@Url String str);

    @POST
    /* renamed from: d */
    AbstractC10151d<ListServerBean> m9376d(@Url String str, @Query("local") String str2, @Query("version") String str3);
}
