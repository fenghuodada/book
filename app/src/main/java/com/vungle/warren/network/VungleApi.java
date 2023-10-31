package com.vungle.warren.network;

import androidx.annotation.Keep;
import com.google.gson.C8695r;
import java.util.Map;

@Keep
/* loaded from: classes3.dex */
public interface VungleApi {
    InterfaceC9891a<C8695r> ads(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> cacheBust(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> config(String str, C8695r c8695r);

    InterfaceC9891a<Void> pingTPAT(String str, String str2);

    InterfaceC9891a<C8695r> reportAd(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> reportNew(String str, String str2, Map<String, String> map);

    /* renamed from: ri */
    InterfaceC9891a<C8695r> mo1426ri(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> sendBiAnalytics(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> sendLog(String str, String str2, C8695r c8695r);

    InterfaceC9891a<C8695r> willPlayAd(String str, String str2, C8695r c8695r);
}
