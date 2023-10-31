package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.C0470b;
import cn.hutool.core.codec.C2026c;
import com.bumptech.glide.ComponentCallbacks2C3409b;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3483b;
import com.bumptech.glide.request.C3827g;
import com.bumptech.glide.request.InterfaceC3826f;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.g */
/* loaded from: classes.dex */
public final class C3424g extends ContextWrapper {
    @VisibleForTesting

    /* renamed from: k */
    public static final C3408a f9075k = new C3408a();

    /* renamed from: a */
    public final InterfaceC3483b f9076a;

    /* renamed from: b */
    public final C3433j f9077b;

    /* renamed from: c */
    public final C2026c f9078c;

    /* renamed from: d */
    public final ComponentCallbacks2C3409b.InterfaceC3410a f9079d;

    /* renamed from: e */
    public final List<InterfaceC3826f<Object>> f9080e;

    /* renamed from: f */
    public final Map<Class<?>, AbstractC3779m<?, ?>> f9081f;

    /* renamed from: g */
    public final C3549n f9082g;

    /* renamed from: h */
    public final C3430h f9083h;

    /* renamed from: i */
    public final int f9084i;
    @Nullable
    @GuardedBy("this")

    /* renamed from: j */
    public C3827g f9085j;

    public C3424g(@NonNull Context context, @NonNull InterfaceC3483b interfaceC3483b, @NonNull C3433j c3433j, @NonNull C2026c c2026c, @NonNull C3411c c3411c, @NonNull C0470b c0470b, @NonNull List list, @NonNull C3549n c3549n, @NonNull C3430h c3430h, int i) {
        super(context.getApplicationContext());
        this.f9076a = interfaceC3483b;
        this.f9077b = c3433j;
        this.f9078c = c2026c;
        this.f9079d = c3411c;
        this.f9080e = list;
        this.f9081f = c0470b;
        this.f9082g = c3549n;
        this.f9083h = c3430h;
        this.f9084i = i;
    }
}
