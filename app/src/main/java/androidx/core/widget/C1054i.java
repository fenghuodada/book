package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public final class C1054i {
    @DoNotInline
    /* renamed from: a */
    public static boolean m11251a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    @DoNotInline
    /* renamed from: b */
    public static void m11250b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
