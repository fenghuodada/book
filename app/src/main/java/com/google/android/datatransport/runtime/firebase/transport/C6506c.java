package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* renamed from: com.google.android.datatransport.runtime.firebase.transport.c */
/* loaded from: classes.dex */
public final class C6506c {

    /* renamed from: a */
    public final long f10254a;

    /* renamed from: b */
    public final EnumC6507a f10255b;

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.c$a */
    /* loaded from: classes.dex */
    public enum EnumC6507a implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a */
        public final int f10264a;

        EnumC6507a(int i) {
            this.f10264a = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public final int getNumber() {
            return this.f10264a;
        }
    }

    public C6506c(long j, EnumC6507a enumC6507a) {
        this.f10254a = j;
        this.f10255b = enumC6507a;
    }
}
