package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.exoplayer2.upstream.o */
/* loaded from: classes.dex */
public final class C7371o implements InterfaceC7363i {

    /* renamed from: a */
    public final Context f13811a;

    /* renamed from: b */
    public final ArrayList f13812b;

    /* renamed from: c */
    public final InterfaceC7363i f13813c;
    @Nullable

    /* renamed from: d */
    public C7376s f13814d;
    @Nullable

    /* renamed from: e */
    public C7347b f13815e;
    @Nullable

    /* renamed from: f */
    public C7359f f13816f;
    @Nullable

    /* renamed from: g */
    public InterfaceC7363i f13817g;
    @Nullable

    /* renamed from: h */
    public C7356d0 f13818h;
    @Nullable

    /* renamed from: i */
    public C7362h f13819i;
    @Nullable

    /* renamed from: j */
    public C7345a0 f13820j;
    @Nullable

    /* renamed from: k */
    public InterfaceC7363i f13821k;

    public C7371o(Context context, InterfaceC7363i interfaceC7363i) {
        this.f13811a = context.getApplicationContext();
        interfaceC7363i.getClass();
        this.f13813c = interfaceC7363i;
        this.f13812b = new ArrayList();
    }

    /* renamed from: n */
    public static void m5155n(@Nullable InterfaceC7363i interfaceC7363i, InterfaceC7351c0 interfaceC7351c0) {
        if (interfaceC7363i != null) {
            interfaceC7363i.mo5158c(interfaceC7351c0);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: c */
    public final void mo5158c(InterfaceC7351c0 interfaceC7351c0) {
        interfaceC7351c0.getClass();
        this.f13813c.mo5158c(interfaceC7351c0);
        this.f13812b.add(interfaceC7351c0);
        m5155n(this.f13814d, interfaceC7351c0);
        m5155n(this.f13815e, interfaceC7351c0);
        m5155n(this.f13816f, interfaceC7351c0);
        m5155n(this.f13817g, interfaceC7351c0);
        m5155n(this.f13818h, interfaceC7351c0);
        m5155n(this.f13819i, interfaceC7351c0);
        m5155n(this.f13820j, interfaceC7351c0);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    public final void close() throws IOException {
        InterfaceC7363i interfaceC7363i = this.f13821k;
        if (interfaceC7363i != null) {
            try {
                interfaceC7363i.close();
            } finally {
                this.f13821k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: g */
    public final long mo5146g(DataSpec dataSpec) throws IOException {
        boolean z;
        InterfaceC7363i interfaceC7363i;
        boolean z2 = true;
        if (this.f13821k == null) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        String scheme = dataSpec.f13712a.getScheme();
        int i = C7408g0.f13905a;
        Uri uri = dataSpec.f13712a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z2 = false;
        }
        if (z2) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f13814d == null) {
                    C7376s c7376s = new C7376s();
                    this.f13814d = c7376s;
                    m5157l(c7376s);
                }
                interfaceC7363i = this.f13814d;
                this.f13821k = interfaceC7363i;
            }
            interfaceC7363i = m5156m();
            this.f13821k = interfaceC7363i;
        } else {
            if (!"asset".equals(scheme)) {
                boolean equals = "content".equals(scheme);
                Context context = this.f13811a;
                if (equals) {
                    if (this.f13816f == null) {
                        C7359f c7359f = new C7359f(context);
                        this.f13816f = c7359f;
                        m5157l(c7359f);
                    }
                    interfaceC7363i = this.f13816f;
                } else {
                    boolean equals2 = "rtmp".equals(scheme);
                    InterfaceC7363i interfaceC7363i2 = this.f13813c;
                    if (equals2) {
                        if (this.f13817g == null) {
                            try {
                                InterfaceC7363i interfaceC7363i3 = (InterfaceC7363i) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                                this.f13817g = interfaceC7363i3;
                                m5157l(interfaceC7363i3);
                            } catch (ClassNotFoundException unused) {
                                Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                            } catch (Exception e) {
                                throw new RuntimeException("Error instantiating RTMP extension", e);
                            }
                            if (this.f13817g == null) {
                                this.f13817g = interfaceC7363i2;
                            }
                        }
                        interfaceC7363i = this.f13817g;
                    } else if ("udp".equals(scheme)) {
                        if (this.f13818h == null) {
                            C7356d0 c7356d0 = new C7356d0();
                            this.f13818h = c7356d0;
                            m5157l(c7356d0);
                        }
                        interfaceC7363i = this.f13818h;
                    } else if ("data".equals(scheme)) {
                        if (this.f13819i == null) {
                            C7362h c7362h = new C7362h();
                            this.f13819i = c7362h;
                            m5157l(c7362h);
                        }
                        interfaceC7363i = this.f13819i;
                    } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                        this.f13821k = interfaceC7363i2;
                    } else {
                        if (this.f13820j == null) {
                            C7345a0 c7345a0 = new C7345a0(context);
                            this.f13820j = c7345a0;
                            m5157l(c7345a0);
                        }
                        interfaceC7363i = this.f13820j;
                    }
                }
                this.f13821k = interfaceC7363i;
            }
            interfaceC7363i = m5156m();
            this.f13821k = interfaceC7363i;
        }
        return this.f13821k.mo5146g(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    /* renamed from: h */
    public final Map<String, List<String>> mo5154h() {
        InterfaceC7363i interfaceC7363i = this.f13821k;
        return interfaceC7363i == null ? Collections.emptyMap() : interfaceC7363i.mo5154h();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7363i
    @Nullable
    /* renamed from: k */
    public final Uri mo5145k() {
        InterfaceC7363i interfaceC7363i = this.f13821k;
        if (interfaceC7363i == null) {
            return null;
        }
        return interfaceC7363i.mo5145k();
    }

    /* renamed from: l */
    public final void m5157l(InterfaceC7363i interfaceC7363i) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f13812b;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC7363i.mo5158c((InterfaceC7351c0) arrayList.get(i));
            i++;
        }
    }

    /* renamed from: m */
    public final InterfaceC7363i m5156m() {
        if (this.f13815e == null) {
            C7347b c7347b = new C7347b(this.f13811a);
            this.f13815e = c7347b;
            m5157l(c7347b);
        }
        return this.f13815e;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC7361g
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        InterfaceC7363i interfaceC7363i = this.f13821k;
        interfaceC7363i.getClass();
        return interfaceC7363i.read(bArr, i, i2);
    }
}
