package com.vungle.warren.network;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.gson.C8695r;
import com.vungle.warren.network.converters.C9895b;
import com.vungle.warren.network.converters.C9896c;
import com.vungle.warren.network.converters.InterfaceC9894a;
import java.util.Map;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* renamed from: com.vungle.warren.network.f */
/* loaded from: classes3.dex */
public final class C9902f implements VungleApi {

    /* renamed from: d */
    public static final C9896c f19884d = new C9896c();

    /* renamed from: e */
    public static final C9895b f19885e = new C9895b();
    @VisibleForTesting

    /* renamed from: a */
    public final HttpUrl f19886a;
    @VisibleForTesting

    /* renamed from: b */
    public final Call.Factory f19887b;
    @VisibleForTesting

    /* renamed from: c */
    public String f19888c;

    public C9902f(@NonNull HttpUrl httpUrl, @NonNull Call.Factory factory) {
        this.f19886a = httpUrl;
        this.f19887b = factory;
    }

    /* renamed from: a */
    public final C9897d m1429a(String str, @NonNull String str2, @Nullable Map map, InterfaceC9894a interfaceC9894a) {
        HttpUrl.Builder newBuilder = HttpUrl.get(str2).newBuilder();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return new C9897d(this.f19887b.newCall(m1427c(str, newBuilder.build().toString()).get().build()), interfaceC9894a);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> ads(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    /* renamed from: b */
    public final C9897d m1428b(String str, @NonNull String str2, C8695r c8695r) {
        return new C9897d(this.f19887b.newCall(m1427c(str, str2).post(RequestBody.create((MediaType) null, c8695r != null ? c8695r.toString() : "")).build()), f19884d);
    }

    @NonNull
    /* renamed from: c */
    public final Request.Builder m1427c(@NonNull String str, @NonNull String str2) {
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", str).addHeader("Vungle-Version", "5.10.0").addHeader("Content-Type", "application/json");
        if (!TextUtils.isEmpty(this.f19888c)) {
            addHeader.addHeader("X-Vungle-App-Id", this.f19888c);
        }
        return addHeader;
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> cacheBust(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> config(String str, C8695r c8695r) {
        return m1428b(str, this.f19886a.toString() + "config", c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<Void> pingTPAT(String str, String str2) {
        return m1429a(str, str2, null, f19885e);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> reportAd(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> reportNew(String str, String str2, Map<String, String> map) {
        return m1429a(str, str2, map, f19884d);
    }

    @Override // com.vungle.warren.network.VungleApi
    /* renamed from: ri */
    public final InterfaceC9891a<C8695r> mo1426ri(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> sendBiAnalytics(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> sendLog(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }

    @Override // com.vungle.warren.network.VungleApi
    public final InterfaceC9891a<C8695r> willPlayAd(String str, String str2, C8695r c8695r) {
        return m1428b(str, str2, c8695r);
    }
}
