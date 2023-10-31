package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.n */
/* loaded from: classes.dex */
public final class C0388n {

    /* renamed from: a */
    public static final int[] f1326a = {16843014, R.attr.elevation, R.attr.switcher_height, R.attr.switcher_icon_color, R.attr.switcher_off_color, R.attr.switcher_on_color, R.attr.switcher_width};

    /* renamed from: b */
    public static final /* synthetic */ int f1327b = 0;

    /* renamed from: a */
    public static void m12565a(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof InterfaceC0367j2) {
                editorInfo.hintText = ((InterfaceC0367j2) parent).m12603a();
                return;
            }
        }
    }
}
