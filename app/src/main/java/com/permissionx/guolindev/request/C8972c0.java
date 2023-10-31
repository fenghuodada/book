package com.permissionx.guolindev.request;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.c0 */
/* loaded from: classes3.dex */
public final class C8972c0 extends AbstractC8969b {
    public C8972c0(@NotNull C8992v c8992v) {
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
        if (!Settings.canDrawOverlays(m2822c.requireContext())) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
            intent.setData(Uri.parse("package:" + m2822c.requireActivity().getPackageName()));
            m2822c.f17166f.launch(intent);
            return;
        }
        m2822c.m2826i();
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.SYSTEM_ALERT_WINDOW")) {
            if (c8992v.m2821d() >= 23) {
                if (Settings.canDrawOverlays(c8992v.m2824a())) {
                    mo2828b();
                    return;
                }
            } else {
                c8992v.f17178g.add("android.permission.SYSTEM_ALERT_WINDOW");
                c8992v.f17176e.remove("android.permission.SYSTEM_ALERT_WINDOW");
            }
        }
        mo2828b();
    }
}
