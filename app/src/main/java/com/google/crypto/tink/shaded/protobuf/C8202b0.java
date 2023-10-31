package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
/* loaded from: classes3.dex */
public class C8202b0 extends IOException {

    /* renamed from: a */
    public static final /* synthetic */ int f15951a = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.b0$a */
    /* loaded from: classes3.dex */
    public static class C8203a extends C8202b0 {
        public C8203a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public C8202b0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C8202b0 m3930a() {
        return new C8202b0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static C8203a m3929b() {
        return new C8203a();
    }

    /* renamed from: c */
    public static C8202b0 m3928c() {
        return new C8202b0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static C8202b0 m3927d() {
        return new C8202b0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static C8202b0 m3926e() {
        return new C8202b0("Failed to parse the message.");
    }

    /* renamed from: f */
    public static C8202b0 m3925f() {
        return new C8202b0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
