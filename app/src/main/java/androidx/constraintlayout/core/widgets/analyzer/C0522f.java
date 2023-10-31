package androidx.constraintlayout.core.widgets.analyzer;

import com.google.android.exoplayer2.metadata.id3.C7080g;

/* renamed from: androidx.constraintlayout.core.widgets.analyzer.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C0522f implements C7080g.InterfaceC7081a {
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m12316b(Object obj, int i, int i2, int i3) {
        throw null;
    }

    /* renamed from: c */
    public static /* synthetic */ String m12315c(int i) {
        return i == 1 ? "UNKNOWN" : i == 2 ? "HORIZONTAL_DIMENSION" : i == 3 ? "VERTICAL_DIMENSION" : i == 4 ? "LEFT" : i == 5 ? "RIGHT" : i == 6 ? "TOP" : i == 7 ? "BOTTOM" : i == 8 ? "BASELINE" : "null";
    }

    @Override // com.google.android.exoplayer2.metadata.id3.C7080g.InterfaceC7081a
    /* renamed from: a */
    public boolean mo5512a(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }
}
