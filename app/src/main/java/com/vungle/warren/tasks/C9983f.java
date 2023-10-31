package com.vungle.warren.tasks;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.vungle.warren.C10114v0;
import com.vungle.warren.Vungle;

/* renamed from: com.vungle.warren.tasks.f */
/* loaded from: classes3.dex */
public final class C9983f implements Job {

    /* renamed from: b */
    public static final /* synthetic */ int f20070b = 0;

    /* renamed from: a */
    public final InterfaceC9984a f20071a;

    /* renamed from: com.vungle.warren.tasks.f$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9984a {
    }

    public C9983f(@NonNull InterfaceC9984a interfaceC9984a) {
        this.f20071a = interfaceC9984a;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        if (bundle.getString("appId", null) == null) {
            return 1;
        }
        ((C10114v0.C10116b) this.f20071a).getClass();
        Vungle.reConfigure();
        return 0;
    }
}
