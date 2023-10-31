package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.InterfaceC0953j0;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.widget.n */
/* loaded from: classes.dex */
public final class C1059n implements InterfaceC0953j0 {
    @Override // androidx.core.view.InterfaceC0953j0
    @Nullable
    /* renamed from: a */
    public final ContentInfoCompat mo11242a(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.f2505a.mo11785d() == 2) {
            return contentInfoCompat;
        }
        ContentInfoCompat.InterfaceC0809e interfaceC0809e = contentInfoCompat.f2505a;
        ClipData mo11788a = interfaceC0809e.mo11788a();
        int mo11787b = interfaceC0809e.mo11787b();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < mo11788a.getItemCount(); i++) {
            ClipData.Item itemAt = mo11788a.getItemAt(i);
            if ((mo11787b & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (!z) {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                }
            }
        }
        return null;
    }
}
