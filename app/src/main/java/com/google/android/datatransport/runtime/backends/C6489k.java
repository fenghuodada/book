package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import javax.inject.Inject;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
/* loaded from: classes.dex */
public final class C6489k {

    /* renamed from: a */
    public final Context f10210a;

    /* renamed from: b */
    public final InterfaceC6611a f10211b;

    /* renamed from: c */
    public final InterfaceC6611a f10212c;

    @Inject
    public C6489k(Context context, @WallTime InterfaceC6611a interfaceC6611a, @Monotonic InterfaceC6611a interfaceC6611a2) {
        this.f10210a = context;
        this.f10211b = interfaceC6611a;
        this.f10212c = interfaceC6611a2;
    }
}
