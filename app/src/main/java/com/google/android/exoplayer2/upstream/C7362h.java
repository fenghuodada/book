package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.common.base.C7935d;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.google.android.exoplayer2.upstream.h */
/* loaded from: classes.dex */
public final class C7362h extends AbstractC7358e {
    @Nullable

    /* renamed from: e */
    public DataSpec f13767e;
    @Nullable

    /* renamed from: f */
    public byte[] f13768f;

    /* renamed from: g */
    public int f13769g;

    /* renamed from: h */
    public int f13770h;

    public C7362h() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() {
        if (this.f13768f != null) {
            this.f13768f = null;
            m5174m();
        }
        this.f13767e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws IOException {
        String str;
        String str2;
        m5173n(dataSpec);
        this.f13767e = dataSpec;
        Uri uri = dataSpec.f13712a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        if (valueOf.length() != 0) {
            str = "Unsupported scheme: ".concat(valueOf);
        } else {
            str = new String("Unsupported scheme: ");
        }
        C7394a.m5133b(equals, str);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = C7408g0.f13905a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str3 = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f13768f = Base64.decode(str3, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str3);
                    if (valueOf2.length() != 0) {
                        str2 = "Error while parsing Base64 encoded string: ".concat(valueOf2);
                    } else {
                        str2 = new String("Error while parsing Base64 encoded string: ");
                    }
                    throw new C7506y0(str2, e, true, 0);
                }
            } else {
                this.f13768f = C7408g0.m5088r(URLDecoder.decode(str3, C7935d.f15691a.name()));
            }
            byte[] bArr = this.f13768f;
            long j = dataSpec.f13717f;
            if (j <= bArr.length) {
                int i2 = (int) j;
                this.f13769g = i2;
                int length = bArr.length - i2;
                this.f13770h = length;
                long j2 = dataSpec.f13718g;
                int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                if (i3 != 0) {
                    this.f13770h = (int) Math.min(length, j2);
                }
                m5172o(dataSpec);
                if (i3 == 0) {
                    return this.f13770h;
                }
                return j2;
            }
            this.f13768f = null;
            throw new C7365j(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new C7506y0(sb.toString(), null, true, 0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        DataSpec dataSpec = this.f13767e;
        if (dataSpec != null) {
            return dataSpec.f13712a;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13770h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f13768f;
        int i4 = C7408g0.f13905a;
        System.arraycopy(bArr2, this.f13769g, bArr, i, min);
        this.f13769g += min;
        this.f13770h -= min;
        m5175l(min);
        return min;
    }
}
