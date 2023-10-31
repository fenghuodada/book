package androidx.work.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.sqlite.p004db.InterfaceC1702c;
import androidx.sqlite.p004db.framework.C1709b;

/* renamed from: androidx.work.impl.h */
/* loaded from: classes.dex */
public final class C1902h implements InterfaceC1702c.InterfaceC1705c {

    /* renamed from: a */
    public final /* synthetic */ Context f4640a;

    public C1902h(Context context) {
        this.f4640a = context;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c.InterfaceC1705c
    @NonNull
    /* renamed from: a */
    public final InterfaceC1702c mo9821a(@NonNull InterfaceC1702c.C1704b c1704b) {
        InterfaceC1702c.AbstractC1703a abstractC1703a = c1704b.f4153c;
        if (abstractC1703a != null) {
            Context context = this.f4640a;
            if (context != null) {
                String str = c1704b.f4152b;
                if (!TextUtils.isEmpty(str)) {
                    return new C1709b(context, str, abstractC1703a, true);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }
}
