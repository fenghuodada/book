package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1183i;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.u0 */
/* loaded from: classes.dex */
public final class C1257u0 {
    /* renamed from: a */
    public static final String m10777a(String str) {
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
    public static final void m10776b(StringBuilder sb, int i, String str, Object obj) {
        String obj2;
        String m10896b;
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                m10776b(sb, i, str, obj3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m10776b(sb, i, str, entry);
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
                AbstractC1183i.C1188e c1188e = AbstractC1183i.f2982b;
                m10896b = C1220m1.m10896b(new AbstractC1183i.C1188e(((String) obj).getBytes(C1157b0.f2944a)));
            } else if (obj instanceof AbstractC1183i) {
                sb.append(": \"");
                m10896b = C1220m1.m10896b((AbstractC1183i) obj);
            } else {
                if (obj instanceof AbstractC1273z) {
                    sb.append(" {");
                    m10775c((AbstractC1273z) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i4 = i + 2;
                    m10776b(sb, i4, "key", entry2.getKey());
                    m10776b(sb, i4, "value", entry2.getValue());
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
            sb.append(m10896b);
            sb.append('\"');
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ad, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d0, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fe, code lost:
        r7 = true;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m10775c(androidx.datastore.preferences.protobuf.InterfaceC1240s0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1257u0.m10775c(androidx.datastore.preferences.protobuf.s0, java.lang.StringBuilder, int):void");
    }
}
