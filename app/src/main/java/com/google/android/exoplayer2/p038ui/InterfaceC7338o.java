package com.google.android.exoplayer2.p038ui;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.p038ui.C7325i;

/* renamed from: com.google.android.exoplayer2.ui.o */
/* loaded from: classes.dex */
public interface InterfaceC7338o {

    /* renamed from: com.google.android.exoplayer2.ui.o$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7339a {
        /* renamed from: d */
        void mo5184d(long j);

        /* renamed from: e */
        void mo5183e(long j);

        /* renamed from: g */
        void mo5182g(long j, boolean z);
    }

    /* renamed from: a */
    void mo5186a(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    /* renamed from: b */
    void mo5185b(C7325i.View$OnClickListenerC7327b view$OnClickListenerC7327b);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
