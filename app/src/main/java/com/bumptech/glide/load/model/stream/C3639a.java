package com.bumptech.glide.load.model.stream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.C3578h;
import com.bumptech.glide.load.C3581i;
import com.bumptech.glide.load.data.C3462j;
import com.bumptech.glide.load.model.C3614g;
import com.bumptech.glide.load.model.C3624m;
import com.bumptech.glide.load.model.C3625n;
import com.bumptech.glide.load.model.C3635s;
import com.bumptech.glide.load.model.InterfaceC3627o;
import com.bumptech.glide.load.model.InterfaceC3629p;
import java.io.InputStream;
import java.util.ArrayDeque;

/* renamed from: com.bumptech.glide.load.model.stream.a */
/* loaded from: classes.dex */
public final class C3639a implements InterfaceC3627o<C3614g, InputStream> {

    /* renamed from: b */
    public static final C3578h<Integer> f9590b = C3578h.m6607a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    @Nullable

    /* renamed from: a */
    public final C3625n<C3614g, C3614g> f9591a;

    /* renamed from: com.bumptech.glide.load.model.stream.a$a */
    /* loaded from: classes.dex */
    public static class C3640a implements InterfaceC3629p<C3614g, InputStream> {

        /* renamed from: a */
        public final C3625n<C3614g, C3614g> f9592a = new C3625n<>();

        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<C3614g, InputStream> mo6572b(C3635s c3635s) {
            return new C3639a(this.f9592a);
        }
    }

    public C3639a(@Nullable C3625n<C3614g, C3614g> c3625n) {
        this.f9591a = c3625n;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull C3614g c3614g) {
        return true;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    public final InterfaceC3627o.C3628a<InputStream> mo6573b(@NonNull C3614g c3614g, int i, int i2, @NonNull C3581i c3581i) {
        C3614g c3614g2 = c3614g;
        C3625n<C3614g, C3614g> c3625n = this.f9591a;
        if (c3625n != null) {
            C3625n.C3626a m6592a = C3625n.C3626a.m6592a(c3614g2);
            C3624m c3624m = c3625n.f9560a;
            Object m6412a = c3624m.m6412a(m6592a);
            ArrayDeque arrayDeque = C3625n.C3626a.f9561d;
            synchronized (arrayDeque) {
                arrayDeque.offer(m6592a);
            }
            C3614g c3614g3 = (C3614g) m6412a;
            if (c3614g3 == null) {
                c3624m.m6409d(C3625n.C3626a.m6592a(c3614g2), c3614g2);
            } else {
                c3614g2 = c3614g3;
            }
        }
        return new InterfaceC3627o.C3628a<>(c3614g2, new C3462j(c3614g2, ((Integer) c3581i.m6606c(f9590b)).intValue()));
    }
}
