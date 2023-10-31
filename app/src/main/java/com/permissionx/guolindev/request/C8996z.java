package com.permissionx.guolindev.request;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.z */
/* loaded from: classes3.dex */
public final class C8996z extends AbstractC8969b {
    public C8996z(@NotNull C8992v c8992v) {
        super(c8992v);
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    /* renamed from: a */
    public final void mo2819a(@NotNull List<String> list) {
        boolean isExternalStorageManager;
        C8992v c8992v = this.f17136a;
        c8992v.getClass();
        C8991u m2822c = c8992v.m2822c();
        m2822c.f17162b = c8992v;
        m2822c.f17163c = this;
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent.setData(Uri.parse("package:" + m2822c.requireActivity().getPackageName()));
                if (intent.resolveActivity(m2822c.requireActivity().getPackageManager()) == null) {
                    intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                }
                m2822c.f17168h.launch(intent);
                return;
            }
        }
        if (m2822c.m2827h()) {
            m2822c.m2825j(new C8980j(m2822c));
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        if (this.f17136a.f17176e.contains("android.permission.MANAGE_EXTERNAL_STORAGE") && Build.VERSION.SDK_INT >= 30) {
            Environment.isExternalStorageManager();
            mo2828b();
            return;
        }
        mo2828b();
    }
}
