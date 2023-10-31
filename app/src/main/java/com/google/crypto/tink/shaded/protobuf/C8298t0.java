package com.google.crypto.tink.shaded.protobuf;

import com.google.android.datatransport.cct.C6436d;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.t0 */
/* loaded from: classes3.dex */
public final class C8298t0 {
    /* renamed from: a */
    public static final String m3545a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static final void m3544b(StringBuilder sb, int i, String str, Object obj) {
        String obj2;
        String m6351b;
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                m3544b(sb, i, str, obj3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m3544b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                AbstractC8228i.C8234f c8234f = AbstractC8228i.f15998b;
                m6351b = C6436d.m6351b(new AbstractC8228i.C8234f(((String) obj).getBytes(C8196a0.f15949a)));
            } else if (obj instanceof AbstractC8228i) {
                sb.append(": \"");
                m6351b = C6436d.m6351b((AbstractC8228i) obj);
            } else {
                if (obj instanceof AbstractC8308y) {
                    sb.append(" {");
                    m3543c((AbstractC8308y) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i4 = i + 2;
                    m3544b(sb, i4, "key", entry2.getKey());
                    m3544b(sb, i4, "value", entry2.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    obj2 = obj.toString();
                    sb.append(obj2);
                    return;
                }
                obj2 = "}";
                sb.append(obj2);
                return;
            }
            sb.append(m6351b);
            sb.append('\"');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ab, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bc, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ce, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01fe, code lost:
        r6 = true;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m3543c(com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8298t0.m3543c(com.google.crypto.tink.shaded.protobuf.r0, java.lang.StringBuilder, int):void");
    }
}
