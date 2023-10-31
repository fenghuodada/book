package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;

/* loaded from: classes.dex */
public interface DrmSession {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface State {
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmSession$a */
    /* loaded from: classes.dex */
    public static class C6760a extends IOException {

        /* renamed from: a */
        public final int f10978a;

        public C6760a(Throwable th, int i) {
            super(th);
            this.f10978a = i;
        }
    }

    /* renamed from: a */
    void mo5978a(@Nullable InterfaceC6789n.C6790a c6790a);

    /* renamed from: b */
    void mo5977b(@Nullable InterfaceC6789n.C6790a c6790a);

    /* renamed from: c */
    UUID mo5976c();

    /* renamed from: d */
    boolean mo5975d();

    @Nullable
    /* renamed from: e */
    InterfaceC6800u mo5974e();

    @Nullable
    C6760a getError();

    int getState();
}
