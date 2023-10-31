package com.facebook.ads.redexgen.p036X;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/* renamed from: com.facebook.ads.redexgen.X.bC */
/* loaded from: assets/audience_network.dex */
public class C6153bC implements InterfaceC5182LP {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5182LP
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Window.Callback callback = activity.getWindow() != null ? activity.getWindow().getCallback() : null;
        if (callback != null) {
            Window$CallbackC5177LK window$CallbackC5177LK = new Window$CallbackC5177LK(callback, activity);
            Window$CallbackC5177LK.A00(new C6154bD(this));
            activity.getWindow().setCallback(window$CallbackC5177LK);
        }
    }
}
