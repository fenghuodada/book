package com.facebook.ads.redexgen.p036X;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.facebook.ads.redexgen.p036X.InterfaceC4651CN;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.CT */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC4654CT<T extends InterfaceC4651CN> {
    void closeSession(byte[] bArr);

    T createMediaCrypto(byte[] bArr) throws MediaCryptoException;

    InterfaceC4652CO getKeyRequest(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    InterfaceC4653CS getProvisionRequest();

    byte[] openSession() throws MediaDrmException;

    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void restoreKeys(byte[] bArr, byte[] bArr2);
}
