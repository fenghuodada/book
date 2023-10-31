package com.vungle.warren;

import android.util.Log;
import androidx.core.util.InterfaceC0797a;

/* renamed from: com.vungle.warren.q1 */
/* loaded from: classes3.dex */
public final class C9963q1 implements InterfaceC0797a<String> {

    /* renamed from: a */
    public final /* synthetic */ VungleApiClient f20004a;

    public C9963q1(VungleApiClient vungleApiClient) {
        this.f20004a = vungleApiClient;
    }

    @Override // androidx.core.util.InterfaceC0797a
    public final void accept(String str) {
        String str2 = str;
        if (str2 == null) {
            String str3 = VungleApiClient.f19359C;
            Log.e("com.vungle.warren.VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent");
            return;
        }
        this.f20004a.f19388z = str2;
    }
}
