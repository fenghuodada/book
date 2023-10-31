package com.applovin.impl.adview.activity.p010b;

import com.google.android.datatransport.InterfaceC6465e;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;

/* renamed from: com.applovin.impl.adview.activity.b.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C2745h implements InterfaceC6465e {
    /* renamed from: a */
    public static StringBuilder m9043a(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    @Override // com.google.android.datatransport.InterfaceC6465e
    public Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.m3317a((CrashlyticsReport) obj);
    }
}
