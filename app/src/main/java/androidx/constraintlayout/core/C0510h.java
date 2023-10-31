package androidx.constraintlayout.core;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.constraintlayout.core.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C0510h implements C7417m.InterfaceC7418a {
    /* renamed from: a */
    public static String m12340a(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: b */
    public static StringBuilder m12339b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onSeekProcessed();
    }
}
