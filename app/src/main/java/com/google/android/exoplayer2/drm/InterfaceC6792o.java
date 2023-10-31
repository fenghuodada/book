package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.profileinstaller.C1544f;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.C7003m0;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6789n;

/* renamed from: com.google.android.exoplayer2.drm.o */
/* loaded from: classes.dex */
public interface InterfaceC6792o {

    /* renamed from: a */
    public static final C6793a f11046a = new C6793a();

    /* renamed from: com.google.android.exoplayer2.drm.o$a */
    /* loaded from: classes.dex */
    public class C6793a implements InterfaceC6792o {
        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
        /* renamed from: a */
        public final /* synthetic */ InterfaceC6794b mo5986a(Looper looper, InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0) {
            return InterfaceC6794b.f11047a;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
        @Nullable
        /* renamed from: b */
        public final DrmSession mo5985b(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0) {
            if (c7003m0.f12290o == null) {
                return null;
            }
            return new C6799t(new DrmSession.C6760a(new UnsupportedDrmException(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
        @Nullable
        /* renamed from: c */
        public final Class<C6775c0> mo5984c(C7003m0 c7003m0) {
            if (c7003m0.f12290o != null) {
                return C6775c0.class;
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
        public final /* synthetic */ void prepare() {
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC6792o
        public final /* synthetic */ void release() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.o$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6794b {

        /* renamed from: a */
        public static final C1544f f11047a = new C1544f();

        void release();
    }

    /* renamed from: a */
    InterfaceC6794b mo5986a(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0);

    @Nullable
    /* renamed from: b */
    DrmSession mo5985b(Looper looper, @Nullable InterfaceC6789n.C6790a c6790a, C7003m0 c7003m0);

    @Nullable
    /* renamed from: c */
    Class<? extends InterfaceC6800u> mo5984c(C7003m0 c7003m0);

    void prepare();

    void release();
}
