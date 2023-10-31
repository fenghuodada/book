package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C1319n extends SpannableStringBuilder {
    @NonNull

    /* renamed from: a */
    public final Class<?> f3221a;
    @NonNull

    /* renamed from: b */
    public final ArrayList f3222b;

    /* renamed from: androidx.emoji2.text.n$a */
    /* loaded from: classes.dex */
    public static class C1320a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        public final Object f3223a;

        /* renamed from: b */
        public final AtomicInteger f3224b = new AtomicInteger(0);

        public C1320a(Object obj) {
            this.f3223a = obj;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f3223a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3223a).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3224b.get() > 0 && (obj instanceof AbstractC1310i)) {
                return;
            }
            ((SpanWatcher) this.f3223a).onSpanAdded(spannable, obj, i, i2);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f3224b.get() > 0 && (obj instanceof AbstractC1310i)) {
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.f3223a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.f3223a).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }

        @Override // android.text.SpanWatcher
        public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f3224b.get() > 0 && (obj instanceof AbstractC1310i)) {
                return;
            }
            ((SpanWatcher) this.f3223a).onSpanRemoved(spannable, obj, i, i2);
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f3223a).onTextChanged(charSequence, i, i2, i3);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public C1319n(@NonNull Class<?> cls, @NonNull CharSequence charSequence) {
        super(charSequence);
        this.f3222b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f3221a = cls;
    }

    /* renamed from: a */
    public final void m10661a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3222b;
            if (i < arrayList.size()) {
                ((C1320a) arrayList.get(i)).f3224b.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: b */
    public final void m10660b() {
        m10657e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3222b;
            if (i < arrayList.size()) {
                ((C1320a) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final C1320a m10659c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3222b;
            if (i >= arrayList.size()) {
                return null;
            }
            C1320a c1320a = (C1320a) arrayList.get(i);
            if (c1320a.f3223a == obj) {
                return c1320a;
            }
            i++;
        }
    }

    /* renamed from: d */
    public final boolean m10658d(@Nullable Object obj) {
        boolean z;
        if (obj == null) {
            return false;
        }
        if (this.f3221a == obj.getClass()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: e */
    public final void m10657e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3222b;
            if (i < arrayList.size()) {
                ((C1320a) arrayList.get(i)).f3224b.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(@Nullable Object obj) {
        C1320a m10659c;
        if (m10658d(obj) && (m10659c = m10659c(obj)) != null) {
            obj = m10659c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(@Nullable Object obj) {
        C1320a m10659c;
        if (m10658d(obj) && (m10659c = m10659c(obj)) != null) {
            obj = m10659c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(@Nullable Object obj) {
        C1320a m10659c;
        if (m10658d(obj) && (m10659c = m10659c(obj)) != null) {
            obj = m10659c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public final <T> T[] getSpans(int i, int i2, @NonNull Class<T> cls) {
        boolean z;
        if (this.f3221a == cls) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1320a[] c1320aArr = (C1320a[]) super.getSpans(i, i2, C1320a.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c1320aArr.length));
            for (int i3 = 0; i3 < c1320aArr.length; i3++) {
                tArr[i3] = c1320aArr[i3].f3223a;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if (r0 != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, @androidx.annotation.Nullable java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.f3221a
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<androidx.emoji2.text.n$a> r4 = androidx.emoji2.text.C1319n.C1320a.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1319n.nextSpanTransition(int, int, java.lang.Class):int");
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(@Nullable Object obj) {
        C1320a c1320a;
        if (m10658d(obj)) {
            c1320a = m10659c(obj);
            if (c1320a != null) {
                obj = c1320a;
            }
        } else {
            c1320a = null;
        }
        super.removeSpan(obj);
        if (c1320a != null) {
            this.f3222b.remove(c1320a);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m10661a();
        super.replace(i, i2, charSequence);
        m10657e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m10661a();
        super.replace(i, i2, charSequence, i3, i4);
        m10657e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(@Nullable Object obj, int i, int i2, int i3) {
        if (m10658d(obj)) {
            C1320a c1320a = new C1320a(obj);
            this.f3222b.add(c1320a);
            obj = c1320a;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public final CharSequence subSequence(int i, int i2) {
        return new C1319n(this.f3221a, this, i, i2);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    public C1319n(@NonNull Class<?> cls, @NonNull CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f3222b = new ArrayList();
        if (cls == null) {
            throw new NullPointerException("watcherClass cannot be null");
        }
        this.f3221a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(char c) throws IOException {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @NonNull
    public final Appendable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }
}
