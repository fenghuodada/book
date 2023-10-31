package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class ScarAdapterBase implements IScarAdapter {

    /* renamed from: a */
    public ISignalsReader f18005a;

    /* renamed from: b */
    public final ConcurrentHashMap f18006b = new ConcurrentHashMap();

    /* renamed from: c */
    public IScarAd f18007c;

    /* renamed from: d */
    public final IAdsErrorHandler f18008d;

    /* renamed from: com.unity3d.scar.adapter.common.ScarAdapterBase$a */
    /* loaded from: classes3.dex */
    public class RunnableC9265a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f18009a;

        public RunnableC9265a(Activity activity) {
            this.f18009a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ScarAdapterBase.this.f18007c.show(this.f18009a);
        }
    }

    public ScarAdapterBase(IAdsErrorHandler iAdsErrorHandler) {
        this.f18008d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        this.f18005a.getSCARSignals(context, strArr, strArr2, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    public void show(Activity activity, String str, String str2) {
        IScarAd iScarAd = (IScarAd) this.f18006b.get(str2);
        if (iScarAd != null) {
            this.f18007c = iScarAd;
            Utils.runOnUiThread(new RunnableC9265a(activity));
            return;
        }
        this.f18008d.handleError(GMAAdsError.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
    }
}
