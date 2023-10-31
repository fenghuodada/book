package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.C6748f;
import com.google.android.exoplayer2.text.C7237g;

/* renamed from: com.google.android.exoplayer2.decoder.d */
/* loaded from: classes.dex */
public interface InterfaceC6746d<I, O, E extends C6748f> {
    @Nullable
    /* renamed from: b */
    O mo5352b() throws C6748f;

    @Nullable
    /* renamed from: c */
    I mo5351c() throws C6748f;

    /* renamed from: d */
    void mo5350d(C7237g c7237g) throws C6748f;

    void flush();

    void release();
}
