package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zzazk implements zzgoy {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);
    
    private static final zzgoz zzg = new zzgoz() { // from class: com.google.android.gms.internal.ads.zzazi
    };
    private final int zzi;

    zzazk(int i) {
        this.zzi = i;
    }

    public static zzazk zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SUSPENDED;
                        }
                        return DISCONNECTED;
                    }
                    return DISCONNECTING;
                }
                return CONNECTED;
            }
            return CONNECTING;
        }
        return UNSPECIFIED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
