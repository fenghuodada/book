package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.model.v */
/* loaded from: classes.dex */
public final class C3660v<Data> implements InterfaceC3627o<String, Data> {

    /* renamed from: a */
    public final InterfaceC3627o<Uri, Data> f9622a;

    /* renamed from: com.bumptech.glide.load.model.v$a */
    /* loaded from: classes.dex */
    public static final class C3661a implements InterfaceC3629p<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        /* renamed from: b */
        public final InterfaceC3627o<String, AssetFileDescriptor> mo6572b(@NonNull C3635s c3635s) {
            return new C3660v(c3635s.m6585c(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.v$b */
    /* loaded from: classes.dex */
    public static class C3662b implements InterfaceC3629p<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<String, ParcelFileDescriptor> mo6572b(@NonNull C3635s c3635s) {
            return new C3660v(c3635s.m6585c(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: com.bumptech.glide.load.model.v$c */
    /* loaded from: classes.dex */
    public static class C3663c implements InterfaceC3629p<String, InputStream> {
        @Override // com.bumptech.glide.load.model.InterfaceC3629p
        @NonNull
        /* renamed from: b */
        public final InterfaceC3627o<String, InputStream> mo6572b(@NonNull C3635s c3635s) {
            return new C3660v(c3635s.m6585c(Uri.class, InputStream.class));
        }
    }

    public C3660v(InterfaceC3627o<Uri, Data> interfaceC3627o) {
        this.f9622a = interfaceC3627o;
    }

    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo6574a(@NonNull String str) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0.getScheme() == null) goto L16;
     */
    @Override // com.bumptech.glide.load.model.InterfaceC3627o
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bumptech.glide.load.model.InterfaceC3627o.C3628a mo6573b(@androidx.annotation.NonNull java.lang.String r4, int r5, int r6, @androidx.annotation.NonNull com.bumptech.glide.load.C3581i r7) {
        /*
            r3 = this;
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto Lb
            r0 = r1
            goto L28
        Lb:
            r0 = 0
            char r0 = r4.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L15
            goto L1f
        L15:
            android.net.Uri r0 = android.net.Uri.parse(r4)
            java.lang.String r2 = r0.getScheme()
            if (r2 != 0) goto L28
        L1f:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L28:
            if (r0 == 0) goto L37
            com.bumptech.glide.load.model.o<android.net.Uri, Data> r4 = r3.f9622a
            boolean r2 = r4.mo6574a(r0)
            if (r2 != 0) goto L33
            goto L37
        L33:
            com.bumptech.glide.load.model.o$a r1 = r4.mo6573b(r0, r5, r6, r7)
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.model.C3660v.mo6573b(java.lang.Object, int, int, com.bumptech.glide.load.i):com.bumptech.glide.load.model.o$a");
    }
}
