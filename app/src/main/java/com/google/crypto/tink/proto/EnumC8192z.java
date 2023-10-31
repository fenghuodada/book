package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.C8196a0;

/* renamed from: com.google.crypto.tink.proto.z */
/* loaded from: classes3.dex */
public enum EnumC8192z implements C8196a0.InterfaceC8197a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a */
    public final int f15947a;

    EnumC8192z(int i) {
        this.f15947a = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8197a
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f15947a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
