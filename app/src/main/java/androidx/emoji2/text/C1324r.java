package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.text.C0787j;
import p060j$.util.stream.IntStream;

/* renamed from: androidx.emoji2.text.r */
/* loaded from: classes.dex */
public final class C1324r implements Spannable {

    /* renamed from: a */
    public boolean f3225a = false;
    @NonNull

    /* renamed from: b */
    public Spannable f3226b;

    /* renamed from: androidx.emoji2.text.r$a */
    /* loaded from: classes.dex */
    public static class C1325a {
        /* renamed from: a */
        public boolean mo10653a(Spannable spannable) {
            return spannable instanceof C0787j;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.emoji2.text.r$b */
    /* loaded from: classes.dex */
    public static class C1326b extends C1325a {
        @Override // androidx.emoji2.text.C1324r.C1325a
        /* renamed from: a */
        public final boolean mo10653a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof C0787j);
        }
    }

    public C1324r(@NonNull Spannable spannable) {
        this.f3226b = spannable;
    }

    public C1324r(@NonNull CharSequence charSequence) {
        this.f3226b = new SpannableString(charSequence);
    }

    /* renamed from: a */
    public final void m10654a() {
        C1325a c1326b;
        Spannable spannable = this.f3226b;
        if (!this.f3225a) {
            if (Build.VERSION.SDK_INT < 28) {
                c1326b = new C1325a();
            } else {
                c1326b = new C1326b();
            }
            if (c1326b.mo10653a(spannable)) {
                this.f3226b = new SpannableString(spannable);
            }
        }
        this.f3225a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f3226b.charAt(i);
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream chars() {
        return C1322p.m10656a(this.f3226b);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    @NonNull
    @RequiresApi(api = 24)
    public final IntStream codePoints() {
        return C1323q.m10655a(this.f3226b);
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f3226b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f3226b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f3226b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f3226b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f3226b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3226b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m10654a();
        this.f3226b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        m10654a();
        this.f3226b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final CharSequence subSequence(int i, int i2) {
        return this.f3226b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        return this.f3226b.toString();
    }
}
