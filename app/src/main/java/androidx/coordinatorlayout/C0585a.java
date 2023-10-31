package androidx.coordinatorlayout;

import android.media.MediaFormat;
import androidx.constraintlayout.core.C0510h;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.a */
/* loaded from: classes.dex */
public final class C0585a {
    /* renamed from: a */
    public static int m12131a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public static void m12130b(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: c */
    public static void m12129c(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C0510h.m12340a(15, "csd-", i), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }
}
