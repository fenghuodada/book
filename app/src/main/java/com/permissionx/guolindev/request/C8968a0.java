package com.permissionx.guolindev.request;

import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.request.a0 */
/* loaded from: classes3.dex */
public final class C8968a0 extends AbstractC8969b {
    public C8968a0(@NotNull C8992v c8992v) {
        super(c8992v);
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    /* renamed from: a */
    public final void mo2819a(@NotNull List<String> list) {
        C8992v c8992v = this.f17136a;
        HashSet hashSet = new HashSet(c8992v.f17178g);
        hashSet.addAll(list);
        if (!hashSet.isEmpty()) {
            c8992v.m2820e(hashSet, this);
        } else {
            mo2828b();
        }
    }

    @Override // com.permissionx.guolindev.request.InterfaceC8971c
    public final void request() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        C8992v c8992v = this.f17136a;
        for (String str : c8992v.f17175d) {
            if (ContextCompat.m12040a(c8992v.m2824a(), str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c8992v.f17178g.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            mo2828b();
        } else {
            c8992v.m2820e(c8992v.f17175d, this);
        }
    }
}
