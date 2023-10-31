package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.analytics.C6654o;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import com.google.common.base.C7935d;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@RequiresApi(18)
/* renamed from: com.google.android.exoplayer2.drm.x */
/* loaded from: classes.dex */
public final class C6803x implements ExoMediaDrm {

    /* renamed from: d */
    public static final C6654o f11055d = new C6654o();

    /* renamed from: a */
    public final UUID f11056a;

    /* renamed from: b */
    public final MediaDrm f11057b;

    /* renamed from: c */
    public int f11058c;

    public C6803x(UUID uuid) throws UnsupportedSchemeException {
        UUID uuid2;
        uuid.getClass();
        C7394a.m5133b(!C6622C.f10467b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f11056a = uuid;
        MediaDrm mediaDrm = new MediaDrm((C7408g0.f13905a >= 27 || !C6622C.f10468c.equals(uuid)) ? uuid : uuid2);
        this.f11057b = mediaDrm;
        this.f11058c = 1;
        if (C6622C.f10469d.equals(uuid) && "ASUS_Z00AD".equals(C7408g0.f13908d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: a */
    public final Class<C6801v> mo5973a() {
        return C6801v.class;
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: b */
    public final Map<String, String> mo5972b(byte[] bArr) {
        return this.f11057b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: c */
    public final InterfaceC6800u mo5971c(byte[] bArr) throws MediaCryptoException {
        boolean z;
        int i = C7408g0.f13905a;
        UUID uuid = this.f11056a;
        if (i < 21 && C6622C.f10469d.equals(uuid) && "L3".equals(this.f11057b.getPropertyString("securityLevel"))) {
            z = true;
        } else {
            z = false;
        }
        if (i < 27 && C6622C.f10468c.equals(uuid)) {
            uuid = C6622C.f10467b;
        }
        return new C6801v(uuid, bArr, z);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: d */
    public final ExoMediaDrm.C6763c mo5970d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f11057b.getProvisionRequest();
        return new ExoMediaDrm.C6763c(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: e */
    public final byte[] mo5969e() throws MediaDrmException {
        return this.f11057b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: f */
    public final void mo5968f(byte[] bArr, byte[] bArr2) {
        this.f11057b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: g */
    public final void mo5967g(byte[] bArr) {
        this.f11057b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    @Nullable
    /* renamed from: h */
    public final byte[] mo5966h(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException {
        String str;
        if (C6622C.f10468c.equals(this.f11056a) && C7408g0.f13905a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, C7935d.f15693c));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = C7408g0.m5088r(sb.toString());
            } catch (JSONException e) {
                String str2 = new String(bArr2, C7935d.f15693c);
                if (str2.length() != 0) {
                    str = "Failed to adjust response data: ".concat(str2);
                } else {
                    str = new String("Failed to adjust response data: ");
                }
                C7421n.m5056b("ClearKeyUtil", str, e);
            }
        }
        return this.f11057b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: i */
    public final void mo5965i(byte[] bArr) throws DeniedByServerException {
        this.f11057b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: j */
    public final void mo5964j(@Nullable final DefaultDrmSessionManager.C6754a c6754a) {
        this.f11057b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: com.google.android.exoplayer2.drm.w
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                C6803x c6803x = C6803x.this;
                ExoMediaDrm.InterfaceC6761a interfaceC6761a = c6754a;
                c6803x.getClass();
                DefaultDrmSessionManager.HandlerC6755b handlerC6755b = DefaultDrmSessionManager.this.f10968x;
                handlerC6755b.getClass();
                handlerC6755b.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d5, code lost:
        if ("AFTT".equals(r6) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e2  */
    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest mo5963k(byte[] r17, @androidx.annotation.Nullable java.util.List<com.google.android.exoplayer2.drm.C6779g.C6781b> r18, int r19, @androidx.annotation.Nullable java.util.HashMap<java.lang.String, java.lang.String> r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.C6803x.mo5963k(byte[], java.util.List, int, java.util.HashMap):com.google.android.exoplayer2.drm.ExoMediaDrm$KeyRequest");
    }

    @Override // com.google.android.exoplayer2.drm.ExoMediaDrm
    public final synchronized void release() {
        int i = this.f11058c - 1;
        this.f11058c = i;
        if (i == 0) {
            this.f11057b.release();
        }
    }
}
