package com.permissionx.guolindev.request;

import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.w */
/* loaded from: classes3.dex */
public final class C8993w extends AbstractC8969b {
    public C8993w(@NotNull C8992v c8992v) {
        super(c8992v);
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    /* renamed from: a */
    public final void mo2819a(@NotNull List<String> list) {
        C8992v c8992v = this.f17136a;
        c8992v.getClass();
        C8991u m2822c = c8992v.m2822c();
        m2822c.f17162b = c8992v;
        m2822c.f17163c = this;
        m2822c.f17165e.launch("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        boolean z;
        boolean z2;
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (Build.VERSION.SDK_INT < 29) {
                c8992v.f17176e.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                c8992v.f17177f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                mo2828b();
                return;
            }
            boolean z3 = true;
            if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo2828b();
                return;
            }
            if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                z3 = false;
            }
            if (z2 || z3) {
                c8992v.getClass();
                C8991u m2822c = c8992v.m2822c();
                m2822c.f17162b = c8992v;
                m2822c.f17163c = this;
                m2822c.f17165e.launch("android.permission.ACCESS_BACKGROUND_LOCATION");
                return;
            }
        }
        mo2828b();
    }
}
