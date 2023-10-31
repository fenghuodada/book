package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.c0 */
/* loaded from: classes.dex */
public class C1163c0 extends IOException {

    /* renamed from: a */
    public static final /* synthetic */ int f2947a = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.c0$a */
    /* loaded from: classes.dex */
    public static class C1164a extends C1163c0 {
        public C1164a() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public C1163c0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C1163c0 m11139a() {
        return new C1163c0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: b */
    public static C1164a m11138b() {
        return new C1164a();
    }

    /* renamed from: c */
    public static C1163c0 m11137c() {
        return new C1163c0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    public static C1163c0 m11136d() {
        return new C1163c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    public static C1163c0 m11135e() {
        return new C1163c0("Failed to parse the message.");
    }

    /* renamed from: f */
    public static C1163c0 m11134f() {
        return new C1163c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
