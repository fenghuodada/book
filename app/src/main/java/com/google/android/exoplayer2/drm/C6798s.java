package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiresApi(18)
/* renamed from: com.google.android.exoplayer2.drm.s */
/* loaded from: classes.dex */
public final class C6798s implements ExoMediaDrm {
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: a */
    public final Class<C6775c0> mo5973a() {
        return C6775c0.class;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: b */
    public final Map<String, String> mo5972b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: c */
    public final InterfaceC6800u mo5971c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: d */
    public final ExoMediaDrm.C6763c mo5970d() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: e */
    public final byte[] mo5969e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: f */
    public final void mo5968f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: g */
    public final void mo5967g(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    /* renamed from: h */
    public final byte[] mo5966h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: i */
    public final void mo5965i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: j */
    public final void mo5964j(@Nullable DefaultDrmSessionManager.C6754a c6754a) {
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: k */
    public final ExoMediaDrm.KeyRequest mo5963k(byte[] bArr, @Nullable List<C6779g.C6781b> list, int i, @Nullable HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final void release() {
    }
}
