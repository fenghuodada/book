package com.google.android.datatransport.cct;

import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.gson.internal.InterfaceC8676o;
import java.util.TreeSet;

/* renamed from: com.google.android.datatransport.cct.d */
/* loaded from: classes.dex */
public final class C6436d implements InterfaceC8676o {
    /* renamed from: b */
    public static String m6351b(AbstractC8228i abstractC8228i) {
        String str;
        StringBuilder sb = new StringBuilder(abstractC8228i.size());
        for (int i = 0; i < abstractC8228i.size(); i++) {
            int mo3819a = abstractC8228i.mo3819a(i);
            if (mo3819a != 34) {
                if (mo3819a != 39) {
                    if (mo3819a != 92) {
                        switch (mo3819a) {
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
                                if (mo3819a < 32 || mo3819a > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((mo3819a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo3819a >>> 3) & 7) + 48));
                                    mo3819a = (mo3819a & 7) + 48;
                                }
                                sb.append((char) mo3819a);
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

    /* renamed from: c */
    public static String m6350c(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    @Override // com.google.gson.internal.InterfaceC8676o
    /* renamed from: a */
    public Object mo3242a() {
        return new TreeSet();
    }
}
