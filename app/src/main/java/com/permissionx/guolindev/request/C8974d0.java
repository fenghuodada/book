package com.permissionx.guolindev.request;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.d0 */
/* loaded from: classes3.dex */
public final class C8974d0 extends AbstractC8969b {
    public C8974d0(@NotNull C8992v c8992v) {
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
        if (!Settings.System.canWrite(m2822c.requireContext())) {
            Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
            intent.setData(Uri.parse("package:" + m2822c.requireActivity().getPackageName()));
            m2822c.f17167g.launch(intent);
        } else if (m2822c.m2827h()) {
            m2822c.m2825j(new C8982l(m2822c));
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.WRITE_SETTINGS")) {
            if (c8992v.m2821d() >= 23) {
                if (Settings.System.canWrite(c8992v.m2824a())) {
                    mo2828b();
                    return;
                }
            } else {
                c8992v.f17178g.add("android.permission.WRITE_SETTINGS");
                c8992v.f17176e.remove("android.permission.WRITE_SETTINGS");
            }
        }
        mo2828b();
    }
}
