package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.exoplayer2.upstream.b */
/* loaded from: classes.dex */
public final class C7347b extends AbstractC7358e {

    /* renamed from: e */
    public final AssetManager f13731e;
    @Nullable

    /* renamed from: f */
    public Uri f13732f;
    @Nullable

    /* renamed from: g */
    public InputStream f13733g;

    /* renamed from: h */
    public long f13734h;

    /* renamed from: i */
    public boolean f13735i;

    /* renamed from: com.google.android.exoplayer2.upstream.b$a */
    /* loaded from: classes.dex */
    public static final class C7348a extends C7365j {
        public C7348a(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C7347b(Context context) {
        super(false);
        this.f13731e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws C7348a {
        this.f13732f = null;
        try {
            try {
                InputStream inputStream = this.f13733g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C7348a(e, AdError.SERVER_ERROR_CODE);
            }
        } finally {
            this.f13733g = null;
            if (this.f13735i) {
                this.f13735i = false;
                m5174m();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws C7348a {
        int i;
        try {
            Uri uri = dataSpec.f13712a;
            long j = dataSpec.f13717f;
            this.f13732f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            m5173n(dataSpec);
            InputStream open = this.f13731e.open(path, 1);
            this.f13733g = open;
            if (open.skip(j) >= j) {
                long j2 = dataSpec.f13718g;
                if (j2 != -1) {
                    this.f13734h = j2;
                } else {
                    long available = this.f13733g.available();
                    this.f13734h = available;
                    if (available == 2147483647L) {
                        this.f13734h = -1L;
                    }
                }
                this.f13735i = true;
                m5172o(dataSpec);
                return this.f13734h;
            }
            throw new C7348a(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (C7348a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = AdError.SERVER_ERROR_CODE;
            }
            throw new C7348a(e2, i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13732f;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws C7348a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13734h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C7348a(e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.f13733g;
        int i3 = C7408g0.f13905a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f13734h;
        if (j2 != -1) {
            this.f13734h = j2 - read;
        }
        m5175l(read);
        return read;
    }
}
