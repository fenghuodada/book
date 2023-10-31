package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.C7121n0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface SampleStream {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ReadDataResult {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ReadFlags {
    }

    /* renamed from: a */
    int mo5436a(C7121n0 c7121n0, DecoderInputBuffer decoderInputBuffer, int i);

    /* renamed from: b */
    void mo5435b() throws IOException;

    /* renamed from: c */
    int mo5434c(long j);

    /* renamed from: d */
    boolean mo5433d();
}
