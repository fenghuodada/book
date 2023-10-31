package com.adcolony.sdk;

import com.google.android.datatransport.InterfaceC6468h;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.source.C7174j;
import com.google.android.exoplayer2.source.C7184m;
import com.google.android.exoplayer2.util.C7417m;
import com.google.common.base.InterfaceC7936e;
import java.io.IOException;

/* renamed from: com.adcolony.sdk.x3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2362x3 implements InterfaceC6468h, C7417m.InterfaceC7418a, InterfaceC7936e {
    public /* synthetic */ C2362x3() {
    }

    public /* synthetic */ C2362x3(AnalyticsListener.C6634a c6634a, C7174j c7174j, C7184m c7184m, IOException iOException, boolean z) {
    }

    /* renamed from: b */
    public static StringBuilder m9460b(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    @Override // com.google.android.datatransport.InterfaceC6468h
    /* renamed from: a */
    public void mo3314a(Exception exc) {
    }

    @Override // com.google.common.base.InterfaceC7936e
    public Object apply(Object obj) {
        return (Track) obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).m6144y();
    }
}
