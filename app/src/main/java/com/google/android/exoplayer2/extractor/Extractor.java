package com.google.android.exoplayer2.extractor;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface Extractor {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ReadResult {
    }

    /* renamed from: b */
    boolean mo5807b(InterfaceC6832h interfaceC6832h) throws IOException;

    /* renamed from: e */
    int mo5806e(InterfaceC6832h interfaceC6832h, C6904s c6904s) throws IOException;

    /* renamed from: f */
    void mo5805f(InterfaceC6833i interfaceC6833i);

    /* renamed from: g */
    void mo5804g(long j, long j2);

    void release();
}
