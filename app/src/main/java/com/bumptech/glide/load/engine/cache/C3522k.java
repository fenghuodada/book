package com.bumptech.glide.load.engine.cache;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.util.C3856g;
import com.bumptech.glide.util.C3860j;
import com.bumptech.glide.util.C3861k;
import com.bumptech.glide.util.pool.AbstractC3871d;
import com.bumptech.glide.util.pool.C3863a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bumptech.glide.load.engine.cache.k */
/* loaded from: classes.dex */
public final class C3522k {

    /* renamed from: a */
    public final C3856g<InterfaceC3577g, String> f9312a = new C3856g<>(1000);

    /* renamed from: b */
    public final C3863a.C3866c f9313b = C3863a.m6396a(10, new C3523a());

    /* renamed from: com.bumptech.glide.load.engine.cache.k$a */
    /* loaded from: classes.dex */
    public class C3523a implements C3863a.InterfaceC3865b<C3524b> {
        @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3865b
        /* renamed from: a */
        public final C3524b mo6392a() {
            try {
                return new C3524b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.cache.k$b */
    /* loaded from: classes.dex */
    public static final class C3524b implements C3863a.InterfaceC3867d {

        /* renamed from: a */
        public final MessageDigest f9314a;

        /* renamed from: b */
        public final AbstractC3871d.C3872a f9315b = new AbstractC3871d.C3872a();

        public C3524b(MessageDigest messageDigest) {
            this.f9314a = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.C3863a.InterfaceC3867d
        @NonNull
        /* renamed from: b */
        public final AbstractC3871d.C3872a mo6393b() {
            return this.f9315b;
        }
    }

    /* renamed from: a */
    public final String m6671a(InterfaceC3577g interfaceC3577g) {
        String str;
        Object mo6394b = this.f9313b.mo6394b();
        C3860j.m6404b(mo6394b);
        C3524b c3524b = (C3524b) mo6394b;
        try {
            interfaceC3577g.mo6420b(c3524b.f9314a);
            byte[] digest = c3524b.f9314a.digest();
            char[] cArr = C3861k.f9957b;
            synchronized (cArr) {
                for (int i = 0; i < digest.length; i++) {
                    int i2 = digest[i] & 255;
                    int i3 = i * 2;
                    char[] cArr2 = C3861k.f9956a;
                    cArr[i3] = cArr2[i2 >>> 4];
                    cArr[i3 + 1] = cArr2[i2 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            this.f9313b.mo6395a(c3524b);
        }
    }

    /* renamed from: b */
    public final String m6670b(InterfaceC3577g interfaceC3577g) {
        String m6412a;
        synchronized (this.f9312a) {
            m6412a = this.f9312a.m6412a(interfaceC3577g);
        }
        if (m6412a == null) {
            m6412a = m6671a(interfaceC3577g);
        }
        synchronized (this.f9312a) {
            this.f9312a.m6409d(interfaceC3577g, m6412a);
        }
        return m6412a;
    }
}
