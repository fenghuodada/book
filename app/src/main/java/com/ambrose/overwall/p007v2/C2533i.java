package com.ambrose.overwall.p007v2;

import java.util.Arrays;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10929r;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\n_Ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ext.kt\ncom/ambrose/overwall/v2/_ExtKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,62:1\n215#2,2:63\n*S KotlinDebug\n*F\n+ 1 _Ext.kt\ncom/ambrose/overwall/v2/_ExtKt\n*L\n16#1:63,2\n*E\n"})
/* renamed from: com.ambrose.overwall.v2.i */
/* loaded from: classes.dex */
public final class C2533i {
    /* renamed from: a */
    public static final String m9381a(float f) {
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        C10843j.m431e(format, "format(this, *args)");
        if (format.length() <= 4) {
            return format;
        }
        String substring = format.substring(0, 4);
        C10843j.m431e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C10929r.m391A(".", substring);
    }

    @NotNull
    /* renamed from: b */
    public static final String m9380b(long j) {
        String m9381a;
        String str;
        if (j == 0) {
            return "\t0\tB";
        }
        int i = (j > 1000L ? 1 : (j == 1000L ? 0 : -1));
        float f = (float) j;
        if (i < 0) {
            m9381a = m9381a(f);
            str = "\tB";
        } else {
            float f2 = f / 1024.0f;
            if (f2 < 1000.0f) {
                m9381a = m9381a(f2);
                str = "\tKB";
            } else {
                float f3 = f2 / 1024.0f;
                if (f3 < 1000.0f) {
                    m9381a = m9381a(f3);
                    str = "\tMB";
                } else {
                    float f4 = f3 / 1024.0f;
                    if (f4 < 1000.0f) {
                        m9381a = m9381a(f4);
                        str = "\tGB";
                    } else {
                        float f5 = f4 / 1024.0f;
                        if (f5 < 1000.0f) {
                            m9381a = m9381a(f5);
                            str = "\tTB";
                        } else {
                            float f6 = f5 / 1024.0f;
                            if (f6 >= 1000.0f) {
                                return "∞";
                            }
                            m9381a = m9381a(f6);
                            str = "\tPB";
                        }
                    }
                }
            }
        }
        return m9381a.concat(str);
    }
}
