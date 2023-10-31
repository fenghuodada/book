package com.permissionx.guolindev.request;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.y */
/* loaded from: classes3.dex */
public final class C8995y extends AbstractC8969b {
    public C8995y(@NotNull C8992v c8992v) {
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
            Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:" + m2822c.requireActivity().getPackageName()));
            m2822c.f17169i.launch(intent);
        } else if (m2822c.m2827h()) {
            m2822c.m2825j(new C8979i(m2822c));
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        boolean canRequestPackageInstalls;
        C8992v c8992v = this.f17136a;
        if (c8992v.f17176e.contains("android.permission.REQUEST_INSTALL_PACKAGES") && Build.VERSION.SDK_INT >= 26 && c8992v.m2821d() >= 26) {
            canRequestPackageInstalls = c8992v.m2824a().getPackageManager().canRequestPackageInstalls();
            if (canRequestPackageInstalls) {
                mo2828b();
                return;
            }
        }
        mo2828b();
    }
}
