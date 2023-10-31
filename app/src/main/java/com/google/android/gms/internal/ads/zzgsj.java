package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import okhttp3.internal.p064ws.WebSocketProtocol;

/* loaded from: classes.dex */
final class zzgsj implements zzgpa {
    static final zzgpa zza = new zzgsj();

    private zzgsj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgpa
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE /* 1002 */:
                case 1003:
                case 1004:
                case WebSocketProtocol.CLOSE_NO_STATUS_CODE /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
