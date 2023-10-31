package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.exoplayer2.upstream.s */
/* loaded from: classes.dex */
public final class C7376s extends AbstractC7358e {
    @Nullable

    /* renamed from: e */
    public RandomAccessFile f13843e;
    @Nullable

    /* renamed from: f */
    public Uri f13844f;

    /* renamed from: g */
    public long f13845g;

    /* renamed from: h */
    public boolean f13846h;

    /* renamed from: com.google.android.exoplayer2.upstream.s$a */
    /* loaded from: classes.dex */
    public static class C7377a extends C7365j {
        public C7377a(Exception exc, int i) {
            super(exc, i);
        }

        public C7377a(@Nullable String str, @Nullable FileNotFoundException fileNotFoundException, int i) {
            super(str, fileNotFoundException, i);
        }
    }

    @RequiresApi(21)
    /* renamed from: com.google.android.exoplayer2.upstream.s$b */
    /* loaded from: classes.dex */
    public static final class C7378b {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: b */
        public static boolean m5143b(@Nullable Throwable th) {
            return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
        }
    }

    public C7376s() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws C7377a {
        this.f13844f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f13843e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C7377a(e, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f13843e = null;
            if (this.f13846h) {
                this.f13846h = false;
                m5174m();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws C7377a {
        Uri uri = dataSpec.f13712a;
        long j = dataSpec.f13717f;
        this.f13844f = uri;
        m5173n(dataSpec);
        int i = AdError.INTERNAL_ERROR_2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f13843e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = dataSpec.f13718g;
                if (j2 == -1) {
                    j2 = this.f13843e.length() - j;
                }
                this.f13845g = j2;
                if (j2 >= 0) {
                    this.f13846h = true;
                    m5172o(dataSpec);
                    return this.f13845g;
                }
                throw new C7377a(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
            } catch (IOException e) {
                throw new C7377a(e, AdError.SERVER_ERROR_CODE);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C7377a(e2, (C7408g0.f13905a < 21 || !C7378b.m5143b(e2.getCause())) ? 2005 : 2005);
            }
            throw new C7377a(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
        } catch (SecurityException e3) {
            throw new C7377a(e3, AdError.INTERNAL_ERROR_2006);
        } catch (RuntimeException e4) {
            throw new C7377a(e4, AdError.SERVER_ERROR_CODE);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13844f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws C7377a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13845g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f13843e;
            int i3 = C7408g0.f13905a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f13845g -= read;
                m5175l(read);
            }
            return read;
        } catch (IOException e) {
            throw new C7377a(e, AdError.SERVER_ERROR_CODE);
        }
    }
}
