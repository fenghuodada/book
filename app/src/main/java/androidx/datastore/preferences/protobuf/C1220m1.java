package androidx.datastore.preferences.protobuf;

import com.google.gson.internal.InterfaceC8676o;
import java.util.LinkedHashSet;

/* renamed from: androidx.datastore.preferences.protobuf.m1 */
/* loaded from: classes.dex */
public final class C1220m1 implements InterfaceC8676o {
    /* renamed from: b */
    public static String m10896b(AbstractC1183i abstractC1183i) {
        String str;
        StringBuilder sb = new StringBuilder(abstractC1183i.size());
        for (int i = 0; i < abstractC1183i.size(); i++) {
            int mo11119a = abstractC1183i.mo11119a(i);
            if (mo11119a != 34) {
                if (mo11119a != 39) {
                    if (mo11119a != 92) {
                        switch (mo11119a) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (mo11119a < 32 || mo11119a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((mo11119a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo11119a >>> 3) & 7) + 48));
                                    mo11119a = (mo11119a & 7) + 48;
                                }
                                sb.append((char) mo11119a);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // com.google.gson.internal.InterfaceC8676o
    /* renamed from: a */
    public Object mo3242a() {
        return new LinkedHashSet();
    }
}
