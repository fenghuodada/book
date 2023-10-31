package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.appcompat.widget.d0 */
/* loaded from: classes.dex */
public final class C0321d0 {
    @NonNull

    /* renamed from: a */
    public final TextView f1168a;
    @Nullable

    /* renamed from: b */
    public TextClassifier f1169b;

    @RequiresApi(26)
    /* renamed from: androidx.appcompat.widget.d0$a */
    /* loaded from: classes.dex */
    public static final class C0322a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static TextClassifier m12691a(@NonNull TextView textView) {
            TextClassifier textClassifier;
            TextClassifier textClassifier2;
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                textClassifier2 = textClassificationManager.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
    }

    public C0321d0(@NonNull TextView textView) {
        textView.getClass();
        this.f1168a = textView;
    }
}
