package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.upstream.a0 */
/* loaded from: classes.dex */
public final class C7345a0 extends AbstractC7358e {

    /* renamed from: e */
    public final Resources f13724e;

    /* renamed from: f */
    public final String f13725f;
    @Nullable

    /* renamed from: g */
    public Uri f13726g;
    @Nullable

    /* renamed from: h */
    public AssetFileDescriptor f13727h;
    @Nullable

    /* renamed from: i */
    public FileInputStream f13728i;

    /* renamed from: j */
    public long f13729j;

    /* renamed from: k */
    public boolean f13730k;

    /* renamed from: com.google.android.exoplayer2.upstream.a0$a */
    /* loaded from: classes.dex */
    public static class C7346a extends C7365j {
        public C7346a(@Nullable String str, @Nullable Exception exc, int i) {
            super(str, exc, i);
        }
    }

    public C7345a0(Context context) {
        super(false);
        this.f13724e = context.getResources();
        this.f13725f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws C7346a {
        this.f13726g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f13728i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f13728i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13727h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C7346a(null, e, AdError.SERVER_ERROR_CODE);
                    }
                } finally {
                    this.f13727h = null;
                    if (this.f13730k) {
                        this.f13730k = false;
                        m5174m();
                    }
                }
            } catch (Throwable th) {
                this.f13728i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f13727h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f13727h = null;
                        if (this.f13730k) {
                            this.f13730k = false;
                            m5174m();
                        }
                        throw th;
                    } finally {
                        this.f13727h = null;
                        if (this.f13730k) {
                            this.f13730k = false;
                            m5174m();
                        }
                    }
                } catch (IOException e2) {
                    throw new C7346a(null, e2, AdError.SERVER_ERROR_CODE);
                }
            }
        } catch (IOException e3) {
            throw new C7346a(null, e3, AdError.SERVER_ERROR_CODE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r3.matches("\\d+") != false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015b  */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo5146g(com.google.android.exoplayer2.upstream.DataSpec r20) throws com.google.android.exoplayer2.upstream.C7345a0.C7346a {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.C7345a0.mo5146g(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13726g;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws C7346a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13729j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7346a(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.f13728i;
        int i3 = C7408g0.f13905a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.f13729j == -1) {
                return -1;
            }
            throw new C7346a("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j2 = this.f13729j;
        if (j2 != -1) {
            this.f13729j = j2 - read;
        }
        m5175l(read);
        return read;
    }
}
