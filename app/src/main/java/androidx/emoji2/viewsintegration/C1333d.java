package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.d */
/* loaded from: classes.dex */
public final class C1333d implements InputFilter {

    /* renamed from: a */
    public final TextView f3235a;

    /* renamed from: b */
    public C1334a f3236b;

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.viewsintegration.d$a */
    /* loaded from: classes.dex */
    public static class C1334a extends EmojiCompat.AbstractC1285e {

        /* renamed from: a */
        public final WeakReference f3237a;

        /* renamed from: b */
        public final WeakReference f3238b;

        public C1334a(TextView textView, C1333d c1333d) {
            this.f3237a = new WeakReference(textView);
            this.f3238b = new WeakReference(c1333d);
        }

        @Override // androidx.emoji2.text.EmojiCompat.AbstractC1285e
        /* renamed from: b */
        public final void mo10645b() {
            boolean z;
            int length;
            InputFilter[] filters;
            TextView textView = (TextView) this.f3237a.get();
            InputFilter inputFilter = (InputFilter) this.f3238b.get();
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z && textView.isAttachedToWindow()) {
                CharSequence text = textView.getText();
                EmojiCompat m10693a = EmojiCompat.m10693a();
                if (text == null) {
                    length = 0;
                } else {
                    m10693a.getClass();
                    length = text.length();
                }
                CharSequence m10688f = m10693a.m10688f(0, length, text);
                if (text == m10688f) {
                    return;
                }
                int selectionStart = Selection.getSelectionStart(m10688f);
                int selectionEnd = Selection.getSelectionEnd(m10688f);
                textView.setText(m10688f);
                if (m10688f instanceof Spannable) {
                    Spannable spannable = (Spannable) m10688f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public C1333d(@NonNull TextView textView) {
        this.f3235a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f3235a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int m10692b = EmojiCompat.m10693a().m10692b();
        if (m10692b != 0) {
            boolean z = true;
            if (m10692b != 1) {
                if (m10692b != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return EmojiCompat.m10693a().m10688f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        EmojiCompat m10693a = EmojiCompat.m10693a();
        if (this.f3236b == null) {
            this.f3236b = new C1334a(textView, this);
        }
        m10693a.m10687g(this.f3236b);
        return charSequence;
    }
}
