package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.C7408g0;

/* renamed from: com.google.android.exoplayer2.decoder.c */
/* loaded from: classes.dex */
public final class C6744c {
    @Nullable

    /* renamed from: a */
    public byte[] f10916a;
    @Nullable

    /* renamed from: b */
    public byte[] f10917b;

    /* renamed from: c */
    public int f10918c;
    @Nullable

    /* renamed from: d */
    public int[] f10919d;
    @Nullable

    /* renamed from: e */
    public int[] f10920e;

    /* renamed from: f */
    public int f10921f;

    /* renamed from: g */
    public int f10922g;

    /* renamed from: h */
    public int f10923h;

    /* renamed from: i */
    public final MediaCodec.CryptoInfo f10924i;
    @Nullable

    /* renamed from: j */
    public final C6745a f10925j;

    @RequiresApi(24)
    /* renamed from: com.google.android.exoplayer2.decoder.c$a */
    /* loaded from: classes.dex */
    public static final class C6745a {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f10926a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f10927b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public C6745a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f10926a = cryptoInfo;
        }
    }

    public C6744c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f10924i = cryptoInfo;
        this.f10925j = C7408g0.f13905a >= 24 ? new C6745a(cryptoInfo) : null;
    }
}
