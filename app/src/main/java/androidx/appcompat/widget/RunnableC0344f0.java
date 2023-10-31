package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.f0 */
/* loaded from: classes.dex */
public final class RunnableC0344f0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TextView f1232a;

    /* renamed from: b */
    public final /* synthetic */ Typeface f1233b;

    /* renamed from: c */
    public final /* synthetic */ int f1234c;

    public RunnableC0344f0(TextView textView, Typeface typeface, int i) {
        this.f1232a = textView;
        this.f1233b = typeface;
        this.f1234c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1232a.setTypeface(this.f1233b, this.f1234c);
    }
}
