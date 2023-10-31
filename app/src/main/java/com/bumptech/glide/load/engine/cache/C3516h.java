package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.load.engine.C3549n;
import com.bumptech.glide.load.engine.InterfaceC3573x;
import com.bumptech.glide.load.engine.cache.InterfaceC3517i;
import com.bumptech.glide.util.C3856g;

/* renamed from: com.bumptech.glide.load.engine.cache.h */
/* loaded from: classes.dex */
public final class C3516h extends C3856g<InterfaceC3577g, InterfaceC3573x<?>> implements InterfaceC3517i {

    /* renamed from: d */
    public InterfaceC3517i.InterfaceC3518a f9302d;

    public C3516h(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.util.C3856g
    /* renamed from: b */
    public final int mo6411b(@Nullable InterfaceC3573x<?> interfaceC3573x) {
        InterfaceC3573x<?> interfaceC3573x2 = interfaceC3573x;
        if (interfaceC3573x2 == null) {
            return 1;
        }
        return interfaceC3573x2.getSize();
    }

    @Override // com.bumptech.glide.util.C3856g
    /* renamed from: c */
    public final void mo6410c(@NonNull InterfaceC3577g interfaceC3577g, @Nullable InterfaceC3573x<?> interfaceC3573x) {
        InterfaceC3573x<?> interfaceC3573x2 = interfaceC3573x;
        InterfaceC3517i.InterfaceC3518a interfaceC3518a = this.f9302d;
        if (interfaceC3518a != null && interfaceC3573x2 != null) {
            ((C3549n) interfaceC3518a).f9408e.m6713a(interfaceC3573x2, true);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: f */
    public final void m6672f(int i) {
        long j;
        if (i >= 40) {
            m6408e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (this) {
                j = this.f9948b;
            }
            m6408e(j / 2);
        }
    }
}
