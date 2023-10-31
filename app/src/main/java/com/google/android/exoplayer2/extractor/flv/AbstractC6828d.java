package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C7506y0;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.C7436v;

/* renamed from: com.google.android.exoplayer2.extractor.flv.d */
/* loaded from: classes.dex */
public abstract class AbstractC6828d {

    /* renamed from: a */
    public final TrackOutput f11173a;

    /* renamed from: com.google.android.exoplayer2.extractor.flv.d$a */
    /* loaded from: classes.dex */
    public static final class C6829a extends C7506y0 {
        public C6829a(String str) {
            super(str, null, false, 1);
        }
    }

    public AbstractC6828d(TrackOutput trackOutput) {
        this.f11173a = trackOutput;
    }

    /* renamed from: a */
    public abstract boolean mo5937a(C7436v c7436v) throws C7506y0;

    /* renamed from: b */
    public abstract boolean mo5936b(long j, C7436v c7436v) throws C7506y0;
}
