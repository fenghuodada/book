package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C8196a0;

/* renamed from: com.google.crypto.tink.proto.u */
/* loaded from: classes3.dex */
public enum EnumC8182u implements C8196a0.InterfaceC8197a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f15932a;

    EnumC8182u(int i) {
        this.f15932a = i;
    }

    /* renamed from: a */
    public static EnumC8182u m3966a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15932a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
