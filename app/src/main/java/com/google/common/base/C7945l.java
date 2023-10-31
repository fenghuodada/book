package com.google.common.base;

import androidx.activity.result.C0063d;
import com.google.common.annotations.GwtCompatible;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* renamed from: com.google.common.base.l */
/* loaded from: classes3.dex */
public final class C7945l {
    /* renamed from: a */
    public static String m4284a(@NullableDecl String str, @NullableDecl Object... objArr) {
        int indexOf;
        String sb;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            try {
                sb = String.valueOf(obj);
            } catch (Exception e) {
                String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                StringBuilder m13052b = C0063d.m13052b("<", str2, " threw ");
                m13052b.append(e.getClass().getName());
                m13052b.append(">");
                sb = m13052b.toString();
            }
            objArr[i2] = sb;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i3 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i3)) != -1) {
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
