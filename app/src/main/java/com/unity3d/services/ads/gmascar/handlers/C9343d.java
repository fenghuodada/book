package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.d */
/* loaded from: classes3.dex */
public class C9343d implements ISignalCollectionListener {
    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollected(String str) {
        C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.SIGNALS, str);
    }

    @Override // com.unity3d.scar.adapter.common.signals.ISignalCollectionListener
    public void onSignalsCollectionFailed(String str) {
        C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.SIGNALS_ERROR, str);
    }
}
