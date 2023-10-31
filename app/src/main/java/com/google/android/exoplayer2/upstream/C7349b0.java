package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.b0 */
/* loaded from: classes.dex */
public final class C7349b0 implements InterfaceC7363i {

    /* renamed from: a */
    public final InterfaceC7363i f13736a;

    /* renamed from: b */
    public long f13737b;

    /* renamed from: c */
    public Uri f13738c;

    public C7349b0(InterfaceC7363i interfaceC7363i) {
        interfaceC7363i.getClass();
        this.f13736a = interfaceC7363i;
        this.f13738c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: c */
    public final void mo5158c(InterfaceC7351c0 interfaceC7351c0) {
        interfaceC7351c0.getClass();
        this.f13736a.mo5158c(interfaceC7351c0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws IOException {
        this.f13736a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws IOException {
        this.f13738c = dataSpec.f13712a;
        Collections.emptyMap();
        long mo5146g = this.f13736a.mo5146g(dataSpec);
        Uri mo5145k = mo5145k();
        mo5145k.getClass();
        this.f13738c = mo5145k;
        mo5154h();
        return mo5146g;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: h */
    public final Map<String, List<String>> mo5154h() {
        return this.f13736a.mo5154h();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        return this.f13736a.mo5145k();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f13736a.read(bArr, i, i2);
        if (read != -1) {
            this.f13737b += read;
        }
        return read;
    }
}
