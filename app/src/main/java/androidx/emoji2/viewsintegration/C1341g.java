package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.g */
/* loaded from: classes.dex */
public final class C1341g implements TextWatcher {

    /* renamed from: a */
    public final EditText f3246a;

    /* renamed from: c */
    public C1342a f3248c;

    /* renamed from: b */
    public final boolean f3247b = false;

    /* renamed from: d */
    public boolean f3249d = true;

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.viewsintegration.g$a */
    /* loaded from: classes.dex */
    public static class C1342a extends EmojiCompat.AbstractC1285e {

        /* renamed from: a */
        public final WeakReference f3250a;

        public C1342a(EditText editText) {
            this.f3250a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.AbstractC1285e
        /* renamed from: b */
        public final void mo10645b() {
            C1341g.m10646a((EditText) this.f3250a.get(), 1);
        }
    }

    public C1341g(EditText editText) {
        this.f3246a = editText;
    }

    /* renamed from: a */
    public static void m10646a(@Nullable EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat m10693a = EmojiCompat.m10693a();
            if (editableText == null) {
                length = 0;
            } else {
                m10693a.getClass();
                length = editableText.length();
            }
            m10693a.m10688f(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f3246a
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.f3249d
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f3247b
            r3 = 0
            if (r1 != 0) goto L1c
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.f3154j
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            androidx.emoji2.text.EmojiCompat r7 = androidx.emoji2.text.EmojiCompat.m10693a()
            int r7 = r7.m10692b()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.EmojiCompat r7 = androidx.emoji2.text.EmojiCompat.m10693a()
            int r8 = r8 + r6
            r7.m10688f(r6, r8, r5)
            goto L54
        L40:
            androidx.emoji2.text.EmojiCompat r5 = androidx.emoji2.text.EmojiCompat.m10693a()
            androidx.emoji2.viewsintegration.g$a r6 = r4.f3248c
            if (r6 != 0) goto L4f
            androidx.emoji2.viewsintegration.g$a r6 = new androidx.emoji2.viewsintegration.g$a
            r6.<init>(r0)
            r4.f3248c = r6
        L4f:
            androidx.emoji2.viewsintegration.g$a r6 = r4.f3248c
            r5.m10687g(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.viewsintegration.C1341g.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
