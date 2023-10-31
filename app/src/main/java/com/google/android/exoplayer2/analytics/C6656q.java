package com.google.android.exoplayer2.analytics;

import android.os.Parcel;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;
import com.google.android.gms.dynamic.IObjectWrapper;

/* renamed from: com.google.android.exoplayer2.analytics.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C6656q implements C7417m.InterfaceC7418a {
    public /* synthetic */ C6656q(AnalyticsListener.C6634a c6634a, boolean z) {
    }

    /* renamed from: a */
    public static IObjectWrapper m6130a(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        analyticsListener.m6195O();
        analyticsListener.m6189U();
    }
}
