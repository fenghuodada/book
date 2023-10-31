package androidx.emoji2.viewsintegration;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.flatbuffer.C1304b;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.c */
/* loaded from: classes.dex */
public final class C1331c extends InputConnectionWrapper {

    /* renamed from: a */
    public final TextView f3233a;

    /* renamed from: b */
    public final C1332a f3234b;

    /* renamed from: androidx.emoji2.viewsintegration.c$a */
    /* loaded from: classes.dex */
    public static class C1332a {
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0050, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0080, code lost:
            if (r11 != false) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x008d, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L67;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static boolean m10652a(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r7, @androidx.annotation.NonNull android.text.Editable r8, @androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.IntRange(from = 0) int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.viewsintegration.C1331c.C1332a.m10652a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1331c(@NonNull EditText editText, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z;
        int i;
        C1332a c1332a = new C1332a();
        this.f3233a = editText;
        this.f3234b = c1332a;
        if (EmojiCompat.f3154j != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EmojiCompat m10693a = EmojiCompat.m10693a();
            if ((m10693a.m10692b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                EmojiCompat.C1281a c1281a = m10693a.f3159e;
                c1281a.getClass();
                Bundle bundle = editorInfo.extras;
                C1304b c1304b = c1281a.f3164c.f3215a;
                int m10677a = c1304b.m10677a(4);
                if (m10677a != 0) {
                    i = c1304b.f3186b.getInt(m10677a + c1304b.f3185a);
                } else {
                    i = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
                Bundle bundle2 = editorInfo.extras;
                c1281a.f3165a.getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f3233a.getEditableText();
        this.f3234b.getClass();
        if (!C1332a.m10652a(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f3233a.getEditableText();
        this.f3234b.getClass();
        if (C1332a.m10652a(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
