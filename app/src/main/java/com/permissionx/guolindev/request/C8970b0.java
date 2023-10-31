package com.permissionx.guolindev.request;

import android.content.Intent;
import android.os.Build;
import androidx.core.app.C0600a0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.b0 */
/* loaded from: classes3.dex */
public final class C8970b0 extends AbstractC8969b {
    public C8970b0(@NotNull C8992v c8992v) {
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
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", m2822c.requireActivity().getPackageName());
            m2822c.f17170j.launch(intent);
        } else if (m2822c.m2827h()) {
            m2822c.m2825j(new C8979i(m2822c));
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.POST_NOTIFICATIONS") && new C0600a0(c8992v.m2824a()).m12103a()) {
            mo2828b();
        } else {
            mo2828b();
        }
    }
}
