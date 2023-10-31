package com.vungle.warren.p058ui;

import android.util.Log;
import android.webkit.JavascriptInterface;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;

/* renamed from: com.vungle.warren.ui.c */
/* loaded from: classes3.dex */
public final class C10000c {

    /* renamed from: a */
    public final InterfaceC10001a f20108a;

    /* renamed from: com.vungle.warren.ui.c$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC10001a {
        /* renamed from: m */
        void mo1332m(String str);
    }

    public C10000c(InterfaceC10003b interfaceC10003b) {
        this.f20108a = interfaceC10003b;
    }

    @JavascriptInterface
    public void performAction(String str) {
        Log.d("JavascriptBridge", "actionClicked(" + str + ")");
        this.f20108a.mo1332m(str);
    }
}
