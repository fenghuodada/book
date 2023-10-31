package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C8196a0;

/* renamed from: com.google.crypto.tink.proto.i0 */
/* loaded from: classes3.dex */
public enum EnumC8153i0 implements C8196a0.InterfaceC8197a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f15924a;

    EnumC8153i0(int i) {
        this.f15924a = i;
    }

    /* renamed from: a */
    public static EnumC8153i0 m4033a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15924a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
