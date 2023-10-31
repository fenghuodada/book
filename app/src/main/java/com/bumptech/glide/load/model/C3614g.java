package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.InterfaceC3577g;
import com.bumptech.glide.util.C3860j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.model.g */
/* loaded from: classes.dex */
public final class C3614g implements InterfaceC3577g {

    /* renamed from: b */
    public final InterfaceC3615h f9542b;
    @Nullable

    /* renamed from: c */
    public final URL f9543c;
    @Nullable

    /* renamed from: d */
    public final String f9544d;
    @Nullable

    /* renamed from: e */
    public String f9545e;
    @Nullable

    /* renamed from: f */
    public URL f9546f;
    @Nullable

    /* renamed from: g */
    public volatile byte[] f9547g;

    /* renamed from: h */
    public int f9548h;

    public C3614g(String str) {
        C3617j c3617j = InterfaceC3615h.f9549a;
        this.f9543c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f9544d = str;
            C3860j.m6404b(c3617j);
            this.f9542b = c3617j;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    /* renamed from: b */
    public final void mo6420b(@NonNull MessageDigest messageDigest) {
        if (this.f9547g == null) {
            this.f9547g = m6598c().getBytes(InterfaceC3577g.f9514a);
        }
        messageDigest.update(this.f9547g);
    }

    /* renamed from: c */
    public final String m6598c() {
        String str = this.f9544d;
        if (str != null) {
            return str;
        }
        URL url = this.f9543c;
        C3860j.m6404b(url);
        return url.toString();
    }

    /* renamed from: d */
    public final URL m6597d() throws MalformedURLException {
        if (this.f9546f == null) {
            if (TextUtils.isEmpty(this.f9545e)) {
                String str = this.f9544d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f9543c;
                    C3860j.m6404b(url);
                    str = url.toString();
                }
                this.f9545e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f9546f = new URL(this.f9545e);
        }
        return this.f9546f;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final boolean equals(Object obj) {
        if (obj instanceof C3614g) {
            C3614g c3614g = (C3614g) obj;
            return m6598c().equals(c3614g.m6598c()) && this.f9542b.equals(c3614g.f9542b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.InterfaceC3577g
    public final int hashCode() {
        if (this.f9548h == 0) {
            int hashCode = m6598c().hashCode();
            this.f9548h = hashCode;
            this.f9548h = this.f9542b.hashCode() + (hashCode * 31);
        }
        return this.f9548h;
    }

    public final String toString() {
        return m6598c();
    }

    public C3614g(URL url) {
        C3617j c3617j = InterfaceC3615h.f9549a;
        C3860j.m6404b(url);
        this.f9543c = url;
        this.f9544d = null;
        C3860j.m6404b(c3617j);
        this.f9542b = c3617j;
    }
}
