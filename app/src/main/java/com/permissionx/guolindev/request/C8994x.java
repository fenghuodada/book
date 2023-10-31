package com.permissionx.guolindev.request;

import android.os.Build;
import androidx.core.content.ContextCompat;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.x */
/* loaded from: classes3.dex */
public final class C8994x extends AbstractC8969b {
    public C8994x(@NotNull C8992v c8992v) {
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
        m2822c.f17171k.launch("android.permission.BODY_SENSORS_BACKGROUND");
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        boolean z;
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
            if (Build.VERSION.SDK_INT < 33) {
                c8992v.f17176e.remove("android.permission.BODY_SENSORS_BACKGROUND");
                c8992v.f17177f.add("android.permission.BODY_SENSORS_BACKGROUND");
                mo2828b();
                return;
            }
            boolean z2 = true;
            if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo2828b();
                return;
            }
            if (ContextCompat.m12040a(c8992v.m2824a(), "android.permission.BODY_SENSORS") != 0) {
                z2 = false;
            }
            if (z2) {
                c8992v.getClass();
                C8991u m2822c = c8992v.m2822c();
                m2822c.f17162b = c8992v;
                m2822c.f17163c = this;
                m2822c.f17171k.launch("android.permission.BODY_SENSORS_BACKGROUND");
                return;
            }
        }
        mo2828b();
    }
}
