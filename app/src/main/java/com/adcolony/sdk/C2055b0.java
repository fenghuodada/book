package com.adcolony.sdk;

import android.net.Uri;
import java.io.File;

/* renamed from: com.adcolony.sdk.b0 */
/* loaded from: classes.dex */
public final class C2055b0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2066c0 f4950a;

    public C2055b0(C2066c0 c2066c0) {
        this.f4950a = c2066c0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2066c0 c2066c0 = this.f4950a;
        if (C2066c0.m9683a(c2066c0, c2100e2)) {
            c2066c0.f5025i = c2100e2.f5098b.m9436w("filepath");
            c2066c0.setImageURI(Uri.fromFile(new File(c2066c0.f5025i)));
        }
    }
}
