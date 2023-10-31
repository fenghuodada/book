package androidx.emoji2.viewsintegration;

import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.emoji2.viewsintegration.a */
/* loaded from: classes.dex */
public final class C1327a {

    /* renamed from: a */
    public final C1328a f3227a;

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.viewsintegration.a$a */
    /* loaded from: classes.dex */
    public static class C1328a extends C1329b {

        /* renamed from: a */
        public final EditText f3228a;

        /* renamed from: b */
        public final C1341g f3229b;

        public C1328a(@NonNull EditText editText) {
            this.f3228a = editText;
            C1341g c1341g = new C1341g(editText);
            this.f3229b = c1341g;
            editText.addTextChangedListener(c1341g);
            if (C1330b.f3231b == null) {
                synchronized (C1330b.f3230a) {
                    if (C1330b.f3231b == null) {
                        C1330b.f3231b = new C1330b();
                    }
                }
            }
            editText.setEditableFactory(C1330b.f3231b);
        }
    }

    /* renamed from: androidx.emoji2.viewsintegration.a$b */
    /* loaded from: classes.dex */
    public static class C1329b {
    }

    public C1327a(@NonNull EditText editText) {
        if (editText != null) {
            this.f3227a = new C1328a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }
}
