package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

@RequiresApi(24)
/* renamed from: androidx.appcompat.widget.w */
/* loaded from: classes.dex */
public final class C0423w {
    @DoNotInline
    /* renamed from: a */
    public static boolean m12486a(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        ContentInfoCompat.InterfaceC0806b c0807c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0807c = new ContentInfoCompat.C0805a(clipData, 3);
            } else {
                c0807c = new ContentInfoCompat.C0807c(clipData, 3);
            }
            ViewCompat.m11775j(textView, c0807c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    @DoNotInline
    /* renamed from: b */
    public static boolean m12485b(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        ContentInfoCompat.InterfaceC0806b c0807c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0807c = new ContentInfoCompat.C0805a(clipData, 3);
        } else {
            c0807c = new ContentInfoCompat.C0807c(clipData, 3);
        }
        ViewCompat.m11775j(view, c0807c.build());
        return true;
    }
}
