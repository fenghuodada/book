package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* renamed from: androidx.core.content.res.e */
/* loaded from: classes.dex */
public final class C0675e {

    /* renamed from: a */
    public final int[] f2354a;

    /* renamed from: b */
    public final float[] f2355b;

    public C0675e(@ColorInt int i, @ColorInt int i2) {
        this.f2354a = new int[]{i, i2};
        this.f2355b = new float[]{0.0f, 1.0f};
    }

    public C0675e(@ColorInt int i, @ColorInt int i2, @ColorInt int i3) {
        this.f2354a = new int[]{i, i2, i3};
        this.f2355b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0675e(@NonNull ArrayList arrayList, @NonNull ArrayList arrayList2) {
        int size = arrayList.size();
        this.f2354a = new int[size];
        this.f2355b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f2354a[i] = ((Integer) arrayList.get(i)).intValue();
            this.f2355b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }
}
