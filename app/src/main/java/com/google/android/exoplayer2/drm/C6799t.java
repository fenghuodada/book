package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.InterfaceC6789n;
import java.util.UUID;

/* renamed from: com.google.android.exoplayer2.drm.t */
/* loaded from: classes.dex */
public final class C6799t implements DrmSession {

    /* renamed from: a */
    public final DrmSession.C6760a f11048a;

    public C6799t(DrmSession.C6760a c6760a) {
        this.f11048a = c6760a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: a */
    public final void mo5978a(@Nullable InterfaceC6789n.C6790a c6790a) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: b */
    public final void mo5977b(@Nullable InterfaceC6789n.C6790a c6790a) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: c */
    public final UUID mo5976c() {
        return C6622C.f10466a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* renamed from: d */
    public final boolean mo5975d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    /* renamed from: e */
    public final InterfaceC6800u mo5974e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.C6760a getError() {
        return this.f11048a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }
}
