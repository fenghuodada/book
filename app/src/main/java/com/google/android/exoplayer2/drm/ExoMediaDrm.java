package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.C6779g;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public interface ExoMediaDrm {

    /* loaded from: classes.dex */
    public static final class KeyRequest {

        /* renamed from: a */
        public final byte[] f10979a;

        /* renamed from: b */
        public final String f10980b;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface RequestType {
        }

        public KeyRequest(String str, byte[] bArr) {
            this.f10979a = bArr;
            this.f10980b = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6761a {
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6762b {
        /* renamed from: a */
        ExoMediaDrm mo6005a(UUID uuid);
    }

    /* renamed from: com.google.android.exoplayer2.drm.ExoMediaDrm$c */
    /* loaded from: classes.dex */
    public static final class C6763c {

        /* renamed from: a */
        public final byte[] f10981a;

        /* renamed from: b */
        public final String f10982b;

        public C6763c(String str, byte[] bArr) {
            this.f10981a = bArr;
            this.f10982b = str;
        }
    }

    /* renamed from: a */
    Class<? extends InterfaceC6800u> mo5973a();

    /* renamed from: b */
    Map<String, String> mo5972b(byte[] bArr);

    /* renamed from: c */
    InterfaceC6800u mo5971c(byte[] bArr) throws MediaCryptoException;

    /* renamed from: d */
    C6763c mo5970d();

    /* renamed from: e */
    byte[] mo5969e() throws MediaDrmException;

    /* renamed from: f */
    void mo5968f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo5967g(byte[] bArr);

    @Nullable
    /* renamed from: h */
    byte[] mo5966h(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: i */
    void mo5965i(byte[] bArr) throws DeniedByServerException;

    /* renamed from: j */
    void mo5964j(@Nullable DefaultDrmSessionManager.C6754a c6754a);

    /* renamed from: k */
    KeyRequest mo5963k(byte[] bArr, @Nullable List<C6779g.C6781b> list, int i, @Nullable HashMap<String, String> hashMap) throws NotProvisionedException;

    void release();
}
